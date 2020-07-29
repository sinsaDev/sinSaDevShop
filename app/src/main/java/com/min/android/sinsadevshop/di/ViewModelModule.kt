package com.min.android.sinsadevshop.di

import com.min.android.sinsadevshop.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
//    viewModel {  }
    viewModel { MainViewModel() }
}