package com.example.kelineyt.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kelineyt.R
import com.example.kelineyt.data.requestmedicine
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UpdateRequestMedicineActivity: AppCompatActivity() {

    //initialization
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference
    private lateinit var edt_medName: EditText
    private lateinit var edt_medContact: EditText
    private lateinit var edt_Email: EditText
    private lateinit var btn_updatemed: Button
    private lateinit var btn_cancelmed: Button

    //declare variables and initialize to null
    var userMedicine: String? = null
    var userNumber: String? = null
    var userEmail: String? = null
    var RequestMedicineID: String? = null

    //@SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requestmedicineupdatedelete)
        auth = FirebaseAuth.getInstance()
        val user = auth.currentUser

        //Database connection
        database = FirebaseDatabase.getInstance().getReference("RequestMedicine")

        //reference to UI components
        edt_medName = findViewById(R.id.medname_detdelete)
        edt_medContact = findViewById(R.id.medcontact_edtdelete)
        edt_Email = findViewById(R.id.medemail_edtdelete)
        btn_updatemed = findViewById(R.id.btn_editmed)
        btn_cancelmed = findViewById(R.id.btn_deletemed)

        //access medicine , contactNumber , email passed along with intent and initialize
        val bundle: Bundle? = intent.extras
        userMedicine = bundle?.getString("medicine name")
        userNumber = bundle?.getString("number")
        userEmail = bundle?.getString("email")
        RequestMedicineID = bundle?.getString("rID")

        //set the text of EditText
        edt_medName.setText(userMedicine.toString())
        edt_medContact.setText(userNumber.toString())
        edt_Email.setText(userEmail.toString())

        //update posts
        btn_updatemed.setOnClickListener {
            //calling editPost function
            updateRequest()
        }

        //delete posts
        btn_cancelmed.setOnClickListener {
            //calling deletePost function
            deleteRequest()
        }
    }

    private fun deleteRequest() {
        //assign post ID to post variable
        val feedback = RequestMedicineID.toString()

        //remove post from firebase realtime database
        database.child(feedback).removeValue()
            .addOnCompleteListener{
                Toast.makeText(this, "Request Medicine Deleted" , Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Error" , Toast.LENGTH_SHORT).show()
            }

    }

    private fun updateRequest() {
        //assign post ID to post variable
        val requestmedicine = RequestMedicineID.toString()
        val userID : String = auth.currentUser?.uid.toString()
        val editMedicine = edt_medName.text.toString()
        val editNumber = edt_medContact.text.toString()
        val editEmail = edt_Email.text.toString()


        val updatedRequestMedicine = requestmedicine(userID , editMedicine , editNumber,editEmail )

        database.child(requestmedicine).setValue(updatedRequestMedicine)
            .addOnCompleteListener{
                Toast.makeText(this , "Request Medicine Updated" , Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this , "Error" , Toast.LENGTH_SHORT).show()
                }
        }

}
