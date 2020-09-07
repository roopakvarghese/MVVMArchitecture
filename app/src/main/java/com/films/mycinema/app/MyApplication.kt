package com.films.mycinema.app

import android.app.Application
import com.films.mycinema.app.api.ApiClient
import org.koin.dsl.module


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initRetrofit()
    }

}

private fun initRetrofit(){
    module {
        single {
            ApiClient.getClient()
        }

    }
}