package com.min.android.sinsadevshop

import android.app.Application
import com.min.android.sinsadevshop.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class MVVMApp : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MVVMApp)
            modules(viewModelModule)

        }

    }
}