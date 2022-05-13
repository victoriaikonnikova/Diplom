package com.example.newproject.presentation.di_koin

import com.example.data.RetrofitCreator
import com.example.data.UserRepositoryImpl
import com.example.data.api.CurrencyApi
import com.example.data.repoImpl.CurrencyRepositoryImpl
import com.example.data.room.UserEntityStorage
import com.example.data.storage.UserStorage
import com.example.data.storage.converters.CurrencyModelToCurrencyDtoConverter
import com.example.data.storage.converters.UserParamToUserConverter
import com.example.data.storage.converters.UserToUserNameConverter
import com.example.domain.usecase.CurrencyRepository
import com.example.newproject.domain.repository.UserRepository
import com.google.gson.GsonBuilder
import org.koin.dsl.module


val dataModule = module {
    single<UserStorage> {
        UserEntityStorage(get())
    }

    single<UserRepository> {
        UserRepositoryImpl(
            get(),
            get(),
            get()
        )
    }

    single<CurrencyRepository> {
        CurrencyRepositoryImpl(
            get(),
            get()
        )
    }

    factory {
        UserParamToUserConverter()
    }

    factory {
        UserToUserNameConverter()
    }

    factory {
        CurrencyModelToCurrencyDtoConverter()
    }

    single { GsonBuilder().serializeNulls().create() }
    val creator = RetrofitCreator()

    single { creator.createService(get(), CurrencyApi::class.java) as CurrencyApi }
}
