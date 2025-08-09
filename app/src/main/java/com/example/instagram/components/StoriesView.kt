package com.example.instagram.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.instagram.R
import com.example.instagram.models.Story
import net.holosen.socialmedia.ui.theme.RedColor
@Composable
fun StoriesView(stories: ArrayList<Story>, navController: NavController) {
    LazyRow {
        item { MyStory() }
        items(stories.size) {
            StoryItem(stories[it], navController)
        }
    }
}

@Composable
fun StoryItem(story: Story, navController: NavController) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.padding(6.dp),
        onClick = {
            navController.navigate("ShowStoryScreen/${story.id}")
        }
    ) {
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(story.image)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.images),
                contentDescription = story.username,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Column(
                modifier = Modifier.align(Alignment.BottomCenter),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = story.username,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp),
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center
                )

                if (story.isLive) {
                    Text(
                        text = "LIVE",
                        color = Color.White,
                        fontSize = 10.sp,
                        modifier = Modifier
                            .background(RedColor, RoundedCornerShape(4.dp))
                            .padding(4.dp, 2.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun MyStory() {
    val story = Story(
        1,
        "Hossein Masoumi",
        "https://holosen.net/api/file/de32d01f-1e89-4e20-8261-1f438854a5d4",
        false
    )
    Card(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier.padding(6.dp)
    ) {
        Box(
            modifier = Modifier
                .width(80.dp)
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(story.image)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = story.username,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Icon(
                painter = painterResource(id = R.drawable.outline_add_24),
                contentDescription = story.username,
                tint = Color.White,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(50.dp)
            )
        }
    }
}