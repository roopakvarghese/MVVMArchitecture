package com.films.mycinema.app.api.service

import com.films.mycinema.app.models.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*


interface ApiInterface {
    @GET("api.php")
    suspend fun hitCountCheck(@Query("action") action: String,
                      @Query("format") format: String,
                      @Query("list") list: String,
                      @Query("srsearch") srsearch: String) : Response<ApiResponse>
}