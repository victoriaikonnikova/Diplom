package com.example.newproject.presentation.main
//
//import com.example.newproject.domain.models.UserNameParam
//import com.example.newproject.domain.repository.usecase.GetUserNameUseCase
//import com.example.newproject.domain.repository.usecase.SaveUserNameUseCase
//
//class MainFragmentPresenter(
//    private val getUserNameUseCase: GetUserNameUseCase,
//    private val saveUserNameUseCase: SaveUserNameUseCase
//) : MainContract.MainFragmentPresenterInterface {
//
//    private var view: MainContract.MainFragmentInterface? = null
//
//    override fun attachView(mainFragment: MainFragment) {
//        view = mainFragment
//    }
//
//    override fun saveUserName(userName: UserNameParam) {
//        val result = saveUserNameUseCase.execute(userName)
//        view?.showInformation(result.toString())
//    }
//
//    override fun getUserName () {
//        view?.showInformation(getUserNameUseCase.execute().firstName)
//    }
//
//    override fun detachView() {
//        view = null
//    }
//}