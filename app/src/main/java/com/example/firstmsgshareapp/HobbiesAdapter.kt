package com.example.firstmsgshareapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_card.view.*

class HobbiesAdapter(val context : Context ,val hobbies : List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val view=  LayoutInflater.from(context).inflate(R.layout.list_card,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby,position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var currentHobby : Hobby? = null
        var currentPosition : Int =0

        init {
            itemView.setOnClickListener {
                Toast.makeText(context,currentHobby!!.title+ "clicked", Toast.LENGTH_SHORT).show()
            }
            itemView.imgShare.setOnClickListener {
                val message : String = "My Hobby is " + currentHobby!!.title
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message)
                intent.type ="text/plain"
                context.startActivity(Intent.createChooser(intent,"Share To :"))
            }
        }
        fun setData( hobby: Hobby , position: Int){
            itemView.txvTitle.text = hobby!!.title
            this.currentHobby = hobby
            this.currentPosition = position
        }
    }
}