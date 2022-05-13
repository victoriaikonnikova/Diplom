package com.example.data

import com.example.data.storage.UserStorage
import com.example.data.storage.converters.UserParamToUserConverter
import com.example.data.storage.converters.UserToUserNameConverter
import com.example.newproject.domain.models.UserName
import com.example.newproject.domain.models.UserNameParam
import com.example.newproject.domain.repository.UserRepository

class UserRepositoryImpl (
    private val userStorage: UserStorage,
    private val userParamToUserConverter: UserParamToUserConverter,
    private val userToUserNameConverter: UserToUserNameConverter
    ) : UserRepository {

    override fun saveUserParam(userParam: UserNameParam): Boolean {
        return userStorage.SaveUserParam(userParamToUserConverter.invoke(userParam))
    }

    override fun getUserName(): UserName {
        return userToUserNameConverter.invoke(userStorage.getUserName())
    }
}