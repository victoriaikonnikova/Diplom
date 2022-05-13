package com.example.newproject.presentation.di

import android.content.Context
import com.example.newproject.domain.repository.usecase.GetUserNameUseCase
import com.example.newproject.domain.repository.usecase.SaveUserNameUseCase

//@Module
//class AppModule (val context: Context) {
//
//    @Provides
//    fun provideContext() : Context {
//        return context
//    }
//
//    @Provides
//    fun provideMainViewModelFactory(
//        getUserNameUseCase: GetUserNameUseCase,
//        saveUserNameUseCase: SaveUserNameUseCase
//    ): MainViewModelFactory {
//        return MainViewModelFactory(getUserNameUseCase, saveUserNameUseCase)
//    }
//}