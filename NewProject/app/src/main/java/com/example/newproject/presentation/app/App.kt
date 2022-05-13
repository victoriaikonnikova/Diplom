package com.example.newproject.presentation.app

import android.app.Application
import com.example.newproject.presentation.di_koin.appModule
import com.example.newproject.presentation.di_koin.dataModule
import com.example.newproject.presentation.di_koin.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level


class App : Application () {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(appModule, domainModule, dataModule))
        }
    }
}
//
//    lateinit var appComponent: AppComponent
//
//    override fun onCreate() {
//        super.onCreate()
//
//        appComponent = DaggerAppComponent
//            .builder()
//            .appModule(AppModule(context = this))
//            .build()
//    }
//}