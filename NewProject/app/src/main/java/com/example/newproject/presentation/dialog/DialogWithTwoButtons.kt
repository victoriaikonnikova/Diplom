package com.example.newproject.presentation.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.newproject.databinding.DialogWithTwoButtonsBinding
import com.example.newproject.presentation.base.BaseDialogFragment

class DialogWithTwoButtons : BaseDialogFragment<DialogWithTwoButtonsBinding>() {

    private val args: DialogWithTwoButtonsArgs by navArgs()

    override fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): DialogWithTwoButtonsBinding =
        DialogWithTwoButtonsBinding.inflate(inflater, container, false)

    override fun DialogWithTwoButtonsBinding.onBindView(savedInstanceState:Bundle?) {
        buttonSuccess.setOnClickListener{closeWithResult(true)}
        buttonCancel.setOnClickListener{closeWithResult(false)}
    }

    private fun closeWithResult(isSuccess: Boolean){
        navController.navigateUp()
        setResult(isSuccess)
    }

    private fun setResult(isSuccess: Boolean) {
        setFragmentResultWithRequester(args.requester, RESULT_KEY to isSuccess)

}

    companion object{
        const val REQUEST_KEY = "DIALOG_WITH_TWO_BUTTONS_REQUEST_KEY"
        const val RESULT_KEY = "DIALOG_WITH_TWO_BUTTONS_RESULT_KEY"
    }
}