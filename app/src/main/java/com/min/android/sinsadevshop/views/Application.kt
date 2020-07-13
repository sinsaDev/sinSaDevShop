package com.min.android.sinsadevshop.views

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(applicationContext)
            modules(appModule)
        }
    }

}