package com.example.instagram.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.instagram.R
import com.example.instagram.models.Post
import net.holosen.socialmedia.ui.theme.RedColor

@Composable
fun PossView(posts: ArrayList<Post>) {
    LazyColumn {
        items(posts.size) {
            PostItem(posts[it])


        }
    }
}
@Composable
fun PostItem(post: Post) {
    var liked by remember { mutableStateOf(false) }
    Column(modifier = Modifier.padding(10.dp)) {
        Row {
            Card(
                modifier = Modifier.size(40.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(8.dp)

            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current).data(post.user.image)
                        .crossfade(true).build(),
                    placeholder = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = post.user.username,
                    contentScale = ContentScale.Crop,
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 5.dp)
                    .weight(1f)
            ) {
                Text(
                    text = post.user.fullName, fontSize = 15.sp, fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = post.location,
                    fontSize = 15.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(2.dp)
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    Icons.Filled.MoreVert, contentDescription = ""
                )
            }
        }
        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(8.dp)

        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(post.image).crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.images),
                contentDescription = post.user.username,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            IconButton(onClick = {liked=!liked}) {
                Icon(
                  if (liked) Icons.Filled.Favorite else  Icons.Outlined.FavoriteBorder,
                    contentDescription = ",mod",
                    Modifier.size(28.dp),
                    tint  =if (liked) RedColor else Color.Gray
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    Icons.Outlined.Send,
                    contentDescription = ",mod",
                    Modifier.size(28.dp), tint = Color.Gray
                )
            }
        }
        Text(
            post.caption, fontSize = 15.sp, textAlign = TextAlign.Justify, color = Color.Gray
        )


    }

}