package br.com.demate.data.network.model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializer

@OptIn(ExperimentalSerializationApi::class)
@Serializer(forClass = MovieResponse::class)
data class MovieListResponse(
    val page: Int,
    val results: List<MovieResponse>,
    @SerialName("total_pages")
    val totalPages: Int,
    @SerialName("total_results")
    val totalResults: Int
)

@OptIn(ExperimentalSerializationApi::class)
@Serializer(forClass = MovieResponse::class)
data class MovieResponse(
    val id: Int,
    val title: String,
    val overview: String,
    @SerialName("poster_path")
    val posterPath: String,
)