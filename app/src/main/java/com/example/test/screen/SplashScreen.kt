package com.example.test.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ModernLoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var selectedTab by remember { mutableIntStateOf(0) } // 0 = Login, 1 = Sign Up

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF5C3D2E)) // رنگ قهوه‌ای
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // بخش بالا با متن خوش‌آمدگویی
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.4f)
                    .padding(top = 60.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Hey!",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = "Welcome Back",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.White
                )
            }

            // بخش پایین با فرم
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.6f)
                    .background(
                        color = Color(0xFFF5E6E0),
                        shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                    )
                    .padding(horizontal = 32.dp, vertical = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // تب‌های Login و Sign Up
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 24.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Login",
                        fontSize = 20.sp,
                        fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Normal,
                        color = if (selectedTab == 0) Color.Black else Color.Gray,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                    )
                    Text(
                        text = "Sign Up",
                        fontSize = 20.sp,
                        fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Normal,
                        color = if (selectedTab == 1) Color.Black else Color.Gray
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // فیلد Email
                Text(
                    text = "Email",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedBorderColor = Color(0xFF5C3D2E),
                        unfocusedBorderColor = Color(0xFF5C3D2E)
                    ),
                    shape = RoundedCornerShape(28.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                // فیلد Password
                Text(
                    text = "Password",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedBorderColor = Color(0xFF5C3D2E),
                        unfocusedBorderColor = Color(0xFF5C3D2E)
                    ),
                    shape = RoundedCornerShape(28.dp)
                )

                Spacer(modifier = Modifier.height(32.dp))

                // دکمه Login
                Button(
                    onClick = { navController.navigate("Splash") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF5C3D2E)
                    ),
                    shape = RoundedCornerShape(28.dp)
                ) {
                    Text(
                        text = "Login",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // متن Sign Up
                Text(
                    text = "Or sign up here",
                    fontSize = 14.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.weight(1f))

                // Terms & Conditions
                Text(
                    text = "Terms & Conditions Apply*",
                    fontSize = 12.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ModernLoginScreenPreview() {
    ModernLoginScreen(navController = rememberNavController())
}