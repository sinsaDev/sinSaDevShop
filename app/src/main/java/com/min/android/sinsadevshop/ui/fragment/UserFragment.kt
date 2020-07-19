package com.min.android.sinsadevshop.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.min.android.sinsadevshop.R
import com.min.android.sinsadevshop.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_user_flagment.view.*

class UserFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_user_flagment, null)




        view.login_Btn.setOnClickListener {
            val loginIntent = Intent(view.context, LoginActivity::class.java)
            startActivity(loginIntent)

        }

        return view


    }
}