package com.example.test.data

import java.io.Serializable

data class Posts(
    val id: Int,
    val username: String,
    val profileImage: String,
    val image: String,
    val caption: String,
): Serializable