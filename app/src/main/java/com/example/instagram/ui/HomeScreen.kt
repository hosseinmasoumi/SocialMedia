package com.example.instagram.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.instagram.components.PossView
import com.example.instagram.components.StoriesView
import com.example.instagram.data.MockData

@Composable
fun HomeScreen(modifier: Modifier = Modifier,navController: NavController) {
    Column {
        StoriesView(MockData.stories,navController)
        Spacer(modifier.height(7.dp))

        Divider(modifier.height(5.dp), thickness = 1.dp, color = Color.LightGray)
        Spacer(modifier.height(7.dp))
        PossView(MockData.posts)


    }
}