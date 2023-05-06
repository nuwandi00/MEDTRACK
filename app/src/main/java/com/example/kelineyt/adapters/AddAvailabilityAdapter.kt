package com.example.kelineyt.adapters

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kelineyt.R
import com.example.kelineyt.data.Scheduling

class AddAvailabilityAdapter (private val addAvailabilityList: java.util.ArrayList<Scheduling>): RecyclerView.Adapter<AddAvailabilityAdapter.MyViewHolder>() {

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position:Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener =listener
    }

    class MyViewHolder(itemView: View , listener: onItemClickListener):RecyclerView.ViewHolder(itemView){
        var sdname : TextView
        var sspeciality : TextView
        var saddress : TextView
        var sdate : TextView
        var sfrom : TextView
        var sto : TextView

        init {
            sdname =  itemView.findViewById(R.id.viewnamelist)
            sspeciality =  itemView.findViewById(R.id.viewtextlist)
            saddress =  itemView.findViewById(R.id.viewtextlist4)
            sdate = itemView.findViewById(R.id.viewtextlist6)
            sfrom = itemView.findViewById(R.id.viewtextlist7)
            sto = itemView.findViewById(R.id.viewtextlist10)

            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.scheduling_list_frgment, parent, false)
        return MyViewHolder(itemView,mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentItem = addAvailabilityList[position]
        Log.d(TAG, position.toString())
        holder.sdname.text = currentItem.sdName
        holder.sspeciality.text = currentItem.sSpeciality
        holder.saddress.text = currentItem.sAddress
        holder.sdate.text = currentItem.sDate
        holder.sfrom.text = currentItem.sFrom
        holder.sto.text = currentItem.sTo


    }




    override fun getItemCount(): Int {
//        Log.d(TAG,feedBackList.size.toString())
        return addAvailabilityList.size
    }
}

