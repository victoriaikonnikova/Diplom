package com.example.task1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.math.BigInteger

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun Task1 (): java.math.BigInteger
        var s: BigInteger = BigInteger.valueOf(1)
        for (i in 2..200) {
            s = s.multiply(BigInteger.valueOf(i.toLong() * i))
        }
        println(s)

        fun Task2 (): Number
        var number1: Int = 2563497
        var number2: Int = 698541
        for (char2 in number1.toString().toCharArray()) {
            for (char1 in number2.toString().toCharArray()) {
                if (char1 == char2)
                    print(char1)
            }
        }

        fun Task3 (): Boolean

        var x = 1
        var y = 3

        if (((x in -4..4) && (y in -3..0)) && ((x in -2..2) && (y in 0..4))
            && ((x.toDouble() !in -0.5..0.5) && (y.toDouble() !in -0.5..-1.5))
        ) {
            isInArea = true
            print(isInArea)
        } else {
            print(isInArea)
        }
    }
}