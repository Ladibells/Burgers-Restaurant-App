package dev.ladibells.burgersrestaurantapp.feature.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.ladibells.burgersrestaurantapp.feature.splash.SplashScreen

@Composable
fun BurgerNavGraph(startDestination: Screens = Screens.SplashScreen) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable<Screens.SplashScreen> {
            SplashScreen()
        }
    }
}