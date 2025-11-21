package com.example.test.data

import java.io.Serializable

data class Story(
    val id: Int,
    val username: String,
    val profileImage: String,
    val storyImage: String,
): Serializable