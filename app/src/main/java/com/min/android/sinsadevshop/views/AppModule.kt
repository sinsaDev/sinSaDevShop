package com.min.android.sinsadevshop.views

import org.koin.dsl.module

val appModule = module {
    single { SchoolService() }
    single { StudentController(get()) }
}