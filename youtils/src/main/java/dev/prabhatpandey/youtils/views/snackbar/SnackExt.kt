package dev.prabhatpandey.youtils.views.snackbar

import android.view.View
import androidx.annotation.StringRes
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

fun CoordinatorLayout.showSnackBar(
    @StringRes stringResId: Int,
    anchorView: View?
) {
    Snackbar
        .make(this, this.context.getString(stringResId), Snackbar.LENGTH_SHORT)
        .setAnchorView(anchorView)
        .show()
}