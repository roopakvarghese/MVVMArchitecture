package com.films.mycinema.app.utils

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.films.mycinema.app.adapter.ShopsAdapter
import com.films.mycinema.app.models.RvShopViewModel
import com.films.mycinema.app.view.utils.CustomDecorator

@BindingAdapter("setAdapter")
fun setAdapter(rv : RecyclerView, adapter : RecyclerView.Adapter<*>){
    rv.adapter = adapter
}

@BindingAdapter("setData")
fun setData(rv : RecyclerView, data : List<RvShopViewModel>?){
    val adapter = rv.adapter;
    if(adapter is ShopsAdapter){
        adapter.setShopData(data)
    }
}

@BindingAdapter("setDecorator")
fun setDecorator(rv: RecyclerView, decorator: CustomDecorator){
    rv.addItemDecoration(decorator)
}

@BindingAdapter("setShopData")
fun setShopData(rv : RecyclerView, datas : List<RvShopViewModel>?){
    val adapter = rv.adapter
    if(adapter is ShopsAdapter){
        adapter.setShopData(datas)
    }
}