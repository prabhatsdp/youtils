@file:Suppress("DEPRECATION")

package dev.prabhatpandey.youtils.bundle

import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

inline fun<reified T : Serializable> Bundle.getSerializableCompat(key: String): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        this.getSerializable(key, T::class.java)
    } else this.getSerializable(key) as? T
}
inline fun<reified T : Parcelable> Bundle.getParcelableCompat(key: String): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        this.getParcelable(key, T::class.java)
    } else this.getParcelable(key) as? T
}


fun Bundle.putEnum(key:String, enum: Enum<*>){
    putString(key, enum.name)
}

inline fun <reified T: Enum<T>> Bundle.getEnum(key: String, default: T): T {
    val found = getString(key)
    return if (found == null) default  else enumValueOf(found)
}
