package br.com.demate.domain.model

data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    val posterUrl: String,
)

// fake obj
val movie1 = Movie(
    id = 1,
    title = "Movie Title",
    overview = "Movie Overview",
    posterUrl = "https://image.tmdb.org/t/p/w500/kqjL"
)
