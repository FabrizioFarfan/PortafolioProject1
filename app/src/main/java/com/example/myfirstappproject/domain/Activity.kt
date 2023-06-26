package com.example.myfirstappproject.domain

import com.example.myfirstappproject.data.db.entities.ActivityEntity
import com.example.myfirstappproject.data.model.ActivityModel

data class Activity(
    val activity: String,
    val type: String
)

fun ActivityModel.toDomain() = Activity(activity, type)
fun ActivityEntity.toDomain() = Activity(activity, type)