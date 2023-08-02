package dev.prabhatpandey.youtils.listeners

import android.os.SystemClock
import android.view.View

/**
 * Custom click listener that applies throttle mechanism for handling click events.
 *
 * @param throttleDuration The duration (in milliseconds) between consecutive click events that are processed.
 * @param onClick The click event handler function.
 *
 *
 *   Example of how to use ThrottleClickListener:
 *   ```kotlin
 *
 *   // Define a click listener lambda function for the button
 *   val clickListener: (View) -> Unit = {
 *       // Your click event handling code here
 *       showToast("Button clicked with throttle!")
 *   }
 *
 *   // Apply ThrottleClickListener to the button
 *   val myButton = findViewById<Button>(R.id.myButton)
 *   myButton.setOnClickListener(ThrottleClickListener(1000L) {
 *      // Handle click here
 *   })
 *   ```
 *
 */
class ThrottleClickListener(
    private val throttleDuration: Long = 500L,
    private val onClick: (View) -> Unit
) : View.OnClickListener {

    private var lastClickTime: Long = 0L

    override fun onClick(v: View) {
        val currentTime = SystemClock.elapsedRealtime()
        if (currentTime - lastClickTime >= throttleDuration) {
            lastClickTime = currentTime
            onClick(v)
        }
    }
}
