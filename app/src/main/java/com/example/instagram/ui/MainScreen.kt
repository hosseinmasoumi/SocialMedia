package com.example.instagram.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.instagram.components.BottomNavigationView
import com.example.instagram.components.TopAppView

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    var fullScreen by remember { mutableStateOf(false) }

    Scaffold(topBar = {
        if (!fullScreen) TopAppView()
    }, bottomBar = { if (!fullScreen) BottomNavigationView(navController) }) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("home") {
                fullScreen = false
                HomeScreen(navController = navController)
            }
            composable("search") {
                fullScreen = false

                SearchScreen()
            }
            composable("add") {
                fullScreen = false

                AddPostScreen()
            }
            composable("activities") {
                fullScreen = false

                ActivitiesScreen()
            }
            composable("profile") {
                fullScreen = false

                ProfileScreen()
            }
            composable("login") {
                fullScreen = true
                LoginPage()
            }
            composable("ShowStoryScreen/{id}", arguments = listOf(navArgument("id") {
                type = NavType.IntType
            })) { entry ->
                fullScreen = true
                ShowStoryScreen(entry.arguments?.getInt("id") ?: 0)
            }
        }
    }
}