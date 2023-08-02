package dev.prabhatpandey.youtills_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dev.prabhatpandey.youtils.views.view.hide
import dev.prabhatpandey.youtils.views.view.showIf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textview)

        // change the visibility of the textview to gone
        textView.hide()

        // change the visibility based on condition
        val isLoading = false
        textView.showIf(isLoading)

    }
}