package com.films.mycinema.app.utils.helpers

import android.view.View
import androidx.annotation.IdRes

interface ClickHelper {

    fun onClick(view : View)

    fun onClick(view : View, any : Any)

}