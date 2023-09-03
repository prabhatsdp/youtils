//[youtils](../../index.md)/[dev.prabhatpandey.youtils.map](index.md)/[filterNullValues](filter-null-values.md)

# filterNullValues

[androidJvm]\
fun &lt;[K](filter-null-values.md), [V](filter-null-values.md)&gt; [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[K](filter-null-values.md), [V](filter-null-values.md)?&gt;.[filterNullValues](filter-null-values.md)(): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[K](filter-null-values.md), [V](filter-null-values.md)?&gt;

Filters a Map to remove entries with null values.

This extension function iterates through the key-value pairs of the Map and retains only those entries where the value is not null. It returns a new Map containing only the non-null entries.

#### Receiver

The Map to filter null values from.

#### Return

A new Map containing only key-value pairs where the value is not null.
