package br.com.demate.ui.movies

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.demate.domain.model.movie1
import br.com.demate.ui.components.MoviesSection

@Composable
fun MoviesListRoute() {
    MovieListScreen()
}

@Composable
fun MovieListScreen() {
    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier.padding(paddingValues),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {
            items(20) { index ->
                MoviesSection(
                    title = "Movies",
                    movies = List(10) {
                        movie1
                    },
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
        }
    }
}