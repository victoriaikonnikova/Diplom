package com.example.newproject.presentation.main

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.data.UserRepositoryImpl
import com.example.data.storage.SharedPrefUserStorage
import com.example.data.storage.converters.UserParamToUserConverter
import com.example.data.storage.converters.UserToUserNameConverter
import com.example.newproject.domain.repository.usecase.GetUserNameUseCase
import com.example.newproject.domain.repository.usecase.SaveUserNameUseCase

//class MainViewModelFactory(
//
////    private val userStorage by lazy { SharedPrefUserStorage(context) }
////    private val userRepository by lazy {
////        UserRepositoryImpl(
////            userStorage,
////            UserParamToUserConverter(),
////            UserToUserNameConverter()
////        )
////    }
//
//    private val getUserNameUseCase: GetUserNameUseCase,
//    private val saveUserNameUseCase: SaveUserNameUseCase
//) : ViewModelProvider.Factory {
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return MainFragmentViewModel(getUserNameUseCase, saveUserNameUseCase) as T
//    }
//}