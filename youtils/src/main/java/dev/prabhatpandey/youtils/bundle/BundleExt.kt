@file:Suppress("DEPRECATION")

package dev.prabhatpandey.youtils.bundle

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

/**
 * Retrieve a Serializable object from the Bundle using compatibility checks.
 *
 * @param key The key used to store the Serializable object in the Bundle.
 * @return The Serializable object retrieved from the Bundle, or null if not found.
 * @throws ClassCastException if the retrieved object is not of the expected type.
 */
inline fun <reified T : Serializable> Bundle.getSerializableCompat(key: String): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        this.getSerializable(key, T::class.java)
    } else this.getSerializable(key) as? T
}

/**
 * Retrieve a Parcelable object from the Bundle using compatibility checks.
 *
 * @param key The key used to store the Parcelable object in the Bundle.
 * @return The Parcelable object retrieved from the Bundle, or null if not found.
 * @throws ClassCastException if the retrieved object is not of the expected type.
 */
inline fun <reified T : Parcelable> Bundle.getParcelableCompat(key: String): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        this.getParcelable(key, T::class.java)
    } else this.getParcelable(key) as? T
}

/**
 * Store an Enum object in the Bundle.
 *
 * @param key The key to use for storing the Enum in the Bundle.
 * @param enum The Enum object to be stored.
 */
fun Bundle.putEnum(key: String, enum: Enum<*>) {
    putString(key, enum.name)
}

/**
 * Retrieve an Enum object from the Bundle using a default value if not found.
 *
 * @param key The key used to retrieve the Enum from the Bundle.
 * @param default The default Enum value to return if the key is not found in the Bundle.
 * @return The retrieved Enum object or the default value if not found.
 * @throws IllegalArgumentException if the retrieved Enum name is not valid.
 */
inline fun <reified T : Enum<T>> Bundle.getEnum(key: String, default: T): T {
    val found = getString(key)
    return if (found == null) default else enumValueOf(found)
}
