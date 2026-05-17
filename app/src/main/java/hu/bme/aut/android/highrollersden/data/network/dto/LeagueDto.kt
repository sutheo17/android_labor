package hu.bme.aut.android.highrollersden.data.network.dto

data class LeaguesResponse(val success: Int, val result: List<LeagueDto>)
data class LeagueDto(
    val league_key: String,
    val league_name: String,
    val country_name: String,
    val league_logo: String?
)