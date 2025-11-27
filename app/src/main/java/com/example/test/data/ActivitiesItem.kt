package com.example.test.data

data class ActivitiesItem(
    val username: String,
    val userProfile: String,
    val type: ActivitiyType,
    val time: String,
    val postThumbnail: String? = null
)