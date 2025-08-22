package com.manish.composeapplication.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.composeapplication.R

@Composable
fun SignupScreen() {
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
        ComposeTextView("Sign Up For Free", FontWeight.Bold, 20.sp, 0xFF09051C)
        OutlineTextFieldImage()
    }
}