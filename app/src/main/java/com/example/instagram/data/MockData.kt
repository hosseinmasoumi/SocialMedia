package com.example.instagram.data

import com.example.instagram.models.Post
import com.example.instagram.models.Story
import com.example.instagram.models.User


object MockData {
    val stories = ArrayList<Story>( )
    val users = ArrayList<User>()
    val posts = ArrayList<Post>()

    init {
        stories.add(Story(1,"John Smith","https://holosen.net/api/file/de32d01f-1e89-4e20-8261-1f438854a5d4",true))
        stories.add(Story(2,"Mehrad","https://holosen.net/api/file/d6996b73-2eb7-4366-aa28-ebb8d7149d95",false))
        stories.add(Story(3,"Lucy Baker","https://holosen.net/api/file/447d332c-f658-4235-987b-e4a65328b850",false))
        stories.add(Story(4,"Tony","https://holosen.net/api/file/218ddcb4-d25f-469b-891a-1754119bab6d",false))
        stories.add(Story(5,"Lucy Baker","https://holosen.net/api/file/447d332c-f658-4235-987b-e4a65328b850",false))

        stories.add(Story(6,"Tony","https://holosen.net/api/file/218ddcb4-d25f-469b-891a-1754119bab6d",false))
        stories.add(Story(7,"Anna Stark","https://holosen.net/api/file/21df2d2d-3a8c-4b5a-a561-4c4259c5bd20",false))
        stories.add(Story(8,"Brayan","https://holosen.net/api/file/4df6890b-9d0e-4a69-a0d1-7175f8067704",false))

        users.add(User("NullDevelopr","Hossein Badrnezhad","https://holosen.net/api/file/95cd78ff-a6fa-440a-bc08-5fb55b28fb89"))
        users.add(User("Anna","Anna Stark","https://holosen.net/api/file/4df6890b-9d0e-4a69-a0d1-7175f8067704"))
        users.add(User("Lucy","Lucy Baker","https://holosen.net/api/file/de32d01f-1e89-4e20-8261-1f438854a5d4"))

        posts.add(Post(users[0],"Tehran, Iran","https://holosen.net/api/file/218ddcb4-d25f-469b-891a-1754119bab6d","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        posts.add(Post(users[1],"Los Angeles","https://holosen.net/api/file/4df6890b-9d0e-4a69-a0d1-7175f8067704","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
        posts.add(Post(users[2],"NewYork City","https://holosen.net/api/file/21df2d2d-3a8c-4b5a-a561-4c4259c5bd20","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."))
    }
}