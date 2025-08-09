package com.example.instagram.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.instagram.utils.BottomItem

@Composable
fun BottomNavigationView(navController: NavHostController) {
    val menu = listOf(
        BottomItem.Home,
        BottomItem.Search,
        BottomItem.Add,
        BottomItem.Activities,
        BottomItem.Profile
    )
    var selectedRoute by remember { mutableStateOf("home") }
    BottomAppBar {
        menu.forEach {
            NavigationBarItem(selected = selectedRoute == it.route, onClick = {

                navController.navigate(it.route) {
                    navController.graph.startDestinationRoute?.let { route ->
                        selectedRoute = route
                        popUpTo(route)
                    }
                    launchSingleTop = true
                    restoreState = true
                }
                selectedRoute = it.route
            }, icon = {
                Icon(
                    painter = painterResource(id = it.icon), contentDescription = it.title
                )
            })
        }
    }
}