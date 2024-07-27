package com.dependency.injections.dagger_hit

import retrofit2.http.GET

interface ApiService  {
    @GET("current_user_authorizations_html_url")
    suspend fun getPosts(): ApiResponse
}