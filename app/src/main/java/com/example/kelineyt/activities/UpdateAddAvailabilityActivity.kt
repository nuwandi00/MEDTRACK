package com.example.kelineyt.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kelineyt.R
import com.example.kelineyt.data.Scheduling
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UpdateAddAvailabilityActivity : AppCompatActivity() {

        //initialization
        private lateinit var auth: FirebaseAuth
        private lateinit var database: DatabaseReference
        private lateinit var sdname: EditText
        private lateinit var sspeciality: EditText
        private lateinit var saddress: EditText
        private lateinit var sdate: EditText
        private lateinit var sfrom: EditText
        private lateinit var sto: EditText
        private lateinit var btnDelete: Button
        private lateinit var btnnUpdate: Button



        //declare variables and initialize to null
        var usersdName: String? = null
        var usersSpeciality: String? = null
        var usersAddress: String? = null
        var usersDate: String? = null
        var usersFrom: String? = null
        var usersTo: String? = null
        var addAvailabilityID: String? = null


        //@SuppressLint("MissingInflatedId")

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.update_availability)
            auth = FirebaseAuth.getInstance()
            val user = auth.currentUser

            database = FirebaseDatabase.getInstance().getReference("Scheduling")

            sdname = findViewById(R.id.docNameUpdate)
            sspeciality = findViewById(R.id.SpecilityUpdate)
            saddress = findViewById(R.id.AddressUpdate)
            sdate = findViewById(R.id.DateUpdate)
            sfrom = findViewById(R.id.FromUpdate)
            sto = findViewById(R.id.toUpdate)
            btnnUpdate = findViewById(R.id.Update)
            btnDelete = findViewById(R.id.Delete)

            val bundle: Bundle? = intent.extras

            usersdName = bundle?.getString("sname")
            usersSpeciality = bundle?.getString("speciality")
            usersAddress = bundle?.getString("address")
            usersDate = bundle?.getString("date")
            usersFrom = bundle?.getString("from")
            usersTo = bundle?.getString("to")
            addAvailabilityID = bundle?.getString("sID")


            sdname.setText(usersdName.toString())
            sspeciality.setText(usersSpeciality.toString())
            saddress.setText(usersAddress.toString())
            sdate.setText(usersDate.toString())
            sfrom.setText(usersFrom.toString())
            sto.setText(usersTo.toString())

            btnnUpdate.setOnClickListener {
                updateAddAvailability()
            }

            btnDelete.setOnClickListener {
                deleteAddAvailability()
            }
        }

        private fun deleteAddAvailability() {
            val Scheduling= addAvailabilityID.toString()

            database.child(Scheduling).removeValue()
                .addOnCompleteListener{
                    Toast.makeText(this, "Availability Deleted" , Toast.LENGTH_SHORT).show()
                }.addOnFailureListener {
                    Toast.makeText(this, "Error" , Toast.LENGTH_SHORT).show()
                }

        }

        private fun updateAddAvailability() {
            val Scheduling = addAvailabilityID.toString()


            val edittName =  sdname.text.toString()
            val editSpecility = sspeciality.text.toString()
            val editAddress = saddress.text.toString()
            val editDate = sdate.text.toString()
            val editFrom = sfrom.text.toString()
            val editTo = sto.text.toString()
            val userID : String = auth.currentUser?.uid.toString()


            val updatedAddAvailability =  Scheduling(userID , edittName , editSpecility, editAddress, editDate, editFrom, editTo )

            database.child(Scheduling).setValue(updatedAddAvailability)
                .addOnCompleteListener{
                    Toast.makeText(this , "Availability Updated" , Toast.LENGTH_SHORT).show()
                }.addOnFailureListener {
                    Toast.makeText(this , "Error" , Toast.LENGTH_SHORT).show()
                }
        }

    }




