package hu.bme.aut.android.highrollersden

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import hu.bme.aut.android.highrollersden.ui.navigation.AppNavigation
import hu.bme.aut.android.highrollersden.ui.theme.HighRollersDenTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HighRollersDenTheme {
                AppNavigation()
            }
        }
    }
}