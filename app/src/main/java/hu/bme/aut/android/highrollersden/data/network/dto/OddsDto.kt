package hu.bme.aut.android.highrollersden.data.network.dto

data class OddsResponse(val success: Int, val result: Map<String, List<OddsDto>>)
data class OddsDto(
    val match_id: String,
    val odd_bookmakers: String,
    val odd_1: String,
    val odd_x: String,
    val odd_2: String
)