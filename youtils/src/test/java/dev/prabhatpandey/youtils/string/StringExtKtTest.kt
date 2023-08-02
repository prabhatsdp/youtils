package dev.prabhatpandey.youtils.string

import org.junit.Assert.*
import org.junit.Test

class StringExtKtTest {

    @Test
    fun capitalize_givenMultiCharString_shouldReturnCapitalizedString() {
        val str = "ramesh"
        assert(str.capitalize() == "Ramesh")
    }

    @Test
    fun capitalize_givenSingleLetter_shouldReturnUppercaseLetter() {
        assert("r".capitalize() == "R")
    }

    @Test
    fun capitalize_givenTwoLetters_shouldReturnCapitalizedString() {
        assert("rr".capitalize() == "Rr")
    }

}