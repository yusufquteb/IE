package com.my.iengineer1.utils;

import android.text.InputFilter;
import android.widget.EditText;

public class InputUtils {
    private static final int MAX_INPUT_LENGTH = 10;

    public static void setupInputFilters(EditText... editTexts) {
        InputFilter[] filters = {
            new InputFilter.LengthFilter(MAX_INPUT_LENGTH),
            (source, start, end, dest, dstart, dend) -> 
                source.toString().matches("[0-9.]*") ? source : ""
        };

        for (EditText editText : editTexts) {
            if (editText != null) {
                editText.setFilters(filters);
            }
        }
    }
}