package com.example.test.component

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.test.utils.MenuItem

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val menu = listOf(
        MenuItem.Profile,
        MenuItem.Activities,
        MenuItem.Add,
        MenuItem.Explore,
        MenuItem.Home)

    var selectedRoute by remember { mutableStateOf(MenuItem.Home.route) }



    NavigationBar {
        menu.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
//                label = { Text(item.title) },
                selected = selectedRoute == item.route,
                onClick = {
                    selectedRoute = item.route
                    navController.navigate(item.route)
                    {
                        popUpTo(navController.graph.findStartDestination().id)
                        { saveState = true }
                        /* ذخیره state صفحه فعلی */
                        launchSingleTop = true
                        //  جلوگیری از ساخت چند نمونه از یک صفحه یعنی اگر چندین بار زد روی یه صفحه ک توش بودیم صفحه الکی ساخته نشه
                        restoreState = true
                        // بازگردانی state صفحه قبلی
                    }
                })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Cap1() {
    BottomNavigationBar(navController = NavHostController(androidx.compose.ui.platform.LocalContext.current))
}