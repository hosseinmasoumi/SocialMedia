package com.example.instagram.utils

import com.example.instagram.R

open class BottomItem(val route: String, val icon: Int, val title: String) {
    object Search : BottomItem("search", R.drawable.baseline_search_24, "Search")
    object Add : BottomItem("add", R.drawable.outline_add_24, "Add")
    object Activities : BottomItem("activities", R.drawable.outline_favorite_24, "Activities")
    object Profile : BottomItem("profile", R.drawable.outline_person_24, "Profile")
    object Home : BottomItem("home", R.drawable.baseline_home_24, "Home")

}