package com.example.firstmsgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.firstmsgshareapp.com.example.firstmsgshareapp.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toastbutton.setOnClickListener {
            Log.i("Toast Button","Button was clicked")
            Toast.makeText(this,"hi thi is vicky",Toast.LENGTH_SHORT).show()
        }
        LoginButton.setOnClickListener {
            val message: String =  editText.text.toString()
//            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,
                SecondActivity::class.java).putExtra("userInput",message))
        }

        ShareButton.setOnClickListener {
            val message : String = editText.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type ="text/plain"

            startActivity(Intent.createChooser(intent,"Share To :"))
        }
    }



}
