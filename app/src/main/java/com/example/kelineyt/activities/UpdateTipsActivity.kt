package com.example.kelineyt.activities

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kelineyt.R
import com.example.kelineyt.data.Tips
import com.example.kelineyt.data.requestmedicine
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UpdateTipsActivity: AppCompatActivity() {

    //initialization
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference
    private lateinit var TipDocname: EditText
    private lateinit var TipsEditText: EditText
    private lateinit var btnTipsUpdate: Button
    private lateinit var btnTipsDelete: Button

    //declare variables and initialize to null
    var userDoctorNameTIP: String? = null
    var userTipsComment: String? = null
    var HealthTipsID: String? = null

    //@SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_healthtips)
        auth = FirebaseAuth.getInstance()
        val user = auth.currentUser

        //Database connection
        database = FirebaseDatabase.getInstance().getReference("HealthTips")

        //set the text of EditText
        TipDocname = findViewById(R.id.doctor_Nameedts)
        TipsEditText = findViewById(R.id.health_tipsedts)
        btnTipsUpdate = findViewById(R.id.edt_tipsbtns)
        btnTipsDelete = findViewById(R.id.delete_tips3btnn)

        //access doctorname , tips , unitprofit passed along with intent and initialize
        val bundle: Bundle? = intent.extras
        userDoctorNameTIP = bundle?.getString("DoctorsName")
        userTipsComment = bundle?.getString("HealthyTips")
        HealthTipsID = bundle?.getString("tID")

        Log.d(TAG ,HealthTipsID.toString())

        //set the text of EditText
        TipDocname.setText(userDoctorNameTIP.toString())
        TipsEditText.setText(userTipsComment.toString())

        //update posts
        btnTipsUpdate.setOnClickListener {
            updateHealthTip()
        }

        //delete posts
        btnTipsDelete.setOnClickListener {
            deleteHealthTip()
        }
    }

    private fun deleteHealthTip() {
        //assign post ID to post variable
        val Tips = HealthTipsID.toString()

        //remove post from firebase realtime database
        database.child(Tips).removeValue()
            //call addOnCompleteListener if post deleted successfully
            .addOnCompleteListener{
                Toast.makeText(this, "Tips Deleted" , Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Error" , Toast.LENGTH_SHORT).show()
            }

    }

    private fun updateHealthTip() {
        //assign post ID to post variable
        val Tips = HealthTipsID.toString()
        //get current user's userID
        val userID : String = auth.currentUser?.uid.toString()
        val editDoctorNameTIP = TipDocname.text.toString()
        val editTipsComment = TipsEditText.text.toString()


// Update the database with the new healthy tips
        val updatedHealthyTips = Tips(userID , editDoctorNameTIP , editTipsComment )

        database.child(Tips).setValue(updatedHealthyTips)
            //call addOnCompleteListener if post update successfully
            .addOnCompleteListener{
                Toast.makeText(this , "Tips Updated" , Toast.LENGTH_SHORT).show()
                // Call addOnFailureListener if there is an error while updating
            }.addOnFailureListener {
                Toast.makeText(this , "Error" , Toast.LENGTH_SHORT).show()
            }
    }

}

