package hu.bme.aut.android.highrollersden.domain.usecases

import hu.bme.aut.android.highrollersden.data.local.datasource.MatchRepository
import hu.bme.aut.android.highrollersden.data.local.entities.BetEntity
import javax.inject.Inject

class SaveBetUseCase @Inject constructor(
    private val repository: MatchRepository
) {
    suspend operator fun invoke(bet: BetEntity) {
        repository.saveBet(bet)
    }
}