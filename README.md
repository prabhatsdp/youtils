# YouTils 
Simplify Android App Development with Kotlin Utility Extension Functions

## Overview

YouTils is a powerful Android library designed to streamline and simplify app development for Kotlin
developers. It provides a collection of utility extension functions for various components commonly
used in Android apps. With YouTils, you can perform complex operations effortlessly, saving time and
effort during the development process.

## Features

- Extension functions for View, ImageView, TextView, EditText, Bundle, Fragment, Context, numbers,
  date time, and calendar operations.
- Simplify complex tasks and reduce boilerplate code.
- Improve code readability and maintainability.
- Comprehensive documentation for easy integration.

## Getting Started

### Installation

To use YouTils in your Android project, follow these steps:

1. Add the following repository to your project-level `build.gradle` file:

   ```groovy
   allprojects {
       repositories {
           maven { url 'https://jitpack.io' }
       }
   }
   ```

2. Add the dependency to your app-level `build.gradle` file:

   ```groovy
   dependencies {
       implementation 'dev.prabhatpandey:youtils:VERSION'
   }
   ```

Replace  `VERSION` with the desired release tag.

### Usage

YouTils offers an array of utility functions that can be easily accessed via Kotlin extension
functions. Here's a quick example:

```kotlin
// Import the YouTils extensions
import dev.prabhatpandey.youtils.views.view.hide
import dev.prabhatpandey.youtils.views.view.showIf

class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Use YouTils extension functions
        val textView = findViewById<TextView>(R.id.textView)
        
        // change the visibility of the textview to gone
        textView.hide()

        // change the visibility based on condition
        val isLoading = false
        textView.showIf(isLoading)
    }
}
```

## Contributions
Contributions to YouTils are more than welcome! If you find any issues or have suggestions for
improvements, feel free to open an issue or submit a pull request on GitHub.

## License

YouTils is released under the [MIT License](https://opensource.org/licenses/MIT).

---

Thank you for using YouTils! We hope this library makes your Android app development journey
smoother and more enjoyable. If you encounter any problems or have any questions, please don't
hesitate to reach out to us.

Happy coding!

[Prabhat Pandey](https://prabhatpandey.dev)