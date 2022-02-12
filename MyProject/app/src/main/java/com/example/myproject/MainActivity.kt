package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.Time

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val circle = Circle("circle", "red", 3.0)
//        circle.perimeter()
//        circle.square()
//
//        val triangle = Triangle("triangle", "blue", 3, 4, 5, 3)
//        triangle.perimeter()
//        triangle.square()
//
//        val rectangle = Rectangle("rectangle", "yellow", 2, 3)
//        rectangle.perimeter()
//        rectangle.square()
//
//
//

        val time = Timer(5, 30, 25)
        time.getTime()
        time.setHours()
        time.setMinutes()
        time.setSeconds()

    }
}
