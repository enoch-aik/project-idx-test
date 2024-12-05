package com.example.project_idx_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform