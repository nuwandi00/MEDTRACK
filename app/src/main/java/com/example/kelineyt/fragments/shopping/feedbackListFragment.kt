package com.example.kelineyt.fragments.shopping

import android.content.ContentValues.TAG
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
import com.example.kelineyt.adapters.FeedbackAdapter
import com.example.kelineyt.data.feedback
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class FeedbackListFragment : Fragment() {
    private lateinit var database: DatabaseReference
    private lateinit var feedBackList: ArrayList<feedback>
    private lateinit var feedbackRecyclerView: RecyclerView

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
        val view = inflater.inflate(R.layout.myfeedbacklis_fragment, container, false)
        feedbackRecyclerView = view.findViewById(R.id.recycleview)
        feedbackRecyclerView.layoutManager = LinearLayoutManager(view.context)
        feedbackRecyclerView.setHasFixedSize(true)

        feedBackList = arrayListOf()
        feedbackRecyclerView.adapter = FeedbackAdapter(feedBackList)
        getFeedbackData()

        return view
    }

    private fun getFeedbackData() {
        database = FirebaseDatabase.getInstance().getReference("Feedback")

        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()) {
                    feedBackList = arrayListOf()
                    for (postSnapshot in snapshot.children) {
//                        Log.d(TAG,postSnapshot.toString())
                        val feed = postSnapshot.getValue(/*valueType =*/feedback::class.java)
                        feedBackList.add(feed!!)
                    }

//                    Log.d(TAG , feedBackList.toString())

                    val adapter = FeedbackAdapter(feedBackList)
                    feedbackRecyclerView.adapter = adapter
                }

            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context,"$error",Toast.LENGTH_LONG).show()
            }

        })
    }
}

//        fun newInstance(param1: String, param2: String) =
//            feedbackListFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
