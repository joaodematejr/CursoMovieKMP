package br.com.demate.ui.movies

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.demate.ui.components.MoviePoster

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
                Column {
                    Text(
                        text = "Movie $index",
                        modifier = Modifier.padding(16.dp),
                        style = MaterialTheme.typography.titleLarge
                    )

                    LazyRow(
                        modifier = Modifier.padding(top = 8.dp),
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        items(10) { itemIndex ->
                            MoviePoster()
                        }
                    }
                }
            }
        }
    }
}