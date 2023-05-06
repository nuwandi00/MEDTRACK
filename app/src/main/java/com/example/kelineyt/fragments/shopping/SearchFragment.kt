package com.example.kelineyt.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kelineyt.R
import com.example.kelineyt.data.Tips
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

class SearchFragment: Fragment() {
    private lateinit var Tdocname: EditText
    private lateinit var tipscomment: EditText
    private lateinit var addtipsbtn: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var dbref: DatabaseReference


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        auth = FirebaseAuth.getInstance()
        dbref = FirebaseDatabase.getInstance().getReference("HealthTips")

        val view = inflater.inflate(R.layout.activity_healthtips, container, false)
        Tdocname = view.findViewById(R.id.doctor_Name)
        tipscomment = view.findViewById(R.id.health_tips)
        addtipsbtn = view.findViewById(R.id.Add_tips)

        addtipsbtn.setOnClickListener {
        if(Tdocname.text.isNotEmpty() && tipscomment.text.isNotEmpty()) {
            setTips()
            findNavController().navigate(R.id.action_searchFragment_to_tipListFragment)
  } else {
            Toast.makeText(activity,"Please fill input fields", Toast.LENGTH_SHORT).show()
        }

    }
        return view
    }


    private fun setTips() {
        var userID: String = auth.currentUser?.uid.toString()
        var docname: String = Tdocname.text.toString()
        var Tipscomment: String = tipscomment.text.toString()

        val uniqueID: String = UUID.randomUUID().toString()
        var tipsDet = Tips(userID, docname, Tipscomment)

        dbref.child(uniqueID).setValue(tipsDet).addOnCompleteListener {
            Toast.makeText(activity, "Tips Added successfully", Toast.LENGTH_SHORT).show()
        }.addOnFailureListener {
            Toast.makeText(activity, "Error", Toast.LENGTH_LONG).show()
        }

    }
}
