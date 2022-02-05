package com.example.lab2task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

   fun test (x:Int = 1, y:Int = 3) {
       if (((x in -4..4) && (y in -3..0)) && ((x in -2..2) && (y in 0..4))
           && ((x.toDouble() !in -0.5..0.5) && (y.toDouble() !in -0.5..-1.5)))
               print(true)
       else print(false)
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }
}