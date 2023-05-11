package com.example.kelineyt.adapters

import android.content.ContentValues
import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kelineyt.R
import com.example.kelineyt.data.Tips
import com.example.kelineyt.data.requestmedicine


// Adapter class for the RecyclerView in the TipsFragment
class TipsAdapter(private val healthtipsList: java.util.ArrayList<Tips>): RecyclerView.Adapter<TipsAdapter.MyViewHolder>() {

    // Listener interface for item click events
    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position:Int)
    }

    // Setter method for setting the click listener
    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener =listener
    }

    // ViewHolder class for each item in the RecyclerView
    class MyViewHolder(itemView: View , listener: onItemClickListener):RecyclerView.ViewHolder(itemView){
        var TipDocname : TextView
        var TipsEditText : TextView


        // Initialize the views
        init {
            TipDocname =  itemView.findViewById(R.id.Docname_tipsss)
            TipsEditText =  itemView.findViewById(R.id.tip2_textstips)


            // Set click listener for the item view
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the item layout and create a ViewHolder
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_fragmenttips,parent,false)
       // Log.d(TAG,healthtipsList.toString())
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Bind the data to the views in each item
        var currentItem = healthtipsList[position]
//        Log.d(ContentValues.TAG,position.toString())
        // Set the text of the TextViews in the item view
        holder.TipDocname.text = currentItem.DoctorNameTIP
        holder.TipsEditText.text =currentItem.TipsComment


    }

    override fun getItemCount(): Int {
        // Return the number of items in the list
        return healthtipsList.size
    }


}
