package hu.bme.aut.android.highrollersden.domain.model

data class MatchDetail(
    val id: String,
    val homeTeamName: String,
    val awayTeamName: String,
    val homeStats: TeamStats,
    val awayStats: TeamStats,
    val odds: Triple<Double, Double, Double>, // Hazai, Döntetlen, Vendég
    val h2hHistory: List<H2HMatch>
)