package dev.prabhatpandey.youtils.datetime

import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

/**
 * Formats a Date object as a String using the specified pattern and locale.
 *
 * @param pattern The date pattern to format the Date.
 * @param locale The locale used for formatting. Defaults to the system's default locale.
 * @return A formatted string representation of the Date, or null if formatting fails.
 */
fun Date.asString(
    pattern: String = "dd/MM/yyy",
    locale: Locale = Locale.getDefault()
): String? {
    return try {
        SimpleDateFormat(pattern, locale).format(this)
    } catch (e: Exception) {
        null
    }
}

/**
 * Converts a LocalDateTime object to epoch milliseconds.
 *
 * @return The epoch milliseconds representing the LocalDateTime.
 */
fun LocalDateTime.toEpochMillis(): Long {
    return this.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
}

/**
 * Converts a long value representing epoch milliseconds to a LocalDate.
 *
 * @return The LocalDate corresponding to the epoch milliseconds.
 */
fun Long.toLocalDate(): LocalDate {
    return Instant.ofEpochMilli(this).atZone(ZoneId.systemDefault()).toLocalDate()
}

/**
 * Converts a long value representing epoch milliseconds to a LocalDateTime.
 *
 * @return The LocalDateTime corresponding to the epoch milliseconds.
 */
fun Long.toLocalDateTime(): LocalDateTime {
    return Instant.ofEpochMilli(this).atZone(ZoneId.systemDefault()).toLocalDateTime()
}

/**
 * Formats a LocalDateTime object as a String using the specified pattern.
 *
 * @param pattern The date pattern to format the LocalDateTime.
 * @return A formatted string representation of the LocalDateTime.
 */
fun LocalDateTime.asString(pattern: String = "dd MMM, yyyy @ hh:mm a"): String {
    return runCatching {
        this.format(DateTimeFormatter.ofPattern(pattern))
    }.onFailure {
        it.printStackTrace()
    }.getOrDefault("")
}

/**
 * Formats a LocalDate object as a String using the specified pattern.
 *
 * @param pattern The date pattern to format the LocalDate.
 * @return A formatted string representation of the LocalDate.
 */
fun LocalDate.asString(pattern: String = "dd MMM, yyyy"): String {
    return runCatching {
        this.format(DateTimeFormatter.ofPattern(pattern))
    }.onFailure {
        it.printStackTrace()
    }.getOrDefault("")
}
