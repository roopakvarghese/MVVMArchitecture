package com.films.mycinema.app.models

import androidx.databinding.ObservableField

data class MovieViewModel(val ns: Int,
                          val title: String,
                          val pageid: Int,
                          val size: Int,
                          val wordcount: Int,
                          val snippet: String,
                          val timestamp: String)