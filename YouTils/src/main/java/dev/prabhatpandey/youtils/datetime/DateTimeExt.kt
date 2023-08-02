package dev.prabhatpandey.youtils.datetime

import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

fun Date.asString(
    pattern: String = "dd/MM/yyy",
    locale: Locale = Locale.getDefault()
): String? {
    return try {
        SimpleDateFormat(pattern, locale).format(this)
    } catch (e: Exception) {
        return null
    }
}

fun LocalDateTime.toEpochMillis(): Long {
    return this.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
}

fun Long.toLocalDate(): LocalDate {
    return Instant.ofEpochMilli(this).atZone(ZoneId.systemDefault()).toLocalDate()
}

fun Long.toLocalDateTime(): LocalDateTime {
    return Instant.ofEpochMilli(this).atZone(ZoneId.systemDefault()).toLocalDateTime()
}

fun LocalDateTime.asString(pattern: String = "dd MMM, yyyy @ hh:mm a"): String {
    return runCatching {
        this.format(DateTimeFormatter.ofPattern(pattern))
    }.onFailure {
        it.printStackTrace()
    }.getOrDefault("")
}

fun LocalDate.asString(pattern: String = "dd MMM, yyyy"): String {
    return runCatching {
        this.format(DateTimeFormatter.ofPattern(pattern))
    }.onFailure {
        it.printStackTrace()
    }.getOrDefault("")
}

