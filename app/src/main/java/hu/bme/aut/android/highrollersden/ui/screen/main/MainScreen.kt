package hu.bme.aut.android.highrollersden.ui.screen.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.getValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    onMatchClick: (String) -> Unit,
    onHistoryClick: () -> Unit,
    onAboutClick: () -> Unit,
    viewModel: MainViewModel = hiltViewModel()
) {
    // A Flow-t átalakítjuk listává, amit a Compose megért
    val matches by viewModel.matches.collectAsState(initial = emptyList())

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("High Rollers Den") })
        },
        bottomBar = {
            BottomAppBar {
                Button(onClick = onHistoryClick) { Text("Előzmények") }
                Spacer(Modifier.weight(1f))
                Button(onClick = onAboutClick) { Text("Névjegy") }
            }
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(matches) { match -> // Most már tudni fogja, hogy ez egy lista
                ListItem(
                    headlineContent = { Text("${match.homeTeamName} vs ${match.awayTeamName}") },
                    supportingContent = { Text(match.eventDate) },
                    modifier = Modifier.clickable { onMatchClick(match.eventKey) }
                )
            }
        }
    }
}