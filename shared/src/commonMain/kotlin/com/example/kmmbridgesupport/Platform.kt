package com.example.kmmbridgesupport

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform