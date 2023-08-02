package dev.prabhatpandey.youtils.views.input

import com.google.android.material.textfield.TextInputLayout


/**
 * Removes the error and sets the isErrorEnabled as false
 * so that the extra space gets removed from the bottom of the view
 */
fun TextInputLayout.removeError() {
    this.error = null
    this.isErrorEnabled = false
}

/**
 * Sets the [error] as error text of this TextInputLayout
 *  - Sets the error if param is not null
 *  - Removes the error if param is null
 * @param error [String]
 */
fun TextInputLayout.setErrorText(error: String? = null) {
    if (error != null) this.error = error
    else removeError()
}

