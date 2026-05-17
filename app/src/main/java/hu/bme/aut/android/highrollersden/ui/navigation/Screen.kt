package hu.bme.aut.android.highrollersden.ui.navigation

sealed class Screen(val route: String) {
    data object Main : Screen("main")
    data object MatchDetails : Screen("details/{matchId}") {
        fun createRoute(matchId: String) = "details/$matchId"
    }
    data object History : Screen("history")
    data object About : Screen("about")
}