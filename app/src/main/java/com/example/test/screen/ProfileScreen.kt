package com.example.test.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.test.component.StoryCircleView

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ) {
        // Fixed Header Section
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            StoryCircleView(
                "https://amirrezabajalan.ir/wp-content/uploads/elementor/thumbs/%D8%A7%D9%85%DB%8C%D8%B1%D8%B1%D8%B6%D8%A7-%D8%A8%D8%A7%D8%AC%D9%84%D8%A7%D9%86-r66aemtrkzv2lg7hfd3sm8d0r218mz9ee8l4t0m2fk.webp",
                "Amir",
                80.dp,
                BorderStroke(2.dp, Color.Red)
            )

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
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Following me")
        }

        Spacer(modifier = Modifier.height(4.dp))

        // Scrollable Posts Section
        ExploreScreen(navController)
    }
}

@Composable
fun NameBio() {
    Column {
        Text(text = "Hossein Masoumi", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = "android Developer Kotlin")
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