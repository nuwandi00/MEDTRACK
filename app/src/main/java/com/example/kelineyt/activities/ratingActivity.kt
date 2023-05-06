package com.example.kelineyt.activities

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kelineyt.R

class ratingActivity: AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.rating)

            val ratingBar = findViewById<RatingBar>(R.id.ratingbar)
            val button =findViewById<Button>(R.id.submitbutton)
            val ratingScale=findViewById<TextView>(R.id.ratingtype)

            ratingBar.setOnRatingBarChangeListener{rBar,fl,b ->
                ratingScale.text =fl.toString()
                when(rBar.rating.toInt()) {
                    1 -> ratingScale.text = "very Bad"
                    2 -> ratingScale.text = "Bad"
                    3 -> ratingScale.text = "Good"
                    4 -> ratingScale.text = "Great"
                    5 -> ratingScale.text = "Awesome"
                    else-> ratingScale.text = "   "
                }

            }
            button.setOnClickListener{
                var message = ratingBar.rating.toString()
                Toast.makeText(this@ratingActivity, "Rating is:"+message,Toast.LENGTH_SHORT).show()
            }
        }
    }
