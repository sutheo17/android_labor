package hu.bme.aut.android.highrollersden.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bets")
data class BetEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val matchId: String,
    val homeTeam: String,
    val awayTeam: String,
    val eventDate: String,
    val eventTime: String,
    val prediction: String, // "Hazai", "Döntetlen", "Vendég"
    val finalResult: String? = null,
    val halfTimeResult: String? = null,
    val isWin: Boolean? = null
)