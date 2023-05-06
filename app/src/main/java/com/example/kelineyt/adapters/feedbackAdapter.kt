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

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position:Int)
        }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener =listener
        }

    class MyViewHolder(itemView: View , listener: onItemClickListener):RecyclerView.ViewHolder(itemView){
        var fdName : TextView
        var comment : TextView

        init {
            fdName =  itemView.findViewById(R.id.namefd)
            comment =  itemView.findViewById(R.id.fbName)

            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_frgamentfeedback,parent,false)
        return MyViewHolder(itemView,mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentItem = feedBackList[position]
        Log.d(TAG,position.toString())
        holder.fdName.text = currentItem.Name
        holder.comment.text =currentItem.Comment

//        holder.fdName.text = "Dula"
//        holder.comment.text = "dtfyuuyouyh"
    }



    override fun getItemCount(): Int {
//        Log.d(TAG,feedBackList.size.toString())
        return feedBackList.size
    }


}