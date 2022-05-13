package com.example.data.storage.converters

import com.example.data.storage.models.User
import com.example.newproject.domain.base.Converter
import com.example.newproject.domain.models.UserNameParam

class UserParamToUserConverter: Converter <UserNameParam, User> {
    override fun invoke(param: UserNameParam): User {
        return User(param.name, "")
    }
}