package dev.prabhatpandey.youtils.string

import android.util.Base64
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

fun String.capitalize() : String {
    if (this.isBlank()) return this
    if (this.length == 1) return this.uppercase()
    return "${this.substring(0,1).uppercase()}${this.substring(1, this.length)}"
}

fun String.toDate(pattern: String, locale: Locale = Locale.getDefault()) : Date? {
    return try {
        SimpleDateFormat(pattern, locale).parse(this)
    } catch (e: Exception) {
        null
    }
}

fun String.encodeToBase64(): String {
    val bytes = Base64.encode(this.toByteArray(), Base64.DEFAULT)
    return String(bytes, Charsets.UTF_8)
}

fun String.decodeFromBase64(): String {
    val bytes = Base64.decode(this.toByteArray(), Base64.DEFAULT)
    return String(bytes, Charsets.UTF_8)
}