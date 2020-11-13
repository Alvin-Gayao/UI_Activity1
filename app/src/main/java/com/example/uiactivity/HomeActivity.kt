package com.example.uiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_next.*
import java.lang.reflect.Array.getInt
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {
    var accountImage : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val randomInt = Random.nextInt(5) + 1
        val drawableImages = when(randomInt) {
            1 -> R.drawable.anonymous_mask
            2 -> R.drawable.avatar
            3 -> R.drawable.pennywise
            4 -> R.drawable.predator
            else -> R.drawable.walter_white
        }
          accountImageView.setImageResource(drawableImages)


        val intent = getIntent()
        val firstName = intent.getStringExtra("FirstName")
        val lastName = intent.getStringExtra("LastName")
        val email = intent.getStringExtra("Email")
        val age = intent.getStringExtra("Age")
        val number = intent.getStringExtra("Number")
        val day = intent.getStringExtra("DD")
        val month = intent.getStringExtra("MM")
        val year = intent.getStringExtra("YY")

        firstNameView.text = "First Name: "+firstName
        lastNameView.text = "Last Name: "+lastName
        ageView.text = age
        emailView.text = "Email: "+email
        birthDayView.text = "Birth Date: "+ day+"/"+month+"/"+year
        numberView.text = "Phone Number: "+number



    }
}


