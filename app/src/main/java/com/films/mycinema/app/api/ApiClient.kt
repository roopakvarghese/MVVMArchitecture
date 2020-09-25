package com.films.mycinema.app.api

import com.films.mycinema.app.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {

    private const val API_BASE_URL = "https://en.wikipedia.org/w/"

    //private const val API_KEY = "e19b9bfc"



    fun getClient() : Retrofit{
        val interceptor = HttpLoggingInterceptor()
        interceptor.apply { interceptor.level = HttpLoggingInterceptor.Level.BODY }
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

}
object KidsBuddyApiClient{

    val getClient : Retrofit
        get() {
            val logging = HttpLoggingInterceptor()

            logging.level = if(BuildConfig.DEBUG){HttpLoggingInterceptor.Level.BODY}else{
                HttpLoggingInterceptor.Level.BASIC}

            val authInterceptor = object: Interceptor {
                override fun intercept(chain: Interceptor.Chain): Response {
                    val original = chain.request()
                    val requestBuilder: Request.Builder = original.newBuilder()
                            .header("Content-Type", "application/json")
                    val request = requestBuilder.build()
                    return chain.proceed(request)
                }
            }

            val httpClient = OkHttpClient.Builder()
            httpClient.addInterceptor(logging)
            httpClient.addInterceptor(authInterceptor)

            return Retrofit.Builder()
                    .baseUrl("https://en.wikipedia.org/w/")
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
}