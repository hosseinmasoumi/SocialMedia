package com.example.test.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.test.R
import com.example.test.data.MockDataRepository
import com.example.test.data.MockNameRepository
import com.example.test.data.Story

@Composable
fun StoriesRow(navController: NavHostController) {
    LazyRow(modifier = Modifier.padding(5.dp)) {
        item {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Card(
                    shape = CircleShape,
                    border = BorderStroke(4.dp, Color.DarkGray),
                    modifier = Modifier.padding(3.dp)
                ) {
                    Box(
                        modifier = Modifier.size(80.dp), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.icon_launcher_foreground),
                            contentDescription = "Add Story",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
                Spacer(Modifier.height(2.dp))
                Text(
                    text = MockNameRepository().getRandomName(), color = Color.DarkGray
                )
            }
        }

        items(50) { _ ->
            val story = remember { MockDataRepository.getRandomStory() }

            StoryItem(story, navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StoriesRowPreview() {
    StoriesRow(navController = NavHostController(LocalContext.current))
}


@Composable
fun StoryItem(story: Story, navController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable{navController.navigate("story/" +story.id)}
    ) {
        StoryCircleView(
            story.profileImage, story.username, 80.dp, BorderStroke(3.dp, Color.Red)
        )
        Spacer(Modifier.height(2.dp))
        Text(
            text = story.username, color = Color.DarkGray
        )
    }

}
