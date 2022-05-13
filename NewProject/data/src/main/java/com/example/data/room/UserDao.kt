package com.example.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM user_entity_table")
    fun getAll(): List<UserEntity>

    @Insert
    fun insertUser(user: UserEntity)
}