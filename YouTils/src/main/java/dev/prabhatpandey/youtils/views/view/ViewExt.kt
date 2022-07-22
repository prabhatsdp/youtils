package dev.prabhatpandey.youtils.views.view

import android.view.View

/**
 * Extensions to handle view visibility
 */

fun View.show() {
    if (visibility == View.VISIBLE) return
    this.visibility = View.VISIBLE
}

fun View.makeInvisible() {
    if (visibility == View.INVISIBLE) return
    this.visibility = View.INVISIBLE
}

fun View.hide() {
    if (visibility == View.GONE) return
    this.visibility = View.GONE
}

fun View.hideIf(condition: Boolean) {
    if (condition) {
        this.visibility = View.GONE
    } else this.visibility = View.VISIBLE
}

fun View.showIf(condition: Boolean) {
    if (condition) this.visibility = View.VISIBLE
    else this.visibility = View.GONE
}

fun View.makeInvisibleIf(condition: Boolean) {
    if (condition) {
        if (visibility == View.INVISIBLE) return
        this.visibility = View.INVISIBLE
    } else {
        this.visibility = View.VISIBLE
    }
}

fun View.enable() {
    if (isEnabled) return
    this.isEnabled = true
}

fun View.disable() {
    if (!isEnabled) return
    this.isEnabled = false
}

fun View.enableIf(condition: Boolean) {
    if (condition) {
        if (this.isEnabled) return
        this.isEnabled = true
    } else this.isEnabled = false
}

fun View.disableIf(condition: Boolean) {
    if (condition) {
        if (!this.isEnabled) return
        this.isEnabled = false
    } else this.isEnabled = true
}