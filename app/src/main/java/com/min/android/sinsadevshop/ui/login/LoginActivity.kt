package com.min.android.sinsadevshop.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.min.android.sinsadevshop.R
import com.min.android.sinsadevshop.ui.singUp.SingUpActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        singup_Btn.setOnClickListener{

            val singupIntent = Intent(this,
                SingUpActivity::class.java)
            startActivity(singupIntent)
        }
    }
}