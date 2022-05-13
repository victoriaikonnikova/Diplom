package com.example.data.storage

import com.example.data.storage.models.User

interface UserStorage {

    fun SaveUserParam(user: User): Boolean

    fun getUserName(): User

}