package br.com.demate.data.network

import br.com.demate.data.network.model.MovieListResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

private const val BASE_URL = "https://api.themoviedb.org/3/"
const val IMAGE_SMALL_BASE_URL = "https://image.tmdb.org/p/w154"

object KtorClient {

    private val client = HttpClient {
        install(ContentNegotiation) {
            json(
                Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                }
            )
        }

        install(Auth) {
            bearer {
                loadTokens {
                    BearerTokens(
                        accessToken = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1ODdiMWU3ZGQzZTViOThhMDA4NDQ3ZmI0MDBkZDVmOCIsIm5iZiI6MTY2OTkwNzA1Ny4yOCwic3ViIjoiNjM4OGMyNzEwMzk4YWIwMGE4ZmMxNDgwIiwic2NvcGVzIjpbImFwaV9yZWFkIl0sInZlcnNpb24iOjF9.DYTxlCiyaAPmTfrVFAXwiN6nzx4htFHu83lF834Gr8M",
                        refreshToken = ""
                    )
                }
            }
        }

        // install(Logging) {
        //     logger = Logger.DEFAULT
        //     level = LogLevel.ALL
        // }

    }

    suspend fun getMovie(category: String, language: String = "pt-BR"): MovieListResponse {
        return client.get("$BASE_URL/movie/$category") {
            parameter("language", language)
        }.body()
    }
}