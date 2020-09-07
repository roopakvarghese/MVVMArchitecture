package com.films.mycinema.app

import android.app.Application
import com.films.mycinema.app.api.ApiClient
import com.films.mycinema.app.view.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
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

private fun initViewModel(){
    module {
        viewModel { HomeViewModel() }
    }
}