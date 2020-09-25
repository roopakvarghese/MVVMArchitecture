package com.films.mycinema.app.api

import com.films.mycinema.app.models.Model
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*


interface ApiInterface {
    @GET("api.php")
    fun hitCountCheck(@Query("action") action: String,
                      @Query("format") format: String,
                      @Query("list") list: String,
                      @Query("srsearch") srsearch: String) : Observable
}