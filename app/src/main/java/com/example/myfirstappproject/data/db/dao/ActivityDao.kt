package com.example.myfirstappproject.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.myfirstappproject.data.db.entities.ActivityEntity


@Dao
interface ActivityDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertActivity(activityEntity: ActivityEntity)
}