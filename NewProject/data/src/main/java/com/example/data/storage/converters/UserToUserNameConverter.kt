package com.example.data.storage.converters

import com.example.data.storage.models.User
import com.example.newproject.domain.base.Converter
import com.example.newproject.domain.models.UserName

class UserToUserNameConverter: Converter <User, UserName> {
    override fun invoke(param: User): UserName {
        return UserName (param.firstName, param.secondName)
    }
}