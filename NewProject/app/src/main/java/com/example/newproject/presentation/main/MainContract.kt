package com.example.newproject.presentation.main

import com.example.newproject.domain.models.UserNameParam

interface MainContract {

    interface MainFragmentPresenterInterface {

        fun attachView(mainFragment: MainFragment)
        fun detachView()
        fun saveUserName(userName: UserNameParam)
        fun getUserName()
    }

    interface MainFragmentInterface {
        fun showInformation(information: String)
    }
}