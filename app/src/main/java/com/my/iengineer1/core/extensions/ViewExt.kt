package com.my.iengineer1.core.extensions

import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

fun View.show() { visibility = View.VISIBLE }
fun View.hide() { visibility = View.GONE }
fun View.invisible() { visibility = View.INVISIBLE }

fun EditText.textOrNull(): String? = text?.toString()?.trim()?.takeIf { it.isNotEmpty() }
fun EditText.doubleOrNull(): Double? = textOrNull()?.toDoubleOrNull()
fun EditText.doubleOrZero(): Double = doubleOrNull() ?: 0.0

fun Fragment.toast(msg: String) =
    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
