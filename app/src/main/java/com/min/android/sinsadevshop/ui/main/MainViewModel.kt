package com.min.android.sinsadevshop.ui.main

import android.util.Log
import android.widget.Toast
import com.min.android.sinsadevshop.ui.base.BaseViewModel
import kotlinx.coroutines.*

class MainViewModel() : BaseViewModel() {

    private val scope = CoroutineScope(
        Job() + Dispatchers.Main
    )

    private val TAG = javaClass.simpleName

    fun click(){
        Log.e(TAG,"눌린다.")
    }

    override fun onCleared() {
        super.onCleared()
        scope.cancel()
    }
}