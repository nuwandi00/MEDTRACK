package com.example.kelineyt.fragments.shopping

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kelineyt.R
import com.example.kelineyt.activities.UpdateRequestMedicineActivity
import com.example.kelineyt.adapters.RequestMedicineAdapter
import com.example.kelineyt.data.requestmedicine
import com.google.firebase.database.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RequestMedicineListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

// Fragment to display the list of requested medicines
//initialize
class RequestMedicineListFragment : Fragment() {
    private lateinit var database: DatabaseReference
    private lateinit var RequestMedicineList: ArrayList<requestmedicine>
    private lateinit var RequestMedicineRecyclerView: RecyclerView


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
        val view = inflater.inflate(R.layout.requestmedlist_fragment, container, false)
        RequestMedicineRecyclerView = view.findViewById(R.id.recycleview)
        RequestMedicineRecyclerView.layoutManager = LinearLayoutManager(view.context)
        RequestMedicineRecyclerView.setHasFixedSize(true)

        RequestMedicineList = arrayListOf()
        RequestMedicineRecyclerView.adapter = RequestMedicineAdapter(RequestMedicineList)
        getRequestMedicineData()

        return view

    }

//get  data from database
    private fun getRequestMedicineData() {
        //obtain reference to Posts node of firebase realtime database
        database = FirebaseDatabase.getInstance().getReference("RequestMedicine")

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    RequestMedicineList = arrayListOf()
                    val KeyList = arrayListOf<String>()
                    // Iterate through the children of the snapshot to retrieve each requested medicine
                    for (postSnapshot in snapshot.children) {
//                        Log.d(TAG,postSnapshot.toString())
                        // Retrieve the requested medicine object from the snapshot
                        val feed = postSnapshot.getValue(/*valueType =*/requestmedicine::class.java)
                        KeyList.add(postSnapshot.key.toString())
                        // Add the requested medicine to the list
                        RequestMedicineList.add(feed!!)
                    }

                    // Create and set up the adapter with the requested medicine list
                    val adapter = RequestMedicineAdapter(RequestMedicineList)
                    adapter.setOnItemClickListener(object : RequestMedicineAdapter.onItemClickListener {
                        override fun onItemClick(position: Int) {
                            // Open UpdateRequestMedicineActivity and pass relevant data
                            val intent = Intent(activity, UpdateRequestMedicineActivity::class.java)
                            intent.putExtra("medicine name",RequestMedicineList[position].Medicine)
                            intent.putExtra("number", RequestMedicineList[position].Number)
                            intent.putExtra("email", RequestMedicineList[position].Email)
                            intent.putExtra("rID", KeyList[position])
                            startActivity(intent)

                        }
                    })
                    RequestMedicineRecyclerView.adapter = adapter
                }

            }

            override fun onCancelled(error: DatabaseError) {
                // Display a toast message if there is a database error
                Toast.makeText(context,"$error",Toast.LENGTH_LONG).show()
            }

            })
        }
}

//        fun newInstance(param1: String, param2: String) =
//            RequestMedicineListFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }
//}