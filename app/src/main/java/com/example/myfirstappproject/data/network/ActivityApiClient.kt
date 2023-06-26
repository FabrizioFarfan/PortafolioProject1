package com.example.myfirstappproject.data.network

import com.example.myfirstappproject.data.model.ActivityModel
import retrofit2.Response
import retrofit2.http.GET

interface ActivityApiClient {
    @GET("activity/")
    suspend fun getRandomActivity(): Response<ActivityModel>
}