package com.min.android.sinsadevshop.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.min.android.sinsadevshop.databinding.ActivityMainBinding

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity(){

    //레이아웃의 아이디 받아오는 곳
    @LayoutRes
    abstract fun getLayoutResId() : Int

    protected lateinit var binding: T


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, getLayoutResId())


    }
}