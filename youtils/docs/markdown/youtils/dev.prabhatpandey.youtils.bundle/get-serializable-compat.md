//[youtils](../../index.md)/[dev.prabhatpandey.youtils.bundle](index.md)/[getSerializableCompat](get-serializable-compat.md)

# getSerializableCompat

[androidJvm]\
inline fun &lt;[T](get-serializable-compat.md) : [Serializable](https://developer.android.com/reference/kotlin/java/io/Serializable.html)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getSerializableCompat](get-serializable-compat.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](get-serializable-compat.md)?

Retrieve a Serializable object from the Bundle using compatibility checks.

#### Return

The Serializable object retrieved from the Bundle, or null if not found.

#### Parameters

androidJvm

| | |
|---|---|
| key | The key used to store the Serializable object in the Bundle. |

#### Throws

| | |
|---|---|
| [ClassCastException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-class-cast-exception/index.html) | if the retrieved object is not of the expected type. |
