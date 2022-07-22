package dev.prabhatpandey.youtils.datetime

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

fun Date.toSimpleString(pattern: String = "dd/MM/yyy", locale: Locale = Locale.getDefault()) : String? {
    return try {
        SimpleDateFormat(pattern, locale).format(this)
    } catch (e: Exception) {
        return null
    }
}

