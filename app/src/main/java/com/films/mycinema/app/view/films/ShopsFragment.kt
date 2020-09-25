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
import org.koin.android.viewmodel.ext.android.viewModel

class ShopsFragment: BaseFragment()  {

    val vm : ShopViewModel by viewModel()

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
        binding.vm = vm
        val adapter = ShopsAdapter();
        binding.adapter = adapter
        binding.decorator = CustomDecorator(10,0)
        return binding.root
    }





    override fun onClick(view: View) {
        when(view.id){
            R.id.btnCallApi->{
                vm.callApi()

            }
        }
    }

}