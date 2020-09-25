package com.films.mycinema.app.models

import com.google.gson.annotations.SerializedName

/*object  Model{
    data class Result(val query: Query)
    data class Query(val searchinfo: SearchInfo , val search : List<MovieViewModel>)
}*/

data class ApiResponse(val query: Query
                       , val batchcomplete : String
                       , @SerializedName("continue") val continuation : Continue)

data class Query(val searchinfo: SearchInfo
                 , val search : List<MovieViewModel>
                 , @SerializedName("continue") val continuation : Continue)

data class SearchInfo(val totalhits: Int)

data class Continue(@SerializedName("continue") val continuation : String, val sroffset : Int )
