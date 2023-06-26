package com.example.myfirstappproject.domain

import com.example.myfirstappproject.data.ActivityRepository
import com.example.myfirstappproject.data.db.entities.toDatabase
import javax.inject.Inject

class GetRandomActivityUseCase @Inject constructor( private val repository: ActivityRepository) {

    suspend operator fun invoke(): Activity {
        val activity = repository.getRandomActivityFromApi()

        return run {
            repository.insertActivity(activity.toDatabase())
            activity
        }


    }



}