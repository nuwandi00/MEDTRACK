package com.example.kelineyt.fragments.shopping

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle

import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kelineyt.R
import com.example.kelineyt.activities.UpdateTipsActivity
import com.example.kelineyt.adapters.TipsAdapter
import com.example.kelineyt.data.Tips
import com.example.kelineyt.data.requestmedicine
import com.google.firebase.database.*

class tipListFragment: Fragment() {
    private lateinit var database: DatabaseReference
    private lateinit var healthtipsList: ArrayList<Tips>
    private lateinit var TipsRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.tip_list, container, false)
        TipsRecyclerView = view.findViewById(R.id.recycleview_tips2)
        TipsRecyclerView.layoutManager = LinearLayoutManager(view.context)
        TipsRecyclerView.setHasFixedSize(true)

        healthtipsList = arrayListOf()
        TipsRecyclerView.adapter = TipsAdapter(healthtipsList)
        getHealthTips()

        return view

    }
    private fun getHealthTips() {
        database = FirebaseDatabase.getInstance().getReference("HealthTips")

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    healthtipsList = arrayListOf()
                    val KeyList = arrayListOf<String>()
                    for (postSnapshot in snapshot.children) {
                        val feed = postSnapshot.getValue(/*valueType =*/Tips::class.java)
                        Log.d(TAG,feed.toString())
                        KeyList.add(postSnapshot.key.toString())
                        healthtipsList.add(feed!!)
                    }
                    Log.d(TAG,healthtipsList.toString())



                    val adapter = TipsAdapter(healthtipsList)
//
                    adapter.setOnItemClickListener(object : TipsAdapter.onItemClickListener {
                        override fun onItemClick(position: Int) {
                            val intent = Intent(activity, UpdateTipsActivity::class.java)
                            intent.putExtra("DoctorsName",healthtipsList[position].DoctorNameTIP)
                            intent.putExtra("HealthyTips", healthtipsList[position].TipsComment)
                            intent.putExtra("tID", KeyList[position])
                            startActivity(intent)

                        }
                    })
                    TipsRecyclerView.adapter = adapter
                }

            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context,"$error", Toast.LENGTH_LONG).show()
            }

        })
    }
}

