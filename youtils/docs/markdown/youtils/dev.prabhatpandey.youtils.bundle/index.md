//[youtils](../../index.md)/[dev.prabhatpandey.youtils.bundle](index.md)

# Package-level declarations

## Functions

| Name | Summary |
|---|---|
| [getEnum](get-enum.md) | [androidJvm]<br>inline fun &lt;[T](get-enum.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[T](get-enum.md)&gt;&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getEnum](get-enum.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), default: [T](get-enum.md)): [T](get-enum.md)<br>Retrieve an Enum object from the Bundle using a default value if not found. |
| [getParcelableCompat](get-parcelable-compat.md) | [androidJvm]<br>inline fun &lt;[T](get-parcelable-compat.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getParcelableCompat](get-parcelable-compat.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](get-parcelable-compat.md)?<br>Retrieve a Parcelable object from the Bundle using compatibility checks. |
| [getSerializableCompat](get-serializable-compat.md) | [androidJvm]<br>inline fun &lt;[T](get-serializable-compat.md) : [Serializable](https://developer.android.com/reference/kotlin/java/io/Serializable.html)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getSerializableCompat](get-serializable-compat.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](get-serializable-compat.md)?<br>Retrieve a Serializable object from the Bundle using compatibility checks. |
| [putEnum](put-enum.md) | [androidJvm]<br>fun [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[putEnum](put-enum.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), enum: [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;*&gt;)<br>Store an Enum object in the Bundle. |
