package com.example.quizlizard.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizlizard.R
@Composable
fun AccountScreen(
    username: String,
    email: String,
    streak: Int,
    onLogout: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF800020)) // Burgundy background
    ) {
        // Top AppBar section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Color(0xFF800020)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Account",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // White profile area
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_user_icon), // Ensure this resource exists
                contentDescription = "User Icon",
                tint = Color.Black,
                modifier = Modifier.size(100.dp)
            )
        }

        // Info section (red background)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 24.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Username: $username",
                color = Color.White,
                fontSize = 16.sp
            )
            Text(
                text = "Email: $email",
                color = Color.White,
                fontSize = 16.sp
            )
            Text(
                text = "Streak: $streak",
                color = Color.White,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.weight(1f))

            // Logout Button
            Button(
                onClick = onLogout,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 24.dp)
                    .height(40.dp)
                    .width(100.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Text("Logout", color = Color.Black)
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun AccountScreenPreview() {
    AccountScreen(
        username = "JohnDoe",
        email = "johndoe@example.com",
        streak = 5,
        onLogout = {}
    )
}