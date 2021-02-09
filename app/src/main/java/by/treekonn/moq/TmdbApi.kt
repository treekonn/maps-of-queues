package by.treekonn.moq

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface TmdbApi {

    @GET("movie/popular")
    fun getPopularMovies(): Deferred<Response<TmdbMovieResponse>>

//    @GET("movie/{id}")
//    fun getMovieById(@Path("id") id: Int): Deferred<Response<Movie>>
}

// Data Model for TMDB Movie item
data class TmdbMovie(
    val id: Int,
    val vote_average: Double,
    val title: String,
    val overview: String,
    val adult: Boolean
)

// Data Model for the Response returned from the TMDB Api
data class TmdbMovieResponse(
    val results: List<TmdbMovie>
)