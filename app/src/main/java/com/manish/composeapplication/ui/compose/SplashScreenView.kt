package com.manish.composeapplication.ui.compose

import android.content.Context
import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.manish.composeapplication.R
import com.manish.composeapplication.ui.AppRouteScreen

@Composable
fun SplashMainEntry(navController: NavController) {
    SplashScreenView()
    val handler = Handler(Looper.getMainLooper())
    handler.postDelayed({
        navController.navigate(route = AppRouteScreen.IllustrationScreen.route + "?value=${0}") {
            popUpTo(navController.graph.id)
        }
    }, 2000)
}

@Composable
fun SplashScreenView() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        Alignment.Center
    ) {
        val painter = painterResource(R.drawable.pattern)
        val logo = painterResource(R.drawable.logo)
        Image(
            painter = painter,
            contentDescription = "Splash Screen Image",
            modifier = Modifier
                .width(375.dp)
                .height(812.dp),
            alignment = Alignment.Center
        )
        Image(
            painter = logo,
            contentDescription = "Splash Logo",
            alignment = Alignment.Center,
            modifier = Modifier
                .width(188.dp)
                .height(203.dp)

        )
    }
}