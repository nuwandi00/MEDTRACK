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


class TipsAdapter(private val healthtipsList: java.util.ArrayList<Tips>): RecyclerView.Adapter<TipsAdapter.MyViewHolder>() {

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position:Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener =listener
    }

    class MyViewHolder(itemView: View , listener: onItemClickListener):RecyclerView.ViewHolder(itemView){
        var TipDocname : TextView
        var TipsEditText : TextView



        init {
            TipDocname =  itemView.findViewById(R.id.Docname_tipsss)
            TipsEditText =  itemView.findViewById(R.id.tip2_textstips)



            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_fragmenttips,parent,false)
       // Log.d(TAG,healthtipsList.toString())
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentItem = healthtipsList[position]
//        Log.d(ContentValues.TAG,position.toString())
        holder.TipDocname.text = currentItem.DoctorNameTIP
        holder.TipsEditText.text =currentItem.TipsComment


    }

    override fun getItemCount(): Int {
        return healthtipsList.size
    }


}
