package com.example.newproject.domain.repository

import com.example.newproject.domain.models.UserName
import com.example.newproject.domain.models.UserNameParam

interface UserRepository {
    fun saveUserParam(userParam: UserNameParam): Boolean

    fun getUserName(): UserName
}