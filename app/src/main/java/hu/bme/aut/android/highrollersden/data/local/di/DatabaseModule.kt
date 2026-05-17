package hu.bme.aut.android.highrollersden.data.local.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import hu.bme.aut.android.highrollersden.data.local.AppDatabase
import hu.bme.aut.android.highrollersden.data.local.dao.MatchDao
import hu.bme.aut.android.highrollersden.data.local.dao.BetDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "high_rollers_db"
        ).build()
    }

    @Provides
    fun provideMatchDao(database: AppDatabase): MatchDao = database.matchDao()

    @Provides
    fun provideBetDao(database: AppDatabase): BetDao = database.betDao()
}