package com.example.kelineyt.fragments.shopping

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kelineyt.R
import com.example.kelineyt.activities.UpdateAddAvailabilityActivity
import com.example.kelineyt.adapters.AddAvailabilityAdapter
import com.example.kelineyt.data.Scheduling
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class AddAvailabilityListFragment : Fragment() {

    private lateinit var database: DatabaseReference
    private lateinit var addAvailabilityList: ArrayList<Scheduling>
    private lateinit var addAvailabilityRecyclerView: RecyclerView
//    private var param2: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.my_scheduling_list_frgment, container, false)
        addAvailabilityRecyclerView = view.findViewById(R.id.recycleview)
        addAvailabilityRecyclerView.layoutManager = LinearLayoutManager(view.context)
        addAvailabilityRecyclerView.setHasFixedSize(true)

        addAvailabilityList = arrayListOf()
        addAvailabilityRecyclerView.adapter = AddAvailabilityAdapter(addAvailabilityList)
        getAddAvailabilityData()

        return view


    }

    private  fun getAddAvailabilityData(){
        database = FirebaseDatabase.getInstance().getReference("Scheduling")

        database.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    addAvailabilityList = arrayListOf()
                    val KeyList = arrayListOf<String>()
                    for (postSnapshot in snapshot.children){
//                        Log.d(TAG,postSnapshot.toString())
                        val feed = postSnapshot.getValue(/*valueType =*/Scheduling::class.java)
                        KeyList.add(postSnapshot.key.toString())
                        addAvailabilityList.add(feed!!)
                    }

//                    Log.d(TAG , addAvailabilityList.toString())

                    val adapter = AddAvailabilityAdapter(addAvailabilityList)
                    adapter.setOnItemClickListener(object : AddAvailabilityAdapter.onItemClickListener {
                        override fun onItemClick(position: Int) {
                            val intent = Intent(activity, UpdateAddAvailabilityActivity::class.java)
                            intent.putExtra("sname", addAvailabilityList[position].sdName)
                            intent.putExtra("speciality", addAvailabilityList[position].sSpeciality)
                            intent.putExtra("address", addAvailabilityList[position].sAddress)
                            intent.putExtra("date", addAvailabilityList[position].sDate)
                            intent.putExtra("from", addAvailabilityList[position].sFrom)
                            intent.putExtra("to", addAvailabilityList[position].sTo)
                            intent.putExtra("sID", KeyList[position])
                            startActivity(intent)

                        }
                    })
                    addAvailabilityRecyclerView.adapter = adapter
                }
            }
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context,"$error",Toast.LENGTH_LONG).show()
            }
        })
    }
}