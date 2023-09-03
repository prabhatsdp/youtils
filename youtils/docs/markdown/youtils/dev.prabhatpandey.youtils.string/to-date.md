//[youtils](../../index.md)/[dev.prabhatpandey.youtils.string](index.md)/[toDate](to-date.md)

# toDate

[androidJvm]\
fun [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).[toDate](to-date.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), locale: [Locale](https://developer.android.com/reference/kotlin/java/util/Locale.html) = Locale.getDefault()): [Date](https://developer.android.com/reference/kotlin/java/util/Date.html)?

Converts a String to a Date using the specified pattern and locale.

#### Return

The Date parsed from the String, or null if parsing fails.

#### Parameters

androidJvm

| | |
|---|---|
| pattern | The date pattern to use for parsing the String. |
| locale | The locale to use for parsing. Defaults to the system's default locale. |
