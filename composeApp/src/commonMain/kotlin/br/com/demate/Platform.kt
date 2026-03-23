package br.com.demate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform