package br.com.demate.previews

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.demate.domain.model.movie1
import br.com.demate.ui.components.MoviePoster
import br.com.demate.ui.movies.MovieListScreen

@Preview(backgroundColor = 0xFFFFFF, showBackground = true)
@Composable
private fun MoviePosterPreview() {
    MoviePoster(
        modifier = Modifier.padding(top = 16.dp),
        movie = movie1
    )
}

@Preview(backgroundColor = 0xFFFFFF, showBackground = true)
@Composable
private fun MovieListScreenPreview() {
    MovieListScreen()
}