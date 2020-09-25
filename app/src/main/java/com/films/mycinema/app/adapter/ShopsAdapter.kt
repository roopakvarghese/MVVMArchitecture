package com.films.mycinema.app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.films.mycinema.app.BR
import com.films.mycinema.app.R
import com.films.mycinema.app.databinding.RvListShopsBinding
import com.films.mycinema.app.models.RvShopViewModel

class ShopsAdapter : RecyclerView.Adapter<ShopsAdapter.ViewHolder>()  {
    private var shopsViewModels:List<RvShopViewModel> = mutableListOf<RvShopViewModel>()

    fun setShopData(shopsViewModel: List<RvShopViewModel>? ){

        shopsViewModel?.let{
            this.shopsViewModels = it
            notifyDataSetChanged()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DataBindingUtil.inflate<RvListShopsBinding>(
            LayoutInflater.from(parent.context), R.layout.rv_list_shops, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val shop = shopsViewModels[position]
        holder.bind(shop)

    }

    override fun getItemCount(): Int {
        return shopsViewModels.size
    }

    inner class ViewHolder(private val binding: RvListShopsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(shop : RvShopViewModel){
            binding.setVariable(BR.shop, shop)
            binding.executePendingBindings()
        }

    }

}