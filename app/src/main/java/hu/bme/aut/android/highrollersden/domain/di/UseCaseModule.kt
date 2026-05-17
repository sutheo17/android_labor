package hu.bme.aut.android.highrollersden.domain.di

import hu.bme.aut.android.highrollersden.data.local.datasource.MatchRepository
import hu.bme.aut.android.highrollersden.domain.usecases.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetMatchesUseCase(repository: MatchRepository): GetMatchesUseCase {
        return GetMatchesUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideSyncMatchesUseCase(repository: MatchRepository): SyncMatchesUseCase {
        return SyncMatchesUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideSaveBetUseCase(repository: MatchRepository): SaveBetUseCase {
        return SaveBetUseCase(repository)
    }

    @Provides
    @Singleton
    fun provideGetBetHistoryUseCase(repository: MatchRepository): GetBetHistoryUseCase {
        return GetBetHistoryUseCase(repository)
    }
}