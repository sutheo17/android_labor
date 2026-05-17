package hu.bme.aut.android.highrollersden.data.local.dao

import androidx.room.*
import hu.bme.aut.android.highrollersden.data.local.entities.MatchEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MatchDao {
    @Query("SELECT * FROM matches ORDER BY eventDate DESC")
    fun getAllMatches(): Flow<List<MatchEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMatches(matches: List<MatchEntity>)

    @Query("DELETE FROM matches")
    suspend fun clearMatches()

    @Transaction
    suspend fun refreshMatches(matches: List<MatchEntity>) {
        clearMatches()
        insertMatches(matches)
    }
}