//[youtils](../../index.md)/[dev.prabhatpandey.youtils.bundle](index.md)/[getEnum](get-enum.md)

# getEnum

[androidJvm]\
inline fun &lt;[T](get-enum.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[T](get-enum.md)&gt;&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getEnum](get-enum.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), default: [T](get-enum.md)): [T](get-enum.md)

Retrieve an Enum object from the Bundle using a default value if not found.

#### Return

The retrieved Enum object or the default value if not found.

#### Parameters

androidJvm

| | |
|---|---|
| key | The key used to retrieve the Enum from the Bundle. |
| default | The default Enum value to return if the key is not found in the Bundle. |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the retrieved Enum name is not valid. |
