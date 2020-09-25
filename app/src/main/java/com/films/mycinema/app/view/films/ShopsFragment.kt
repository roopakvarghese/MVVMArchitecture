package com.films.mycinema.app.view.films

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.films.mycinema.app.R
import com.films.mycinema.app.adapter.ShopsAdapter
import com.films.mycinema.app.databinding.FragmentShopesBinding
import com.films.mycinema.app.models.RvShopViewModel
import com.films.mycinema.app.view.BaseFragment
import com.films.mycinema.app.view.utils.CustomDecorator

import kotlinx.android.synthetic.main.fragment_shopes.*

class ShopsFragment: BaseFragment()  {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentShopesBinding = DataBindingUtil.inflate(inflater
        , R.layout.fragment_shopes
        ,container
        ,false)
        binding.clickHelper = this
        val adapter = ShopsAdapter();
        adapter.setShopData(dummyData());
        binding.adapter = adapter
        binding.decorator = CustomDecorator(10,0)
        return binding.root
    }



    private fun dummyData() : List<RvShopViewModel>{
        return arrayListOf(
            RvShopViewModel(ObservableField("Shop name")
                ,ObservableField("owner Name")
                ,ObservableField("9758475978"))
            ,  RvShopViewModel(ObservableField("Shop name")
                ,ObservableField("owner Name")
                ,ObservableField("9758475978"))
            ,  RvShopViewModel(ObservableField("Shop name")
                ,ObservableField("owner Name")
                ,ObservableField("9758475978"))
        )
    }

    override fun onClick(view: View) {
        when(view){

        }
    }

}