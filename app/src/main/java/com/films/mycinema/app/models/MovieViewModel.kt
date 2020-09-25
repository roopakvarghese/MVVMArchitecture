package com.films.mycinema.app.models

import androidx.databinding.ObservableField

data class MovieViewModel(val ns: ObservableField<String>,
                          val title: ObservableField<String>,
                          val pageid: ObservableField<String>,
                          val size: ObservableField<String>,
                          val wordcount: ObservableField<String>,
                          val snippet: ObservableField<String>,
                          val timestamp: ObservableField<String>)