package hu.bme.aut.android.highrollersden.domain.usecases

import hu.bme.aut.android.highrollersden.data.local.datasource.MatchRepository
import hu.bme.aut.android.highrollersden.data.local.entities.MatchEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMatchesUseCase @Inject constructor(
    private val repository: MatchRepository
) {
    operator fun invoke(): Flow<List<MatchEntity>> {
        return repository.getMatches()
    }
}