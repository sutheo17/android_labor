package hu.bme.aut.android.highrollersden.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import hu.bme.aut.android.highrollersden.data.local.dao.MatchDao
import hu.bme.aut.android.highrollersden.data.local.dao.BetDao
import hu.bme.aut.android.highrollersden.data.local.entities.MatchEntity
import hu.bme.aut.android.highrollersden.data.local.entities.BetEntity

@Database(entities = [MatchEntity::class, BetEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun matchDao(): MatchDao
    abstract fun betDao(): BetDao
}