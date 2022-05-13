package com.example.newproject.presentation.main

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainFragmentObserver : LifecycleObserver {

    @OnLifecycleEvent (Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.d("TAG", "created")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.d("TAG", "destroyed")
    }
}