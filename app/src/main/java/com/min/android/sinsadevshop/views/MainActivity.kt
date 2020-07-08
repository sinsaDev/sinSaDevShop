package com.min.android.sinsadevshop.views

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.min.android.sinsadevshop.R
import com.min.android.sinsadevshop.databinding.ActivityMainBinding
import com.min.android.sinsadevshop.utils.CheckPermission
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder


class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding
    private val PERMISSIONS = arrayListOf(
        Manifest.permission.RECORD_AUDIO,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.CAMERA)


    private val MULTIPLE_PERMISSIONS = 101

    val checkPermission = CheckPermission(this,PERMISSIONS,MULTIPLE_PERMISSIONS)
    val userFragment = UserFlagment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        activityMainBinding.main=this

        checkPermission.startCheckPermissions()
        switchFragment(userFragment)

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array< String>, grantResults: IntArray) {
        checkPermission.permissionsAdd(requestCode,permissions,grantResults)
    }

    fun switchFragment(flagment : Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame,flagment).commit();
    }

}
