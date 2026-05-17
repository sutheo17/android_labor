package hu.bme.aut.android.highrollersden.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import hu.bme.aut.android.highrollersden.ui.screen.about.AboutScreen
import hu.bme.aut.android.highrollersden.ui.screen.history.HistoryScreen
import hu.bme.aut.android.highrollersden.ui.screen.main.MainScreen
import hu.bme.aut.android.highrollersden.ui.screen.match_details.MatchDetailsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {
        // 1. Főoldal (Meccslista)
        composable(Screen.Main.route) {
            MainScreen(
                onMatchClick = { matchId ->
                    navController.navigate(Screen.MatchDetails.createRoute(matchId))
                },
                onHistoryClick = {
                    navController.navigate(Screen.History.route)
                },
                onAboutClick = {
                    navController.navigate(Screen.About.route)
                }
            )
        }

        // 2. Meccs részletei (Paraméteres útvonal)
        composable(
            route = Screen.MatchDetails.route,
            arguments = listOf(navArgument("matchId") { type = NavType.StringType })
        ) {
            // A ViewModel automatikusan megkapja a matchId-t a SavedStateHandle-en keresztül,
            // de itt is hivatkozhatunk rá, ha szükséges.
            MatchDetailsScreen(
                onBack = { navController.popBackStack() }
            )
        }

        // 3. Előzmények és statisztika
        composable(Screen.History.route) {
            HistoryScreen(
                onBack = { navController.popBackStack() }
            )
        }

        // 4. Névjegy
        composable(Screen.About.route) {
            AboutScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}