package com.example.task1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    var s: BigInteger = BigInteger.valueOf(1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 2..200) {
            s = s.multiply(BigInteger.valueOf(i.toLong() * i))
        }
        println(s)

    }
}