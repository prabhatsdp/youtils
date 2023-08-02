package dev.prabhatpandey.youtils.views.view

import android.content.res.ColorStateList
import android.view.View
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
 * Makes the View visible if it's not already visible.
 */
fun View.show() {
    if (visibility == View.VISIBLE) return
    this.visibility = View.VISIBLE
}

/**
 * Makes the View invisible if it's not already invisible.
 */
fun View.makeInvisible() {
    if (visibility == View.INVISIBLE) return
    this.visibility = View.INVISIBLE
}

/**
 * Hides the View if it's not already hidden.
 */
fun View.hide() {
    if (visibility == View.GONE) return
    this.visibility = View.GONE
}

/**
 * Hides the View if the given condition is true; otherwise, shows the View.
 *
 * @param condition The condition to determine whether to hide the View or not.
 */
fun View.hideIf(condition: Boolean) {
    if (condition) {
        this.visibility = View.GONE
    } else this.visibility = View.VISIBLE
}

/**
 * Shows the View if the given condition is true; otherwise, hides the View.
 *
 * @param condition The condition to determine whether to show the View or not.
 */
fun View.showIf(condition: Boolean) {
    if (condition) this.visibility = View.VISIBLE
    else this.visibility = View.GONE
}

/**
 * Makes the View invisible if the given condition is true; otherwise, shows the View.
 *
 * @param condition The condition to determine whether to make the View invisible or not.
 */
fun View.makeInvisibleIf(condition: Boolean) {
    if (condition) {
        if (visibility == View.INVISIBLE) return
        this.visibility = View.INVISIBLE
    } else {
        this.visibility = View.VISIBLE
    }
}

/**
 * Enables the View if it's not already enabled.
 */
fun View.enable() {
    if (isEnabled) return
    this.isEnabled = true
}

/**
 * Disables the View if it's not already disabled.
 */
fun View.disable() {
    if (!isEnabled) return
    this.isEnabled = false
}

/**
 * Enables the View if the given condition is true; otherwise, disables the View.
 *
 * @param condition The condition to determine whether to enable the View or not.
 */
fun View.enableIf(condition: Boolean) {
    if (condition) {
        if (this.isEnabled) return
        this.isEnabled = true
    } else this.isEnabled = false
}

/**
 * Disables the View if the given condition is true; otherwise, enables the View.
 *
 * @param condition The condition to determine whether to disable the View or not.
 */
fun View.disableIf(condition: Boolean) {
    if (condition) {
        if (!this.isEnabled) return
        this.isEnabled = false
    } else this.isEnabled = true
}



/**
 * Sets the tint color for the background of this View using a color resource.
 *
 * This method applies a tint color to the background of the View, changing its color appearance.
 * The tint color is specified by the given color resource, which is resolved to an actual color value.
 *
 * @param colorRes The color resource ID representing the desired tint color.
 * @see [ContextCompat.getColor]
 */
fun View.setTint(@ColorRes colorRes: Int) {
    this.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this.context, colorRes))
}