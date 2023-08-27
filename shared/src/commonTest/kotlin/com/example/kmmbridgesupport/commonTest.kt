package com.example.kmmbridgesupport

import kotlin.test.Test
import kotlin.test.assertEquals

class CommonGreetingTest {

    @Test
    fun testGreetTheWorld() {
        val sui = Greeting()
        val expectedGreeting = "Hello, World!"

        val result = sui.greetTheWorld()

        assertEquals(result, expectedGreeting)
    }
}