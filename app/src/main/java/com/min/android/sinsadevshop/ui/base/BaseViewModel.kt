package com.min.android.sinsadevshop.ui.base

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel(), LifecycleObserver {

    protected val TAG = javaClass.simpleName
    protected val compositeDisposable by lazy { CompositeDisposable() }

    override fun onCleared() {

        with(compositeDisposable){
            clear()
            dispose()
        }

        super.onCleared()
    }


}