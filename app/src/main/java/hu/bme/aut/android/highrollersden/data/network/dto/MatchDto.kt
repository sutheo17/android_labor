package hu.bme.aut.android.highrollersden.data.network.dto

data class FixturesResponse(val success: Int, val result: List<MatchDto>)

data class MatchDto(
    val event_key: String,
    val event_date: String,
    val event_time: String,
    val event_home_team: String,
    val event_away_team: String,
    val event_final_result: String?,
    val event_halftime_result: String?,
    val event_status: String?,
    val league_key: String,
    val home_team_logo: String?,
    val away_team_logo: String?
)