package com.example.kelineyt.adapters

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kelineyt.R
import com.example.kelineyt.data.feedback
import com.google.android.material.imageview.ShapeableImageView

class FeedbackAdapter(private val feedBackList: java.util.ArrayList<feedback>):RecyclerView.Adapter<FeedbackAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_frgamentfeedback,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentItem = feedBackList[position]
        Log.d(TAG,position.toString())
        holder.fdName.text = currentItem.Name
        holder.comment.text =currentItem.Comment

//        holder.fdName.text = "Dula"
//        holder.comment.text = "dtfyuuyouyh"
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var fdName : TextView = itemView.findViewById(R.id.namefd)
        var comment : TextView = itemView.findViewById(R.id.fbName)


    }

    override fun getItemCount(): Int {
//        Log.d(TAG,feedBackList.size.toString())
        return feedBackList.size
    }


}