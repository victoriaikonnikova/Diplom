package com.example.newproject.domain.repository.usecase

import com.example.newproject.domain.base.UseCase
import com.example.newproject.domain.models.UserName
import com.example.newproject.domain.repository.UserRepository

class GetUserNameUseCase (private val userRepository: UserRepository): UseCase<Unit, UserName> {

    override fun execute(param: Unit?): UserName {
        return userRepository.getUserName()
    }
}