package com.example.test.component


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.test.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun TopNavBar() {
    TopAppBar(
        title = {
            // برای وسط‌چین کردن عنوان
            Box(Modifier.fillMaxWidth()) {
                Text(
                    text = "Instagram",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        },
        navigationIcon = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_like),
                    contentDescription = null
                )
            }
        },
        actions = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_send),
                    contentDescription = null
                )
            }
        }
    )
}


//navigationIcon = سمت چپ 👈
//
//برای ناوبری (رفتن به جاهای دیگه)
//مثل: برگشت، باز کردن منو، رفتن به صفحه قبل
//
//actions = سمت راست 👉
//
//برای اقدام/عملیات (انجام کاری روی صفحه فعلی)
//مثل: لایک، جستجو، اشتراک‌گذاری، تنظیمات


//navigationIcon = {
//    Icon(
//        painterResource(R.drawable.icon_like),
//        contentDescription = "Like",
//        modifier = Modifier.padding(start = 10.dp).size(35.dp)
//    )
//
//
//}, actions = {
//    Icon(
//        painterResource(R.drawable.icon_add),
//        contentDescription = "Like",
//        modifier = Modifier.padding(end = 10.dp).size(35.dp)
//    )
//})