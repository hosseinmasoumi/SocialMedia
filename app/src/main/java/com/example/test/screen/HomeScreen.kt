package com.example.test.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.test.component.PostsView
import com.example.test.component.StoriesView

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        StoriesView(navController)
        Spacer(modifier = Modifier.height(7.dp))
        HorizontalDivider(
            color = Color.Gray, thickness = 1.dp
        )
        Spacer(modifier = Modifier.height(7.dp))
        PostsView(navController)


    }
}