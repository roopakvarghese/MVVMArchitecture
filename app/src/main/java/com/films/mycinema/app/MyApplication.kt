package com.films.mycinema.app

import android.app.Application
import com.films.mycinema.app.api.ApiClient
import com.films.mycinema.app.api.KidsBuddyApiClient
import com.films.mycinema.app.view.films.ShopRepo
import com.films.mycinema.app.view.films.ShopViewModel
import com.films.mycinema.app.view.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initRetrofit()
        startKoin{
            modules(
                    module {
                        viewModel { HomeViewModel() }
                        viewModel { ShopViewModel(get()) }
                    },
                    module {
                        single {
                            KidsBuddyApiClient.getClient
                        }
                        single {
                            ShopRepo(get())
                        }

                    }
            )
        }
    }

}

private fun initRetrofit(){

}

private fun initViewModel(){

}