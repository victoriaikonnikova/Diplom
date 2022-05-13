package com.example.homework.domain

import BaseFragment
import GetUserNameUseCase
import SaveUserNameUseCase
import UserRepositoryImpl
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup


class MainFragment : BaseFragment<MainFragmentBinding>() {

    private val userRepository by lazy { UserRepositoryImpl(requireActivity().applicationContext) }

    private val getUserNameUseCase by lazy { GetUserNameUseCase(userRepository) }
    private val saveUserNameUseCase by lazy { SaveUserNameUseCase(userRepository) }

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): MainFragmentBinding = MainFragmentBinding.inflate(inflater, container, false)

    override fun MainFragmentBinding.onBindView(savedInstanceState: Bundle?) {
        receiveButton.setOnClickListener {
            val userName = getUserNameUseCase.execute()
            dateTextView.text = userName.firstName
        }
        saveButton.setOnClickListener {
            val userName = DataEditText.text.toString()
            val result = saveUserNameUseCase.execute(UserNameParam(userName))
            dateTextView.text = result.toString()
        }
    }
}