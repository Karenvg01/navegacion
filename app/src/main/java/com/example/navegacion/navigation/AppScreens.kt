package com.example.navegacion.navigation

sealed class AppScreens (val route: String){
    object FirstScreen: AppScreens("First_screen")
    object SecondScreen:AppScreens("Second_screen")
}