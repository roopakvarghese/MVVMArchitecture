package com.films.mycinema.app.view

import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.films.mycinema.app.utils.helpers.ClickHelper

open class BaseFragment : Fragment(), ClickHelper {

    protected fun navigate(navDirections : NavDirections){
        findNavController().navigate(navDirections)
    }

    override fun onClick(view: View) {

    }

    override fun onClick(view: View, any: Any) {

    }

}