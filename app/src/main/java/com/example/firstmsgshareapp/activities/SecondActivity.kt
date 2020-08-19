package com.example.firstmsgshareapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firstmsgshareapp.R
import com.example.firstmsgshareapp.extensions.showToast

import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val bundle: Bundle? = intent.extras
        bundle?.let {
            val msg = bundle.getString("userInput")
            showToast(msg!!)
            textView.text = msg
        }


//        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


}

