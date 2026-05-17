package hu.bme.aut.android.highrollersden.ui.screen.about

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AboutViewModel @Inject constructor() : ViewModel() {
    val appVersion = "1.0.0"
    val developer = "Sütheö István (XOBJYX)"
}