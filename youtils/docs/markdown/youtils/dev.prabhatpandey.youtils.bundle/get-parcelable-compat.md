//[youtils](../../index.md)/[dev.prabhatpandey.youtils.bundle](index.md)/[getParcelableCompat](get-parcelable-compat.md)

# getParcelableCompat

[androidJvm]\
inline fun &lt;[T](get-parcelable-compat.md) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)&gt; [Bundle](https://developer.android.com/reference/kotlin/android/os/Bundle.html).[getParcelableCompat](get-parcelable-compat.md)(key: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [T](get-parcelable-compat.md)?

Retrieve a Parcelable object from the Bundle using compatibility checks.

#### Return

The Parcelable object retrieved from the Bundle, or null if not found.

#### Parameters

androidJvm

| | |
|---|---|
| key | The key used to store the Parcelable object in the Bundle. |

#### Throws

| | |
|---|---|
| [ClassCastException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-class-cast-exception/index.html) | if the retrieved object is not of the expected type. |
