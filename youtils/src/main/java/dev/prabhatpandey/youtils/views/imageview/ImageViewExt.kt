package dev.prabhatpandey.youtils.views.imageview

import android.content.res.ColorStateList
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

/**
 * Sets the tint color for the image of this ImageView using a color resource.
 *
 * This method applies a tint color to the image of the ImageView, changing its color appearance.
 * The tint color is specified by the given color resource, which is resolved to an actual color value.
 *
 * @param colorRes The color resource ID representing the desired tint color.
 * @see [ContextCompat.getColor]
 */
fun ImageView.setTint(@ColorRes colorRes: Int) {
    this.imageTintList = ColorStateList.valueOf(ContextCompat.getColor(this.context, colorRes))
}