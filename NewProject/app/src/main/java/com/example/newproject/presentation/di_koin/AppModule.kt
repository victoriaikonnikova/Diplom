package com.example.newproject.presentation.di_koin

import com.example.newproject.presentation.main.MainFragmentViewModel
import com.example.newproject.presentation.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


    val appModule = module {

        viewModel<MainFragmentViewModel> {
            MainFragmentViewModel(get(), get(), get())
        }

        viewModel <SplashViewModel> {
            SplashViewModel()
        }
    }
