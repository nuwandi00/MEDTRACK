package com.example.kelineyt.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kelineyt.R
import com.example.kelineyt.data.feedback
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class edit_fb_Activity : AppCompatActivity() {

    //initialization
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference
    private lateinit var fdName: EditText
    private lateinit var comment: EditText
    private lateinit var btnUpdate: Button
    private lateinit var btnCancel: Button

    //declare variables and initialize to null
    var userName: String? = null
    var userComment: String? = null
    var feedbackID: String? = null

    //@SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_feedback)
        auth = FirebaseAuth.getInstance()
        val user = auth.currentUser

        database = FirebaseDatabase.getInstance().getReference("Feedback")

        fdName = findViewById(R.id.editfeedbackName)
        comment = findViewById(R.id.editfeedbackComment)
        btnUpdate = findViewById(R.id.editfdbtnupdate)
        btnCancel = findViewById(R.id.fdeditbtndelete)

        val bundle: Bundle? = intent.extras
        userName = bundle?.getString("name")
        userComment = bundle?.getString("comment")
        feedbackID = bundle?.getString("fID")

        fdName.setText(userName.toString())
        comment.setText(userComment.toString())

        btnUpdate.setOnClickListener {
            editFeedback()
        }

        btnCancel.setOnClickListener {
            deleteFeedback()
        }
    }

    private fun deleteFeedback() {
        val feedback = feedbackID.toString()

        database.child(feedback).removeValue()
            .addOnCompleteListener{
                Toast.makeText(this, "Feedback Deleted" , Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Error" , Toast.LENGTH_SHORT).show()
            }

    }

    private fun editFeedback() {
        val feedback = feedbackID.toString()
        val userID : String = auth.currentUser?.uid.toString()
        val editName = fdName.text.toString()
        val editComment = comment.text.toString()

        val updatedFeedback = feedback(userID , editName , editComment)

        database.child(feedback).setValue(updatedFeedback)
            .addOnCompleteListener{
                Toast.makeText(this , "Feedback Updated" , Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this , "Error" , Toast.LENGTH_SHORT).show()
            }
    }

}