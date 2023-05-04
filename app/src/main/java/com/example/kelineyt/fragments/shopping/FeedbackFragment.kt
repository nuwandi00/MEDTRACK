package com.example.kelineyt.fragments.shopping

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.kelineyt.R
import com.example.kelineyt.data.feedback
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import org.w3c.dom.Comment
import java.util.UUID

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FeedbackFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FeedbackFragment : Fragment() {
    private lateinit var name: EditText
    private lateinit var comment: EditText
    private lateinit var sendFeedback: Button
    private lateinit var auth: FirebaseAuth
    private lateinit var dbref: DatabaseReference

//    private var param1: String? = null
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

        auth = FirebaseAuth.getInstance()
        dbref = FirebaseDatabase.getInstance().getReference("Feedback")

        val view = inflater.inflate(R.layout.feedback_fragment, container, false)
        name = view.findViewById(R.id.feedbackName)
        comment = view.findViewById(R.id.feedbackComment)
        sendFeedback = view.findViewById(R.id.btnFeedback)

        sendFeedback.setOnClickListener {
            if(name.text.isNotEmpty() && comment.text.isNotEmpty()) {
                setFeedback()
                findNavController().navigate(R.id.action_feedbackFragment_to_feedbackListFragment)
            } else {
                Toast.makeText(activity,"Please fill input fields",Toast.LENGTH_SHORT).show()
            }

        }
        return view
    }


    private fun setFeedback() {
        var userID : String = auth.currentUser?.uid.toString()
        var fdname : String = name.text.toString()
        var fdcomment : String = comment.text.toString()

        val uniqueID : String = UUID.randomUUID().toString()
        var feedbackDet = feedback(userID,fdname,fdcomment)

        dbref.child(uniqueID).setValue(feedbackDet).addOnCompleteListener{
            Toast.makeText(activity,"Feedback Added successfully" , Toast.LENGTH_SHORT).show()
        }.addOnFailureListener{
            Toast.makeText(activity,"Error",Toast.LENGTH_LONG).show()
        }

    }


//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment FeedbackFragment.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            FeedbackFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }

}