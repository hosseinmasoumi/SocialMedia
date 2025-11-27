package com.example.test.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@Composable
fun AddScreen(navController: NavHostController) {
    Column(Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            ImageCamera()

        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            ExploreScreen(navController)
        }
    }
}

@Composable
fun ImageCamera() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center,
    ) {
        Text("Camera Periwe", color = Color.White)

    }
}