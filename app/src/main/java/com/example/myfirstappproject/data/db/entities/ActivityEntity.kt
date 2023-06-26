package com.example.myfirstappproject.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myfirstappproject.domain.Activity

@Entity(tableName = "activity_table")
data class ActivityEntity(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val activity: String,
    val type: String
)

fun Activity.toDatabase() = ActivityEntity(activity = activity, type = type)