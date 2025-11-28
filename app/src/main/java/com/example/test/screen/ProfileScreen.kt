package com.example.test.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.test.R

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        )
        {
            Box(
                modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                    .clip(RoundedCornerShape(50.dp)) // 🔹 گوشه‌های گرد
            ) {
                Image(
                    painter = painterResource(R.drawable.my_image_1),
                    contentDescription = null,
                    modifier = Modifier.size(80.dp),
                    contentScale = ContentScale.Crop
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ProfileState("posts", "20")
                ProfileState("Following", "100k")
                ProfileState("Follow", "50k")
            }
        }

        Spacer(modifier = Modifier.height(4.dp))
        NameBio()

        Spacer(modifier = Modifier.height(4.dp))
        Button(onClick = {}, modifier = Modifier.fillMaxWidth())
        { Text("Following me") }

        Spacer(modifier = Modifier.height(3.dp))

        // Scrollable Posts Section
        ExploreScreen(navController)
    }
}

@Composable
fun NameBio() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 6.dp)
    ) {
        Column {
            Text(text = "Hossein Masoumi", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = "android Developer Kotlin")
        }
    }
}

@Composable
fun ProfileState(label: String, count: String) {
    Column {
        Text(count, fontWeight = FontWeight.Bold)
        Text(label)
    }
}

@Preview(showBackground = true)
@Composable
fun Per(modifier: Modifier = Modifier) {
    ProfileScreen(navController = rememberNavController())
}