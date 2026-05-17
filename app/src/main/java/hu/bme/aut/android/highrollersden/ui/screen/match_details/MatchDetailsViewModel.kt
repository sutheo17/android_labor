package hu.bme.aut.android.highrollersden.ui.screen.match_details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import hu.bme.aut.android.highrollersden.data.local.datasource.MatchRepository
import javax.inject.Inject

    @HiltViewModel
    class MatchDetailsViewModel @Inject constructor(
        private val repository: MatchRepository,
        savedStateHandle: SavedStateHandle
    ) : ViewModel() {
        // Kinyerjük az ID-t a navigációs argumentumból
        //TODO add this back:
    // private val matchId: String = checkNotNull(savedStateHandle["matchId"])
    }