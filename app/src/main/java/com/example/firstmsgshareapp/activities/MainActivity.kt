package com.example.firstmsgshareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.firstmsgshareapp.Constants
import com.example.firstmsgshareapp.R
import com.example.firstmsgshareapp.extensions.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toastbutton.setOnClickListener {
            Log.i(TAG, "Button was clicked")
            showToast("hi thi is vicky")
//            Toast.makeText(this, "hi thi is vicky", Toast.LENGTH_SHORT).show()
        }
        LoginButton.setOnClickListener {
            val message: String = editText.text.toString()
//            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
            startActivity(
                Intent(
                    this,

                    SecondActivity::class.java
                ).putExtra(Constants.USER_MSG_KEY, message)
            )
        }

        ShareButton.setOnClickListener {
            val message: String = editText.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share To :"))
        }

        RecyclerButton.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    HobbiesActivities::class.java
                )
            )
        }


    }


}
