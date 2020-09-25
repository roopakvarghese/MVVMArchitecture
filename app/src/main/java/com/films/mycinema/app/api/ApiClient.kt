package com.films.mycinema.app.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val API_BASE_URL = "https://en.wikipedia.org/w/"

    //private const val API_KEY = "e19b9bfc"

    fun getClient() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}