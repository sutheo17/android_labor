package hu.bme.aut.android.highrollersden.domain.model

data class TeamStats(
    val rank: Int,
    val points: Int,
    val wins: Int,
    val draws: Int,
    val losses: Int
)