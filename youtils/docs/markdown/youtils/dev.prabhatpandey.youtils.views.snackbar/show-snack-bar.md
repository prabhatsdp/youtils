//[youtils](../../index.md)/[dev.prabhatpandey.youtils.views.snackbar](index.md)/[showSnackBar](show-snack-bar.md)

# showSnackBar

[androidJvm]\
fun [CoordinatorLayout](https://developer.android.com/reference/kotlin/androidx/coordinatorlayout/widget/CoordinatorLayout.html).[showSnackBar](show-snack-bar.md)(@[StringRes](https://developer.android.com/reference/kotlin/androidx/annotation/StringRes.html)stringResId: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), anchorView: [View](https://developer.android.com/reference/kotlin/android/view/View.html)?)

Shows a Snackbar with the provided string resource as a message, anchored to an optional view.

This extension function creates and displays a Snackbar with the specified string resource as a message. You can also provide an optional anchor view to which the Snackbar should be anchored.

#### Parameters

androidJvm

| | |
|---|---|
| stringResId | The string resource ID to use as the message text. |
| anchorView | The view to which the Snackbar should be anchored, or null for no anchor. |
