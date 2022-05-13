package com.example.newproject.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newproject.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanseState: Bundle?) {
        super.onCreate(savedInstanseState)
        setContentView(R.layout.activity_main)

//        if (savedInstanseState == null) {
//            val anotherFragment = AnotherFragment.newInstance("Hello World")
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.container, anotherFragment)
//                .commitNow()
//        }
    }
}
