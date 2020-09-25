package com.films.mycinema.app.models

object  Model{
    data class Result(val query: Query)
    data class Query(val searchinfo: SearchInfo , val search : MovieViewModel)
    data class SearchInfo(val totalhits: Int)
}