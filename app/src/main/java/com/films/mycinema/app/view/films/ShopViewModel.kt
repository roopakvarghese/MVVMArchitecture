package com.films.mycinema.app.view.films

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.databinding.ObservableList
import androidx.lifecycle.viewModelScope
import com.films.mycinema.app.api.service.ApiInterface
import com.films.mycinema.app.models.RvShopViewModel
import com.films.mycinema.app.view.BaseViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShopViewModel(private val repo: ShopRepo)
    : BaseViewModel() {

    var rvShopViewModel:ObservableList<RvShopViewModel>? = ObservableArrayList()

    fun callApi(){
        rvShopViewModel?.clear()
        viewModelScope.launch(Dispatchers.IO+handler) {
           val response = repo.getDataFromCloud()
            response?.let { apiResponse ->
                val query = apiResponse.query.search
                query.forEach{
                    val shop = RvShopViewModel(shopName = ObservableField(it.title)
                            , ownerName = ObservableField(it.title)
                            ,mobileNo = ObservableField(it.pageid.toString()))
                    rvShopViewModel?.add(shop)
                }

            }

        }
    }

    private val handler = CoroutineExceptionHandler { _, exception ->
        println("CoroutineExceptionHandler got $exception")
    }


}