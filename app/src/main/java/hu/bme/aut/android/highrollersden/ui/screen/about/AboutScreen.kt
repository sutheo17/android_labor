package hu.bme.aut.android.highrollersden.ui.screen.about

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(
    onBack: () -> Unit,
    viewModel: AboutViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Névjegy") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Vissza")
                    }
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("High Rollers Den", style = MaterialTheme.typography.headlineMedium)
            Text("Verzió: ${viewModel.appVersion}")
            Text("Fejlesztő: ${viewModel.developer}")
            Spacer(Modifier.height(16.dp))
            Text("Ez az alkalmazás a VIAUMB02 labor keretében készült.")
        }
    }
}