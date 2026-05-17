package hu.bme.aut.android.highrollersden.domain.model

data class Match(
    val id: String,
    val homeTeam: String,
    val awayTeam: String,
    val date: String,
    val homeOdds: Double,
    val drawOdds: Double,
    val awayOdds: Double
)