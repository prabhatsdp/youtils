package dev.prabhatpandey.youtils.map

/**
 * Filters a Map to remove entries with null values.
 *
 * This extension function iterates through the key-value pairs of the Map and retains only those
 * entries where the value is not null. It returns a new Map containing only the non-null entries.
 *
 * @receiver The Map to filter null values from.
 * @return A new Map containing only key-value pairs where the value is not null.
 */
fun <K, V> Map<K, V?>.filterNullValues(): Map<K, V?> {
    return this.filterValues { it != null }
}