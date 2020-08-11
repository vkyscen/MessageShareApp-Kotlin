package com.example.firstmsgshareapp.com.example.firstmsgshareapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firstmsgshareapp.R

import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bunddle : Bundle? = intent.extras
        val msg =bunddle!!.getString("userInput")

        textView.text = msg
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        }


}

