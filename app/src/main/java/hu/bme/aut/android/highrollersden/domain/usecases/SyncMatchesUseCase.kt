package hu.bme.aut.android.highrollersden.domain.usecases

import hu.bme.aut.android.highrollersden.data.local.datasource.MatchRepository
import javax.inject.Inject

class SyncMatchesUseCase @Inject constructor(
    private val repository: MatchRepository
) {
    suspend operator fun invoke(from: String, to: String) {
        repository.syncMatches(from, to)
    }
}