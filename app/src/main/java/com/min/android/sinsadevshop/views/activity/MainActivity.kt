package com.min.android.sinsadevshop.views.activity

import android.Manifest
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.min.android.sinsadevshop.R
import com.min.android.sinsadevshop.databinding.ActivityMainBinding
import com.min.android.sinsadevshop.utils.CheckPermission
import com.min.android.sinsadevshop.views.fragment.UserFragment
import org.koin.core.context.startKoin
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding
    private val PERMISSIONS = arrayListOf(
        Manifest.permission.RECORD_AUDIO,
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.CAMERA)


    private val MULTIPLE_PERMISSIONS = 101

    val checkPermission = CheckPermission(this,PERMISSIONS,MULTIPLE_PERMISSIONS)
    val userFragment = UserFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        activityMainBinding.main=this

        checkPermission.startCheckPermissions()



    }




    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array< String>, grantResults: IntArray) {
        checkPermission.permissionsAdd(requestCode,permissions,grantResults)
    }

    fun btnClick(view : View){
        Toast.makeText(this,"dkdk",Toast.LENGTH_SHORT).show()
        switchFragment(userFragment)
    }

    fun btnMoveLogin(view: View){

    }

    fun switchFragment(flagment : Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame,flagment).commit();
    }

}
