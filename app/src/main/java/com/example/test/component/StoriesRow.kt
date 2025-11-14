package com.example.test.component

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.test.data.MockNameRepository

@Composable
fun StoriesRow(navController: NavHostController) {
    LazyRow {
        // آیتم اول - دکمه اضافه کردن استوری
        item {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Card(
                    shape = CircleShape,
                    border = BorderStroke(4.dp, Color.DarkGray),
                    modifier = Modifier.padding(3.dp)
                ) {
                    Box(
                        modifier = Modifier.size(80.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(R.drawable.star_on),
                            contentDescription = "Add Story",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
                Spacer(Modifier.height(2.dp))
                Text(MockNameRepository().getRandomName(), color = Color.DarkGray)
            }
        }

        // استوری‌های دیگر کاربران
        items(30) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Card(
                    shape = CircleShape,
                    border = BorderStroke(4.dp, Color.DarkGray),
                    modifier = Modifier.padding(3.dp)
                ) {
                    Box(
                        modifier = Modifier.size(80.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        // اینجا می‌توانید تصویر پروفایل یا محتوای دیگری بگذارید
                    }
                }
                Spacer(Modifier.height(2.dp))
                Text(MockNameRepository().getRandomName(), color = Color.DarkGray)
            }
        }
    }
}