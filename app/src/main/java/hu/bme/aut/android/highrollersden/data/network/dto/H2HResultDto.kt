package hu.bme.aut.android.highrollersden.data.network.dto

data class H2HResponse(val success: Int, val result: H2HResultDto)
data class H2HResultDto(
    val H2H: List<MatchDto>,
    val firstTeamResults: List<MatchDto>,
    val secondTeamResults: List<MatchDto>
)