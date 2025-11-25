package com.example.test.data

import androidx.compose.runtime.mutableStateListOf
import kotlin.random.Random

class MockDataRepository {
    companion object {
        private val stories = mutableStateListOf<Story>()
        private val post = mutableStateListOf<Posts>()
        private var id: Int = 0

        private fun getId(): Int {
            id++
            return id
        }

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

        fun getRandomStory(): Story {
            val result = Story(
                getId(), MockNameRepository().getRandomName(), getAvatar(), getStoryImage()
            )
            stories.add(result)
            return result
        }

        fun getPostStory(): Posts {
            val result = Posts(
                getId(),
                MockNameRepository().getRandomName(),
                getAvatar(),
                getImage(),
                MockStringRepository().getRandomCaption()
            )
            post.add(result)
            return result
        }

        fun getStory(id: Int): Story? {
            return stories.firstOrNull { it.id == id }
        }
    }
}
