package dev.prabhatpandey.youtils.string

import android.util.Base64
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

/**
 * Capitalizes the first letter of a String and returns the modified String.
 *
 * If the input String is empty or consists of only whitespace, the original String is returned.
 *
 * @return A new String with the first letter capitalized.
 */
fun String.capitalize(): String {
    if (this.isBlank()) return this
    if (this.length == 1) return this.uppercase()
    return "${this.substring(0,1).uppercase()}${this.substring(1, this.length)}"
}

/**
 * Converts a String to a Date using the specified pattern and locale.
 *
 * @param pattern The date pattern to use for parsing the String.
 * @param locale The locale to use for parsing. Defaults to the system's default locale.
 * @return The Date parsed from the String, or null if parsing fails.
 */
fun String.toDate(pattern: String, locale: Locale = Locale.getDefault()): Date? {
    return try {
        SimpleDateFormat(pattern, locale).parse(this)
    } catch (e: Exception) {
        null
    }
}

/**
 * Encodes a String to Base64 format.
 *
 * @return The Base64-encoded representation of the input String.
 */
fun String.encodeToBase64(): String {
    val bytes = Base64.encode(this.toByteArray(), Base64.DEFAULT)
    return String(bytes, Charsets.UTF_8)
}

/**
 * Decodes a Base64-encoded String.
 *
 * @return The original String decoded from Base64.
 */
fun String.decodeFromBase64(): String {
    val bytes = Base64.decode(this.toByteArray(), Base64.DEFAULT)
    return String(bytes, Charsets.UTF_8)
}
