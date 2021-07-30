package by.treekonn.moq.api

import retrofit2.http.GET

interface TmdbApi {

    @GET("movie/popular")
    fun getPopularMovies(): TmdbMovieResponse

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