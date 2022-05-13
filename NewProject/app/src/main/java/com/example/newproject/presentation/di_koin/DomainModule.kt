package com.example.newproject.presentation.di_koin

import com.example.domain.usecase.usecase.GetCurrencyUseCase
import com.example.newproject.domain.repository.usecase.GetUserNameUseCase
import com.example.newproject.domain.repository.usecase.SaveUserNameUseCase
import org.koin.dsl.module


    val domainModule = module {

        factory <GetUserNameUseCase> {
            GetUserNameUseCase(get())
        }

        factory <SaveUserNameUseCase> {
            SaveUserNameUseCase(get())
        }

        factory <GetCurrencyUseCase> {
            GetCurrencyUseCase (get())
        }
    }
