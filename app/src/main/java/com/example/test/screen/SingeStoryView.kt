package com.example.test.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.example.test.R
import com.example.test.data.MockDataRepository

@Composable
fun SingeStoryView(id: Int, navController: NavHostController) {
    val story= MockDataRepository.getStory(id)
    Box(
        modifier = Modifier
            .fillMaxSize()) {
        AsyncImage(
            model = story?.storyImage,
            contentDescription = story?.username,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize(),
//            placeholder = painterResource(R.drawable.loading),
            error = painterResource(R.drawable.close)
        )
    }
}
