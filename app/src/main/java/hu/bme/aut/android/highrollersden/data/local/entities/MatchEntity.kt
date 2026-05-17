package hu.bme.aut.android.highrollersden.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "matches")
data class MatchEntity(
    @PrimaryKey val eventKey: String,
    val eventDate: String,
    val eventTime: String,
    val homeTeamName: String,
    val awayTeamName: String,
    val homeTeamLogo: String?,
    val awayTeamLogo: String?,
    val finalResult: String?,
    val halfTimeResult: String?,
    val leagueKey: String
)