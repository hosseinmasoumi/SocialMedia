package com.example.test.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.example.test.R
import com.example.test.component.StoryCircleView
import com.example.test.data.ActivitiesItem
import com.example.test.data.ActivitiyType
import com.example.test.data.MockDataRepository

@Composable
fun ActivitiesScreen(navController: NavHostController) {
    val activities = List(30) { MockDataRepository.getRandomActivites() }
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(activities) { item ->
            ActivitiesRow(item)
            Spacer(modifier = Modifier.height(6.dp))

        }
    }
}

@Composable
fun ActivitiesRow(item: ActivitiesItem) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    )
    {
        StoryCircleView(
            item.userProfile,
            item.username,
            50.dp,
            BorderStroke(2.dp, Color.DarkGray)
        )
        Spacer(modifier = Modifier.width(2.dp))
        Column {
            Row {
                Text(item.username, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    when (item.type) {
                        ActivitiyType.Like -> "Liked your post"
                        ActivitiyType.Comment -> "commented on your post"
                        ActivitiyType.Follow -> "started following you"
                    }
                )

            }
            Spacer(modifier = Modifier.height(7.dp))
            Text(item.time + " ago", fontSize = 11.sp)
        }
        Spacer(modifier = Modifier.weight(1f))

        if (item.type == ActivitiyType.Follow) {
            Button(onClick = {},)
            { Text("Follow back", fontSize = 13.sp) }
        }
        else {
            AsyncImage(
                model = item.postThumbnail,
                contentDescription = item.username,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(4.dp)),
                placeholder = painterResource(R.drawable.loading),
                error = painterResource(R.drawable.close)
            )
        }
    }
}