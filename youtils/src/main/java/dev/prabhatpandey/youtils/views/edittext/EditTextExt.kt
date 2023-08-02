package dev.prabhatpandey.youtils.views.edittext

import android.content.Context
import android.os.Build
import android.view.inputmethod.InputMethodManager
import android.widget.EditText


/**
 * Hides the soft keyboard by clearing the focus from the EditText.
 */
fun EditText.hideKeyboard() {
    this.clearFocus()
    try {
        val inputManager = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            this.context.getSystemService(InputMethodManager::class.java)
        } else {
            this.context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        }
        inputManager?.hideSoftInputFromWindow(this.windowToken, 0)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}


/**
 * Shows the soft keyboard and focuses on the EditText.
 */
fun EditText.showKeyboard() {
    this.requestFocus()
    try {
        val inputManager = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            this.context.getSystemService(InputMethodManager::class.java)
        } else {
            this.context.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        }
        inputManager?.showSoftInput(this, InputMethodManager.SHOW_IMPLICIT)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}