package com.example.newproject.presentation.splash

import android.app.Activity
import android.content.Intent
import com.example.newproject.presentation.main.MainActivity

fun Activity.showActivityMain () {
    this.startActivity(Intent(this, MainActivity::class.java))
}