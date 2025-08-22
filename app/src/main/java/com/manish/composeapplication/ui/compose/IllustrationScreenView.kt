package com.manish.composeapplication.ui.compose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.manish.composeapplication.R
import com.manish.composeapplication.ui.AppRouteScreen
import com.manish.composeapplication.ui.theme.ComposeApplicationTheme

@Composable
fun IntroScreenView(value: Int?, navController: NavController) {
    println("Value Passed: $value")
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    )
    var illustratorImage = painterResource(R.drawable.illustartion)
    if (value == 1) {
        illustratorImage = painterResource(R.drawable.illustration_next)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 56.83.dp)
            .wrapContentSize(Alignment.Center)
    ) {

        Image(
            painter = illustratorImage,
            contentDescription = "Illustrator Image",
            modifier = Modifier
                .width(408.5.dp)
                .height(434.22.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            Alignment.Center
        ) {
            var text = "Find your comfort\nFood here"
            if (value == 1) {
                text = "Food Ninja is Where Your\nComfort Food Lives"
            }
            Text(
                text = text,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )

        }
        Spacer(modifier = Modifier.padding(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            Alignment.Center
        ) {
            var text = "Here you can find a chef or dish for every\ntaste and color. Enjoy!"
            if (value == 1) {
                text = "Enjoy a fast and smooth food delivery at\nyour doorstep"
            }
            Text(
                text = text,
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Box(modifier = Modifier.fillMaxWidth(), Alignment.Center) {
            Button(
                onClick = {
                    Toast.makeText(navController.context, "Button Clicked", Toast.LENGTH_LONG)
                        .show()
                    if (value == 0) {
                        navController.navigate(
                            route = AppRouteScreen.IllustrationScreen.route + "?value=${1}"
                        ) {
                            popUpTo(navController.graph.id)
                        }
                    } else {
                        navController.navigate(route = AppRouteScreen.LoginScreen.route) {
                            popUpTo(navController.graph.id)
                        }
                    }
                },
            ) {
                Text(text = "Next")
            }
        }
    }
}