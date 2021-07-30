package by.treekonn.moq

import by.treekonn.moq.api.TmdbApi
import by.treekonn.moq.api.TmdbMovie

class MovieRepository(private val api: TmdbApi) : BaseRepository() {

    suspend fun getPopularMovies(): MutableList<TmdbMovie>? {

        //safeApiCall is defined in BaseRepository.kt (https://gist.github.com/navi25/67176730f5595b3f1fb5095062a92f15)
        val movieResponse = safeApiCall(
            call = { api.getPopularMovies().await() },
            errorMessage = "Error Fetching Popular Movies"
        )

        return movieResponse?.results.toMutableList();

    }

}