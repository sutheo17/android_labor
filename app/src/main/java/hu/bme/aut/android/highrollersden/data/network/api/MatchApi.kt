package hu.bme.aut.android.highrollersden.data.network.api

import hu.bme.aut.android.highrollersden.data.network.dto.FixturesResponse
import hu.bme.aut.android.highrollersden.data.network.dto.H2HResponse
import hu.bme.aut.android.highrollersden.data.network.dto.LeaguesResponse
import hu.bme.aut.android.highrollersden.data.network.dto.OddsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MatchApi {
    @GET(".")
    suspend fun getFixtures(
        @Query("met") met: String = "Fixtures",
        @Query("APIkey") apiKey: String,
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("leagueId") leagueId: Int? = null
    ): FixturesResponse

    @GET(".")
    suspend fun getLeagues(
        @Query("met") met: String = "Leagues",
        @Query("APIkey") apiKey: String
    ): LeaguesResponse

    @GET(".")
    suspend fun getH2H(
        @Query("met") met: String = "H2H",
        @Query("APIkey") apiKey: String,
        @Query("firstTeamId") firstId: Int,
        @Query("secondTeamId") secondId: Int
    ): H2HResponse

    @GET(".")
    suspend fun getOdds(
        @Query("met") met: String = "Odds",
        @Query("APIkey") apiKey: String,
        @Query("matchId") matchId: Int
    ): OddsResponse
}