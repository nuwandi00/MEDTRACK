package com.example.kelineyt.fragments.shopping

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kelineyt.R
import com.example.kelineyt.data.feedback
import com.example.kelineyt.data.requestmedicine
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [requestMedicine.newInstance] factory method to
 * create an instance of this fragment.
 */
class requestMedicine : Fragment() {
    private lateinit var medicinename: EditText
    private lateinit var contactnumber: EditText
    private lateinit var email: EditText
    private lateinit var requestmedicine: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var dbref: DatabaseReference

    //private var param1: String? = null
    //private var param2: String? = null

    //override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //arguments?.let {
            //param1 = it.getString(ARG_PARAM1)
            //param2 = it.getString(ARG_PARAM2)
       // }
   // }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        auth = FirebaseAuth.getInstance()
        dbref = FirebaseDatabase.getInstance().getReference("RequestMedicine")

        val view = inflater.inflate(R.layout.activity_requestmedicine, container, false)
        medicinename = view.findViewById(R.id.medname)
        contactnumber = view.findViewById(R.id.medcontact)
        email = view.findViewById(R.id.medemail)
        requestmedicine = view.findViewById(R.id.btn_request)

        requestmedicine.setOnClickListener {
            //Toast.makeText(activity , "clicked" , Toast.LENGTH_LONG).show()
            setrequestmedicine()
        }

        return view
    }

    private fun setrequestmedicine() {
        var userID : String = auth.currentUser?.uid.toString()
        var Medicine : String = medicinename.text.toString()
        var Number: String = contactnumber.text.toString()
        var Email: String = email.text.toString()

        val uniqueID : String = UUID.randomUUID().toString()
        var requestMedicineDet = requestmedicine(userID,Medicine,Number,Email)

        dbref.child(uniqueID).setValue(requestMedicineDet).addOnCompleteListener{
            Toast.makeText(activity,"Requested Medicine Added successfully" , Toast.LENGTH_SHORT).show()
        }.addOnFailureListener{
            Toast.makeText(activity,"Error",Toast.LENGTH_LONG).show()
        }

    }



    // companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment requestMedicine.
         */
       // @JvmStatic
       // fun newInstance(param1: String, param2: String) =
          //  requestMedicine().apply {
              //  arguments = Bundle().apply {
                  //  putString(ARG_PARAM1, param1)
                  //  putString(ARG_PARAM2, param2)
               // }
          //  }
   // }
}