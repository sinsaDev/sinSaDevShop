package com.min.android.sinsadevshop.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
        Log.e("onCleared","onCleared")
    }
}