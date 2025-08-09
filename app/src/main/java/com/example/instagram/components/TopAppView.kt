package com.example.instagram.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.holosen.socialmedia.ui.theme.RedColor
import net.holosen.socialmedia.ui.theme.VioletColor

@Preview
@Composable
fun TopAppView() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(7.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Social Media",
            color = if (isSystemInDarkTheme()) Color.White else VioletColor,
            fontFamily = FontFamily.Cursive,
            fontSize = 25.sp,
            modifier = Modifier.weight(1f)
        )

        IconButton(onClick = { /*TODO*/ }) {
            Box(contentAlignment = Alignment.BottomEnd) {
                Icon(Icons.AutoMirrored.Filled.Send, contentDescription = "")
                Card(
                    shape = RoundedCornerShape(50), modifier = Modifier.size(14.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(RedColor),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "+9", color = Color.White, fontSize = 10.sp
                        )
                    }
                }
            }
        }
    }
}