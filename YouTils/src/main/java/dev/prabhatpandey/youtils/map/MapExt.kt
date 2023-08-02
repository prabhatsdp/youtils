package dev.prabhatpandey.youtils.map

fun <K, V> Map<K, V?>.filterNullValues() : Map<K, V?> {
    return this.filterValues { it != null }
}