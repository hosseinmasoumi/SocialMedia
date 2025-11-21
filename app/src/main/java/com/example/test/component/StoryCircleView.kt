package com.example.test.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.test.R

@Composable
fun StoryCircleView(
    storyImage: String,
    username: String,
    size: Dp,
    borderStroke: BorderStroke
) {
    Card(
        shape = CircleShape,
        border = borderStroke,
        modifier = Modifier
            .padding(3.dp)
            .size(size) // ✅ سایز رو به Card بده
    ) {
        AsyncImage(
            model = storyImage,
            contentDescription = username,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            placeholder = painterResource(R.drawable.loading),
            error = painterResource(R.drawable.close)
        )
    }
}