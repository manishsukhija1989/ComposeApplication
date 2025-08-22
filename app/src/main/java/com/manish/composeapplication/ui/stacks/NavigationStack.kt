package com.manish.composeapplication.ui.stacks

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.manish.composeapplication.ui.AppRouteScreen
import com.manish.composeapplication.ui.compose.IntroScreenView
import com.manish.composeapplication.ui.compose.LoginScreenView
import com.manish.composeapplication.ui.compose.SignupScreen
import com.manish.composeapplication.ui.compose.SplashMainEntry

@Composable
fun NavigationStack() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppRouteScreen.SplashScreen.route) {
        composable(route = AppRouteScreen.SplashScreen.route) {
            SplashMainEntry(navController)
        }
        composable(route = AppRouteScreen.IllustrationScreen.route + "?value={value}",
            arguments = listOf(
                navArgument("value") {
                    type = NavType.IntType
                }
            )
        ) {
            IntroScreenView(value = it.arguments?.getInt("value"), navController)
        }
        composable(route = AppRouteScreen.LoginScreen.route) {
            LoginScreenView(navController)
        }
        composable(route = AppRouteScreen.SignupScreen.route) {
            SignupScreen()
        }
    }
}