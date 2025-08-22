package com.manish.composeapplication.ui

sealed class AppRouteScreen(val route: String) {
    object SplashScreen : AppRouteScreen("splash_screen")
    object IllustrationScreen : AppRouteScreen("illustration_screen")
    object LoginScreen : AppRouteScreen("login_screen")
    object SignupScreen : AppRouteScreen("signup_screen")
}