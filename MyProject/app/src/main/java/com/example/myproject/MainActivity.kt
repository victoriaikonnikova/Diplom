package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.isDigitsOnly


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultTV = findViewById<TextView>(R.id.tvResult)
        var firstNumber = findViewById<EditText>(R.id.firstNumber)
        var sign = findViewById<EditText>(R.id.sign)
        var secondNumber = findViewById<EditText>(R.id.secondNumber)
        var buttonResult = findViewById<Button>(R.id.button)

        buttonResult.setOnClickListener {

            var enteredNumberOne =
            if (firstNumber.text.toString().isNotEmpty()) {
                firstNumber.text.toString().toDouble()
            } else {
                0.0
            }

            var enteredNumberTwo =
                if (secondNumber.text.toString().isNotEmpty()) {
                    secondNumber.text.toString().toDouble()
                } else {
                    0.0
                }

            var enteredSign = sign.text.toString()

            when (enteredSign) {
                "+" -> {
                    resultTV.text = (enteredNumberOne + enteredNumberTwo).toString()
                }
                "-" -> {
                    resultTV.text = (enteredNumberOne - enteredNumberTwo).toString()
                }
                "*" -> {
                    resultTV.text = (enteredNumberOne * enteredNumberTwo).toString()
                }
                "/" -> {
                    if (enteredNumberTwo !== 0.0) {
                        resultTV.text = (enteredNumberOne / enteredNumberTwo).toString()
                    } else {
                        resultTV.text = "На 0 делить нельзя"
                    }
                }
                else -> resultTV.text = "Неверный знак"
            }
        }
    }
}



