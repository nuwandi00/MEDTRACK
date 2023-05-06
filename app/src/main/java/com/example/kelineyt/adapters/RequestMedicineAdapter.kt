package com.example.kelineyt.adapters

import android.content.ContentValues.TAG
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kelineyt.R
import com.example.kelineyt.data.requestmedicine

class RequestMedicineAdapter(private val RequestMedicineList: java.util.ArrayList<requestmedicine>): RecyclerView.Adapter<RequestMedicineAdapter.MyViewHolder>() {

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position:Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener =listener
    }

    class MyViewHolder(itemView: View , listener: onItemClickListener):RecyclerView.ViewHolder(itemView){
        var edt_medName : TextView
        var edt_medContact : TextView
        var edt_Email : TextView


        init {
            edt_medName =  itemView.findViewById(R.id.medname)
            edt_medContact =  itemView.findViewById(R.id.medcontact)
            edt_Email =  itemView.findViewById(R.id.medemail)


            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_fragmentrequestmedicine,parent,false)
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var currentItem = RequestMedicineList[position]
        Log.d(TAG,position.toString())
        holder.edt_medName.text = currentItem.Medicine
        holder.edt_medContact.text =currentItem.Number
        holder.edt_Email.text=currentItem.Email

    }

    override fun getItemCount(): Int {
        return RequestMedicineList.size
    }


}

