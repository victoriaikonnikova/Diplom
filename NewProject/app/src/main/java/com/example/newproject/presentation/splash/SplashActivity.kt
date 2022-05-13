package com.example.newproject.presentation.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.newproject.R
import org.koin.androidx.viewmodel.ext.android.viewModel

@SuppressLint
class SplashActivity : AppCompatActivity() {

    private val viewModel by viewModel <SplashViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        viewModel.waitAndGoFurther()
        subscribeLiveData()
    }

    private fun subscribeLiveData() {
        viewModel.resultLiveData.observe(this) {
            showActivityMain()
            finish()
        }
    }
}