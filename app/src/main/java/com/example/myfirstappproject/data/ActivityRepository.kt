package com.example.myfirstappproject.data

import com.example.myfirstappproject.data.db.dao.ActivityDao
import com.example.myfirstappproject.data.db.entities.ActivityEntity
import com.example.myfirstappproject.data.network.ActivityService
import com.example.myfirstappproject.domain.Activity
import com.example.myfirstappproject.domain.toDomain
import javax.inject.Inject

class ActivityRepository @Inject constructor(
    private val api: ActivityService,
    private val activityDao: ActivityDao
    ) {

    suspend fun getRandomActivityFromApi(): Activity  {
        val response = api.getRandomActivity()
        return response.toDomain()
    }


    suspend fun insertActivity(activity: ActivityEntity){
        activityDao.insertActivity(activity)
    }

}