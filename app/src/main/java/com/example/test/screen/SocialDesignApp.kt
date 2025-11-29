package com.example.test.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

import com.example.test.component.BottomNavigationBar
import com.example.test.component.TopNavBar
import com.example.test.utils.MenuItem
@Composable
fun SocialDesignApp() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopNavBar() },
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            NavHost(navController = navController, startDestination = "home") {
                composable(MenuItem.Home.route) { HomeScreen(navController) }
                composable(MenuItem.Explore.route) { ExploreScreen(navController) }
                composable(MenuItem.Add.route) { AddScreen(navController) }
                composable(MenuItem.Activities.route) { ActivitiesScreen(navController) }
                composable(MenuItem.Profile.route) { ProfileScreen(navController) }
                composable(
                    "story/{id}",
                    arguments = listOf(navArgument("id") { type = NavType.IntType })
                ) {
                    val id = it.arguments?.getInt("id") ?: 0
                    SingeStoryView(id, navController)
                }

                composable(
                    "profile_image/{resId}",
                    arguments = listOf(navArgument("resId") { type = NavType.IntType })
                ) {
                    val resId = it.arguments?.getInt("resId") ?: 0
                    FullImageScreen(resId, navController)
                }

            }
        }
    }
}

@Composable
fun FullImageScreen(resId: Int, navController: NavHostController) {
    Image(
        painter = painterResource(resId),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .clickable { navController.popBackStack()},
        contentScale = ContentScale.Crop
    )
}
