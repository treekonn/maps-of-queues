//package by.treekonn.moq.api
//
//import okhttp3.Interceptor
//import okhttp3.OkHttpClient
//import retrofit2.Retrofit
//import retrofit2.converter.moshi.MoshiConverterFactory
//
////ApiFactory to create TMDB Api
//object ApiFactory{
//
//    //Creating Auth Interceptor to add api_key query in front of all the requests.
//    private val authInterceptor = Interceptor {chain->
//            val newUrl = chain.request().url()
//                    .newBuilder()
//                    .addQueryParameter("api_key", BuildConfig.TMDB_API_KEY)
//                    .build()
//
//            val newRequest = chain.request()
//                    .newBuilder()
//                    .url(newUrl)
//                    .build()
//
//            chain.proceed(newRequest)
//        }
//
//   //OkhttpClient for building http request url
//    private val tmdbClient = OkHttpClient().newBuilder()
//                                .addInterceptor(authInterceptor)
//                                .build()
//
//
//
//    fun retrofit() : Retrofit = Retrofit.Builder()
//                .client(tmdbClient)
//                .baseUrl("https://api.themoviedb.org/3/")
//                .addConverterFactory(MoshiConverterFactory.create())
//                .build()
//
//
//   val tmdbApi : TmdbApi = retrofit().create(TmdbApi::class.java)
//
//}