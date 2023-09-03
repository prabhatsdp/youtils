package dev.prabhatpandey.youtils.views.snackbar

import android.view.View
import androidx.annotation.StringRes
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

/**
 * Shows a Snackbar with the provided string resource as a message, anchored to an optional view.
 *
 * This extension function creates and displays a Snackbar with the specified string resource
 * as a message. You can also provide an optional anchor view to which the Snackbar should be anchored.
 *
 * @param stringResId The string resource ID to use as the message text.
 * @param anchorView The view to which the Snackbar should be anchored, or null for no anchor.
 */
fun CoordinatorLayout.showSnackBar(
    @StringRes stringResId: Int,
    anchorView: View?
) {
    Snackbar
        .make(this, this.context.getString(stringResId), Snackbar.LENGTH_SHORT)
        .setAnchorView(anchorView)
        .show()
}
