package com.example.test.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.example.test.R
import com.example.test.data.MockDataRepository
import com.example.test.data.MockStringRepository
import com.example.test.data.Posts

@Composable
fun PostsView(navController: NavHostController) {
    LazyColumn {
        items(count = 50) {
            val post by rememberSaveable { mutableStateOf(MockDataRepository.getPostStory()) }
            PostItem(post, navController)
        }
    }
}

@Composable
fun PostItem(post: Posts, navController: NavHostController) {
    Column {
        PostAuther(post)
        Spacer(modifier = Modifier.height(5.dp))

        PostImage(post)
        PostActions(post)
        PostCaption(post)
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
fun PostAuther(post: Posts) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        StoryCircleView(
            post.profileImage,
            post.username,
            50.dp,
            BorderStroke(2.dp, Color.DarkGray)
        )
        Spacer(modifier = Modifier.width(2.dp))
        Column {
            Text(post.username)
            Spacer(modifier = Modifier.height(7.dp))
            Text("3 Minutes ago", fontSize = 11.sp)
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(R.drawable.svgrepo),
                contentDescription = "DSA"
            )
        }
    }
}

@Composable
fun PostImage(post: Posts) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(270.dp)
    ) {
        AsyncImage(
            model = post.image,
            contentDescription = post.username,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize(),
            placeholder = painterResource(R.drawable.loading),
            error = painterResource(R.drawable.close)
        )
    }
}

@Composable
fun PostCaption(post: Posts) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp)
    ) {
        Text(text = MockStringRepository().getRandomCaption())
    }
}

@Composable
fun PostActions(post: Posts) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(R.drawable.heart),
                contentDescription = "Like"
            )
        }

        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(
                    R.drawable.comment
                ),
                contentDescription = "Send",
            )
        }
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(
                    R.drawable.share
                ),
                contentDescription = "Send",
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(
                    R.drawable.bookmark
                ),
                contentDescription = "Send",
            )
        }
    }
}