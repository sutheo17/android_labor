package hu.bme.aut.android.highrollersden.ui.screen.match_details

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
fun MatchDetailsScreen(
    onBack: () -> Unit,
    viewModel: MatchDetailsViewModel = hiltViewModel()
) {
    //TODO: add this back
/*
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Meccs részletek") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Vissza")
                    }
                }
            )
        }

    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            Text("${details.homeTeamName} (#${details.homeStats.rank})", style = MaterialTheme.typography.headlineSmall)
            Text("vs")
            Text("${details.awayTeamName} (#${details.awayStats.rank})", style = MaterialTheme.typography.headlineSmall)

            Spacer(Modifier.height(16.dp))
            Text("Oddsok: H: ${details.odds.first} | D: ${details.odds.second} | V: ${details.odds.third}")

            Spacer(Modifier.height(16.dp))
            Text("Egymás elleni eredmények:", style = MaterialTheme.typography.titleMedium)
            details.h2hHistory.forEach { h2h ->
                Text("${h2h.date}: ${h2h.fullTimeScore} (${h2h.halfTimeScore})")
            }
        }
    }*/
}