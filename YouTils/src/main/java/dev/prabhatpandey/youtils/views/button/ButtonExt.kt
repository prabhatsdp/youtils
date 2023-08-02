package dev.prabhatpandey.youtils.views.button

import android.content.res.ColorStateList
import android.widget.Button
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
 * Sets the tint color for the background of this Button using a color resource.
 *
 * This method applies a tint color to the background of the Button, changing its color appearance.
 * The tint color is specified by the given color resource, which is resolved to an actual color value.
 *
 * @param colorRes The color resource ID representing the desired tint color.
 * @see [ContextCompat.getColor]
 */
fun Button.setBackgroundTint(@ColorRes colorRes: Int) {
    this.backgroundTintList = ColorStateList.valueOf(ContextCompat.getColor(this.context, colorRes))
}
