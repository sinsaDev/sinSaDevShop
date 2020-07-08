package com.min.android.sinsadevshop.utils

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class CheckPermission(CONTEXT : Context, PERMISSIONS: ArrayList<String>,CONFIRM_PERMISSION_NUM : Int) {

    var mContext = CONTEXT
    var PERMISSIONS = PERMISSIONS
    var CONFIRM_PERMISSION_NUM = CONFIRM_PERMISSION_NUM


    fun startCheckPermissions(){
        var permissionsNum: Int
        var permissionList = ArrayList<String>()
        for (inputPermissions:String in PERMISSIONS){
            permissionsNum = ContextCompat.checkSelfPermission(mContext, inputPermissions)
            if (permissionsNum != PackageManager.PERMISSION_GRANTED){
                //사용자가 해당 권한을 가지고 있지 않을 경우 리스트에 해당 권한명 추가
                permissionList.add(inputPermissions)
            }
        }

        if (!permissionList.isEmpty()){
            //부여할 권한이 있으므로 권한 요청 한다.
            ActivityCompat.requestPermissions(mContext as Activity,permissionList.toArray(
                arrayOfNulls<String>(permissionList.size)),CONFIRM_PERMISSION_NUM)
        }


    }
    //onRequestPermissionsResult 액티비티 에서 에서 받아오는곳
    fun permissionsAdd(requestCode : Int , permission : Array< String>, grantResults : IntArray){

        when (requestCode){
            CONFIRM_PERMISSION_NUM ->{
                if (grantResults.size > 0){
                    for (i in 0..(permission.size-1)){
                        if (permission[i].equals(this.PERMISSIONS[i])){
                            if (grantResults[i] != PackageManager.PERMISSION_GRANTED){
                                showNoPermissionToastAndFinish()
                            }
                        }
                    }
                }
            }
        }

    }

    fun showNoPermissionToastAndFinish(){
        Toast.makeText(mContext,"권한 요청에 모두동의 해주셔야 이용 가능합니다. 설정에서 권한 허용 하시기 바랍니다.", Toast.LENGTH_SHORT).show()
        (mContext as Activity).finish()
    }
}