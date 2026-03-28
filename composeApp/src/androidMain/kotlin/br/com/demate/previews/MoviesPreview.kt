package br.com.demate.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.demate.ui.components.MoviePoster
import br.com.demate.ui.movies.MovieListScreen

@Preview(backgroundColor = 0xFFFFFF, showBackground = true)
@Composable
private fun MoviePosterPreview() {
    MoviePoster()
}

@Preview(backgroundColor = 0xFFFFFF, showBackground = true)
@Composable
private fun MovieListScreenPreview() {
    MovieListScreen()
}