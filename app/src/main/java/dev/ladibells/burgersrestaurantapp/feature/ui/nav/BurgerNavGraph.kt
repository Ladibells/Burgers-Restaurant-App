package dev.ladibells.burgersrestaurantapp.feature.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun BurgerNavGraph(startDestination: Screens = Screens.SplashScreen) {

    val navController = rememberNavController()
}