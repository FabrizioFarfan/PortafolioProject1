package com.example.myfirstappproject.data.network

import com.example.myfirstappproject.data.model.ActivityModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ActivityService @Inject constructor( private val api : ActivityApiClient) {



    suspend fun getRandomActivity(): ActivityModel {
        return withContext(IO) {
            val response = api.getRandomActivity()
            response.body() ?: ActivityModel("Get some Internet", "Resolving Problems")
        }
    }
}