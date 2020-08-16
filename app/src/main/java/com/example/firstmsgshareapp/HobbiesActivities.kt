package com.example.firstmsgshareapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivities : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val LayoutManager = LinearLayoutManager(this)
        LayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager =LayoutManager

        val adapter = HobbiesAdapter(this, Supplier.Hobbies)
        recyclerView.adapter = adapter
    }
}