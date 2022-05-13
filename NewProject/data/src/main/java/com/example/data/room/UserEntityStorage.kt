package com.example.data.room

import android.content.Context
import androidx.room.Room
import com.example.data.storage.UserStorage
import com.example.data.storage.models.User

class UserEntityStorage(context: Context) : UserStorage {

    private val dp = Room.databaseBuilder(
        context,
        AppDataBase::class.java, "UserReader"
    ).allowMainThreadQueries().build()

    override fun SaveUserParam(user: User): Boolean {
        dp.userDao()
            .insertUser(UserEntity(firstName = user.firstName, secondName = user.secondName))
        return true
    }

    override fun getUserName(): User {
        val userEntity = dp.userDao().getAll().firstOrNull()
        return User(userEntity?.firstName ?: "egor", userEntity?.secondName ?: "Egor")
    }
}