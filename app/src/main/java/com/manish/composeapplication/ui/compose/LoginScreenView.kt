package com.manish.composeapplication.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.manish.composeapplication.R
import com.manish.composeapplication.ui.theme.ComposeApplicationTheme

@Composable
fun LoginScreenView(navController: NavController) {
    val state = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(state),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            Modifier
                .height(300.dp)
                .fillMaxWidth()
        ) {
            Box {
                val painter = painterResource(R.drawable.pattern)

                Image(
                    painter = painter,
                    contentDescription = "Splash Screen Image",
                    modifier = Modifier.fillMaxSize()
                )
            }
            Box(Modifier.align(Alignment.Center)) {
                val logo = painterResource(R.drawable.logo)
                Image(
                    painter = logo,
                    contentDescription = "Splash Logo",
                    modifier = Modifier.fillMaxWidth()

                )
            }
        }
        ComposeTextView("Login To Your Account", FontWeight.Bold, 20.sp, 0xFF09051C)
        ComposeOutlineTextField("Email", false, true, false)
        ComposeOutlineTextField("Password", true, false, false)
        ComposeTextView("or Continue With", FontWeight.Bold, 12.sp, 0xFF09051C)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(0.dp, 0.dp, 10.dp, 0.dp)
            ) {
                ButtonWithImageAndText("Facebook", R.drawable.facebook, onClick = {
                    println("Facebook Button Clicked")
                })
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(10.dp, 0.dp, 0.dp, 0.dp)
            ) {
                ButtonWithImageAndText("Google", R.drawable.google_icon, onClick = {
                    println("Google Button Clicked")
                })
            }
        }
        ComposeTextView("Forgot Your Password?", FontWeight.Normal, 16.sp, 0xFF53E88B)
        Spacer(modifier = Modifier.padding(10.dp))
        Box(modifier = Modifier.fillMaxWidth(), Alignment.Center) {
            Button(
                onClick = {
                    navController.navigate("signup_screen") // Navigate to Signup Screen
                    {
                        popUpTo(navController.graph.id)
                    }
                },
            ) {
                Text(text = "Login")
            }
        }
    }
}