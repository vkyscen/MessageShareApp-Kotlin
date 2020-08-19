package com.example.firstmsgshareapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firstmsgshareapp.Constants
import com.example.firstmsgshareapp.R
import com.example.firstmsgshareapp.extensions.showToast

import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    companion object{
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString(Constants.USER_MSG_KEY)
            showToast(msg!!)
            textView.text = msg
        }


//        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


}

