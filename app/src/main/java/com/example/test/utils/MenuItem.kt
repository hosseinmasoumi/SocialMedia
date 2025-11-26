package com.example.test.utils

import com.example.test.R

open class MenuItem(var route: String, var icon: Int, var title: String) {
    object Home: MenuItem("home", R.drawable.home,"Home" )
    object Explore: MenuItem("Explore", R.drawable.icon_explore,"Explore" )
    object Add: MenuItem("add", R.drawable.icon_add,"Add" )
    object Activities: MenuItem("activities", R.drawable.icon_like,"Activities" )
    object Profile: MenuItem("profile", R.drawable.icon_profile,"Profile" )
}