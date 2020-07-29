package com.min.android.sinsadevshop.ui.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel


abstract class BaseViewModel : ViewModel() {

    private val TAG = javaClass.simpleName



    override fun onCleared() {
        super.onCleared()

    }


}