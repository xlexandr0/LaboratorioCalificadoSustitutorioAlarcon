package com.alarcon.alexandro.laboratoriocalificadosustitutorioalarcon

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}