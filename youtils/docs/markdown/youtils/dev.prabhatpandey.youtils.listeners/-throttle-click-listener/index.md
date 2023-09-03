//[youtils](../../../index.md)/[dev.prabhatpandey.youtils.listeners](../index.md)/[ThrottleClickListener](index.md)

# ThrottleClickListener

class [ThrottleClickListener](index.md)(throttleDuration: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = 500, onClick: ([View](https://developer.android.com/reference/kotlin/android/view/View.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) : [View.OnClickListener](https://developer.android.com/reference/kotlin/android/view/View.OnClickListener.html)

Custom click listener that applies throttle mechanism for handling click events.

#### Parameters

androidJvm

| | |
|---|---|
| throttleDuration | The duration (in milliseconds) between consecutive click events that are processed. |
| onClick | The click event handler function.<br>Example of how to use ThrottleClickListener:<br>```kotlin // Define a click listener lambda function for the button val clickListener: (View) -> Unit = {     // Your click event handling code here     showToast("Button clicked with throttle!") }<br>// Apply ThrottleClickListener to the button val myButton = findViewById<Button>(R.id.myButton) myButton.setOnClickListener(ThrottleClickListener(1000L) {    // Handle click here }) ``` |

## Constructors

| | |
|---|---|
| [ThrottleClickListener](-throttle-click-listener.md) | [androidJvm]<br>constructor(throttleDuration: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) = 500, onClick: ([View](https://developer.android.com/reference/kotlin/android/view/View.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [onClick](on-click.md) | [androidJvm]<br>open override fun [onClick](on-click.md)(v: [View](https://developer.android.com/reference/kotlin/android/view/View.html)) |
