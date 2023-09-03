//[youtils](../../index.md)/[dev.prabhatpandey.youtils.datetime](index.md)/[asString](as-string.md)

# asString

[androidJvm]\
fun [Date](https://developer.android.com/reference/kotlin/java/util/Date.html).[asString](as-string.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;dd/MM/yyy&quot;, locale: [Locale](https://developer.android.com/reference/kotlin/java/util/Locale.html) = Locale.getDefault()): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Formats a Date object as a String using the specified pattern and locale.

#### Return

A formatted string representation of the Date, or null if formatting fails.

#### Parameters

androidJvm

| | |
|---|---|
| pattern | The date pattern to format the Date. |
| locale | The locale used for formatting. Defaults to the system's default locale. |

[androidJvm]\
fun [LocalDateTime](https://developer.android.com/reference/kotlin/java/time/LocalDateTime.html).[asString](as-string.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;dd MMM, yyyy @ hh:mm a&quot;): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Formats a LocalDateTime object as a String using the specified pattern.

#### Return

A formatted string representation of the LocalDateTime.

#### Parameters

androidJvm

| | |
|---|---|
| pattern | The date pattern to format the LocalDateTime. |

[androidJvm]\
fun [LocalDate](https://developer.android.com/reference/kotlin/java/time/LocalDate.html).[asString](as-string.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;dd MMM, yyyy&quot;): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Formats a LocalDate object as a String using the specified pattern.

#### Return

A formatted string representation of the LocalDate.

#### Parameters

androidJvm

| | |
|---|---|
| pattern | The date pattern to format the LocalDate. |
