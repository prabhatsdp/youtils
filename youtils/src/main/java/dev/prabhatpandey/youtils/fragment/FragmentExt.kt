package dev.prabhatpandey.youtils.fragment

import androidx.fragment.app.Fragment

/**
 * Gets the simple name of the Fragment class as a String.
 *
 * This extension property is helpful for logging and analytics purposes to obtain the
 * simplified name of the Fragment class without any package information or suffixes.
 *
 * @return The simple name of the Fragment class.
 */
val Fragment.simpleName: String
    get() : String {
        return this::class.simpleName ?: this.javaClass.simpleName
    }
