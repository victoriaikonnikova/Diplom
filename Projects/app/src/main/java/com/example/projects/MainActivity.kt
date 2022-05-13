package com.example.projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanseState: Bundle?) {
        super.onCreate(savedInstanseState)
        setContentView(R.layout.activity_main)

        if (savedInstanseState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, MainFragment(), "fragment_tag")
                .commitNow()
        }
    }
}
