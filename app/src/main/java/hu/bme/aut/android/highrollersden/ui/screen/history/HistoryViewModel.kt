package hu.bme.aut.android.highrollersden.ui.screen.history

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HistoryViewModel @Inject constructor() : ViewModel() {
    // Itt később a megtett fogadásokat kérheted le
    val historyItems = listOf("Meccs 1 - Nyert", "Meccs 2 - Vesztett")
}