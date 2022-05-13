package com.example.newproject.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.data.UserRepositoryImpl
import com.example.data.storage.SharedPrefUserStorage
import com.example.data.storage.converters.UserParamToUserConverter
import com.example.data.storage.converters.UserToUserNameConverter
import com.example.newproject.databinding.MainFragmentBinding
import com.example.newproject.domain.repository.usecase.GetUserNameUseCase
import com.example.newproject.domain.repository.usecase.SaveUserNameUseCase
import com.example.newproject.presentation.app.App
import com.example.newproject.presentation.base.BaseFragment
import com.example.newproject.presentation.dialog.DialogWithTwoButtons
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment<MainFragmentBinding>() {

    private val viewModel by viewModel<MainFragmentViewModel>()

//    @Inject
//    lateinit var viewModelFactory: MainViewModelFactory
//    private lateinit var viewModel: MainFragmentViewModel

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        (requireActivity().applicationContext as App).appComponent.inject(this)
//
//        viewModel = ViewModelProvider(
//            this, viewModelFactory
//        )[MainFragmentViewModel::class.java]
//    }

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): MainFragmentBinding = MainFragmentBinding.inflate(inflater, container, false)

    override fun MainFragmentBinding.onBindView(savedInstanceState: Bundle?) {
        receiveButton.setOnClickListener {
            viewModel.load()
        }
        saveButton.setOnClickListener {
            val userName = dataEditText.text.toString()
            viewModel.save(userName)
        }

        viewModel.resultLiveData.observe(viewLifecycleOwner) { message ->
            dateTextView.text = message
        }
    }

    private fun setResultListenerForDialogWithTwoButtons() =
        setResultListenerWithCheckRequester(DialogWithTwoButtons.REQUEST_KEY) {
            println("______________"+it.getBoolean(DialogWithTwoButtons.RESULT_KEY))
        }
}



