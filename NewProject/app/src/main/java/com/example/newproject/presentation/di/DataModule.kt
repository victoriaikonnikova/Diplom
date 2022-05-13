package com.example.newproject.presentation.di

import android.content.Context
import com.example.data.UserRepositoryImpl
import com.example.data.storage.SharedPrefUserStorage
import com.example.data.storage.UserStorage
import com.example.data.storage.converters.UserParamToUserConverter
import com.example.data.storage.converters.UserToUserNameConverter
import com.example.data.storage.models.User
import com.example.newproject.domain.models.UserNameParam
import com.example.newproject.domain.repository.UserRepository

//@Module
//class DataModule {
//
//    @Provides
//    fun provideUserStorage(context: Context): UserStorage {
//        return SharedPrefUserStorage(context)
//    }
//
//    @Provides
//    fun provideUserRepository(
//        userStorage: UserStorage,
//        provideUserParamToUserConverter: UserParamToUserConverter,
//        provideUserToUserNameConverter: UserToUserNameConverter
//    )
//            : UserRepository {
//        return UserRepositoryImpl(
//            userStorage,
//            provideUserParamToUserConverter,
//            provideUserToUserNameConverter
//        )
//    }
//
//    @Provides
//    fun provideUserParamToUserConverter(): UserParamToUserConverter {
//        return UserParamToUserConverter()
//    }
//
//    @Provides
//    fun provideUserToUserNameConverter(): UserToUserNameConverter {
//        return UserToUserNameConverter()
//    }
//}