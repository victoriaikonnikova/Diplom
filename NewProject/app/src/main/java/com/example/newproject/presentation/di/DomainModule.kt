package com.example.newproject.presentation.di

import com.example.newproject.domain.repository.UserRepository
import com.example.newproject.domain.repository.usecase.GetUserNameUseCase
import com.example.newproject.domain.repository.usecase.SaveUserNameUseCase

//@Module
//class DomainModule {
//
//    @Provides
//    fun provideGetUserNameUseCase (userRepository: UserRepository) : GetUserNameUseCase {
//        return GetUserNameUseCase(userRepository)
//    }
//
//    @Provides
//    fun provideSaveUserNameUseCase (userRepository: UserRepository) : SaveUserNameUseCase {
//        return SaveUserNameUseCase(userRepository)
//    }
//}