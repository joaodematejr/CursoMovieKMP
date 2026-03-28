package br.com.demate

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.demate.navigation.AppRoutes
import br.com.demate.ui.movies.MoviesListRoute


@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        NavHost(navController, startDestination = AppRoutes.MoviesList) {
            composable<AppRoutes.MoviesList> {
                MoviesListRoute()
            }
            composable<AppRoutes.MovieDetail> {
                Text("Movie Detail")
            }
        }
    }
}