package com.example.myfirstappproject.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myfirstappproject.data.db.dao.ActivityDao
import com.example.myfirstappproject.data.db.entities.ActivityEntity


@Database(entities = [ActivityEntity::class], version = 1)
abstract class ActivityDatabase : RoomDatabase() {

    abstract fun getActivityDao(): ActivityDao
}