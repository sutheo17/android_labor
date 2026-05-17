package hu.bme.aut.android.highrollersden.data.local.datasource

import hu.bme.aut.android.highrollersden.data.network.mapper.asEntity

import hu.bme.aut.android.highrollersden.data.local.dao.BetDao
import hu.bme.aut.android.highrollersden.data.local.dao.MatchDao
import hu.bme.aut.android.highrollersden.data.local.entities.BetEntity
import hu.bme.aut.android.highrollersden.data.local.entities.MatchEntity
import hu.bme.aut.android.highrollersden.data.network.api.MatchApi
import hu.bme.aut.android.highrollersden.data.network.dto.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MatchRepository @Inject constructor(
    private val matchApi: MatchApi,
    private val matchDao: MatchDao,
    private val betDao: BetDao
) {
    private val apiKey = "ab94238a125323b91db164fc453587487ba81d4f431cffcd3737d98c9eee5628"

    suspend fun getLeagues(): Result<List<LeagueDto>> = withContext(Dispatchers.IO) {
        try {
            val response = matchApi.getLeagues(apiKey = apiKey)
            if (response.success == 1) Result.success(response.result)
            else Result.failure(Exception("API hiba a ligák lekérésekor"))
        } catch (e: Exception) { Result.failure(e) }
    }

    suspend fun getH2HResults(firstTeamId: Int, secondTeamId: Int): Result<H2HResultDto> = withContext(Dispatchers.IO) {
        try {
            val response = matchApi.getH2H(apiKey = apiKey, firstId = firstTeamId, secondId = secondTeamId)
            if (response.success == 1) Result.success(response.result)
            else Result.failure(Exception("H2H adatok nem elérhetőek"))
        } catch (e: Exception) { Result.failure(e) }
    }

    suspend fun getMatchOdds(matchId: Int): Result<List<OddsDto>> = withContext(Dispatchers.IO) {
        try {
            val response = matchApi.getOdds(apiKey = apiKey, matchId = matchId)
            val oddsList = response.result[matchId.toString()]
            if (response.success == 1 && oddsList != null) Result.success(oddsList)
            else Result.failure(Exception("Odds adatok nem elérhetőek"))
        } catch (e: Exception) { Result.failure(e) }
    }

    suspend fun saveBet(bet: BetEntity) = withContext(Dispatchers.IO) {
        betDao.insertBet(bet)
    }

    fun getBetHistory(): Flow<List<BetEntity>> {
        return betDao.getAllBets()
    }

    suspend fun syncMatches(from: String, to: String) = withContext(Dispatchers.IO) {
        try {
            val response = matchApi.getFixtures(apiKey = apiKey, from = from, to = to)
            if (response.success == 1) {
                // A map {} most már látja az asEntity() függvényt
                matchDao.refreshMatches(response.result.map { it.asEntity() })
            }
        } catch (e: Exception) { /* Hiba kezelése */ }
    }

    fun getMatches(): Flow<List<MatchEntity>> = matchDao.getAllMatches()
}