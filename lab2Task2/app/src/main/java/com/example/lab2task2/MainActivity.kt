package com.example.lab2task2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number1: Int = 2563497
        var number2: Int = 698541
        val arr = IntArray(10)
        while (number1 != 0) {
            arr[number1 % 10]++
            number1 /= 10
        }
        while (number2 != 0) {
            if (arr[number2 % 10] != 0) println(number2 % 10)
            number2 /= 10
        }


    }
}