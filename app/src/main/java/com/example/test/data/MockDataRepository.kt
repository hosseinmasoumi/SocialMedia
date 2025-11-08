package com.example.test.data

import kotlin.random.Random

class MockDataRepository {
    companion object {

        private fun getAvatar(): String {
            val gender = if (Random.nextBoolean()) "women" else "men"
            return "https://randomuser.me/api/portraits/${gender}/${Random.nextInt(1, 100)}.jpg"
        }

        fun getImage(): String {
            return "https://picsum.photos/id/${Random.nextInt(1, 100)}/600/300"
        }

        fun getStoryImage(): String {
            return "https://picsum.photos/id/${Random.nextInt(1, 100)}/540/960"
        }
    }
}