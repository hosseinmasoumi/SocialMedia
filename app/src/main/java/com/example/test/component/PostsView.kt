package com.example.test.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun PostsView(navController: NavHostController) {
    Text("وایسا فعلا", modifier = Modifier.padding(10.dp))
}