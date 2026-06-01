#!/usr/bin/env python3
"""
migrate_consolidate.py

Reverts per-row MaterialCardView wrappers back to plain LinearLayout.
Keeps the outer (section-level) MaterialCardView intact.

Strategy:
  - Any MCW that is NOT inside another MCW → "outer" (section card) → keep.
  - Any MCW found INSIDE another MCW → "per-row" → convert to LinearLayout
    with android:background = cardBackgroundColor.
"""

import os
from pathlib import Path
import xml.etree.ElementTree as ET
from copy import deepcopy

# Register namespace prefixes BEFORE any parsing so output uses android:/app: etc.
ET.register_namespace('android', 'http://schemas.android.com/apk/res/android')
ET.register_namespace('app',     'http://schemas.android.com/apk/res-auto')
ET.register_namespace('tools',   'http://schemas.android.com/tools')

AN  = 'http://schemas.android.com/apk/res/android'
APP = 'http://schemas.android.com/apk/res-auto'
MCW = 'com.google.android.material.card.MaterialCardView'

LAYOUT_DIR = Path('app/src/main/res/layout')


def a(name):
    return '{%s}%s' % (AN, name)


def ap(name):
    return '{%s}%s' % (APP, name)


def mcw_to_ll(mcw):
    """Convert a per-row MCW element to an equivalent LinearLayout element."""
    inner_ll = mcw.find('LinearLayout')
    ll = ET.Element('LinearLayout')

    # id comes from the MCW
    if a('id') in mcw.attrib:
        ll.set(a('id'), mcw.attrib[a('id')])

    ll.set(a('layout_width'), 'match_parent')
    ll.set(a('layout_height'), 'wrap_content')

    # cardBackgroundColor → android:background
    bg = mcw.attrib.get(ap('cardBackgroundColor'))
    if bg:
        ll.set(a('background'), bg)

    # Layout params that might live on the MCW wrapper
    for attr in ('layout_weight', 'layout_gravity',
                 'layout_margin', 'layout_marginTop', 'layout_marginBottom',
                 'layout_marginStart', 'layout_marginEnd',
                 'layout_marginLeft', 'layout_marginRight'):
        k = a(attr)
        if k in mcw.attrib:
            ll.set(k, mcw.attrib[k])

    # Content/display attrs come from the inner LinearLayout
    if inner_ll is not None:
        for attr in ('orientation', 'gravity', 'padding',
                     'paddingStart', 'paddingEnd', 'paddingTop', 'paddingBottom',
                     'paddingLeft', 'paddingRight'):
            k = a(attr)
            if k in inner_ll.attrib:
                ll.set(k, inner_ll.attrib[k])
        ll.text = inner_ll.text
        for child in inner_ll:
            ll.append(deepcopy(child))
    else:
        # No inner LinearLayout — copy MCW's children directly
        ll.text = mcw.text
        for child in mcw:
            ll.append(deepcopy(child))

    ll.tail = mcw.tail
    return ll


def process_element(elem, inside_mcw=False):
    """
    Recursively walk the XML tree.

    inside_mcw=False  →  any MCW we encounter is an outer (section) card  →  keep.
    inside_mcw=True   →  any MCW we encounter is a per-row card  →  convert.

    Returns True when at least one change was made.
    """
    changed = False
    i = 0
    while i < len(elem):
        child = elem[i]
        if child.tag == MCW:
            if inside_mcw:
                # Per-row MCW → revert to LinearLayout
                replacement = mcw_to_ll(child)
                elem.remove(child)
                elem.insert(i, replacement)
                process_element(replacement, inside_mcw=True)  # recurse into new LL
                changed = True
            else:
                # Outer MCW → keep, but process its descendants as inside_mcw=True
                if process_element(child, inside_mcw=True):
                    changed = True
        else:
            if process_element(child, inside_mcw):
                changed = True
        i += 1
    return changed


def process_file(filepath):
    with open(filepath, 'r', encoding='utf-8') as f:
        original = f.read()

    if MCW not in original:
        return False

    try:
        root = ET.fromstring(original)
    except ET.ParseError as e:
        print(f'    PARSE ERROR: {e}')
        return False

    if not process_element(root, inside_mcw=False):
        return False

    # Pretty-print (Python 3.9+; silently skipped on older versions)
    try:
        ET.indent(root, space='\t')
    except AttributeError:
        pass

    new_content = ET.tostring(root, encoding='unicode')
    with open(filepath, 'w', encoding='utf-8') as f:
        f.write(new_content)
    return True


def main():
    files = sorted(LAYOUT_DIR.glob('*.xml'))
    n_changed = n_err = 0
    print(f'Scanning {len(files)} layout files...')
    for fp in files:
        try:
            if process_file(fp):
                n_changed += 1
                print(f'  updated  {fp.name}')
        except Exception as exc:
            n_err += 1
            print(f'  ERROR    {fp.name}: {exc}')
    print(f'\nDone: {n_changed} updated, {n_err} errors.')


if __name__ == '__main__':
    main()
