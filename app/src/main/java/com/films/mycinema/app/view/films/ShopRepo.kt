package com.films.mycinema.app.view.films

import com.films.mycinema.app.api.service.ApiInterface
import com.films.mycinema.app.models.ApiResponse
import retrofit2.Retrofit
import java.lang.Exception

class ShopRepo(private val retrofit: Retrofit) {

    suspend fun getDataFromCloud() : ApiResponse? {
        val service = retrofit.create(ApiInterface::class.java)
        val respnse = service.hitCountCheck(
                action = "query"
                ,format = "json"
                , list = "search"
                ,srsearch = "Trump")
        if(respnse.isSuccessful){
            return respnse.body()
        }else{
            throw Exception(respnse.message())
        }

    }

}