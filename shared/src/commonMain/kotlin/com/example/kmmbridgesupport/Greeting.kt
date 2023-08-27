package com.example.kmmbridgesupport

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun greetTheWorld(): String {
        return "Hello, World!"
    }
}