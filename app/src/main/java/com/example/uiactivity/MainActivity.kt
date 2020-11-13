package com.example.uiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next.*
import kotlin.random.Random
import kotlinx.android.synthetic.main.activity_main.next_layout as next_layout1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ageSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                ageView.text = "Age: "+progress
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        switch1.setOnCheckedChangeListener { switch1, onSwitch ->
            if (onSwitch)
                editNumber.visibility = View.VISIBLE
            else
                editNumber.visibility = View.GONE
        }

        nextPageBtn.setOnClickListener {
            showNextActivity()
        }

        signUpBtn.setOnClickListener {
            val firstName = editFirstName.text.toString()
            val lastName = editLastName.text.toString()
            val email = editEmail.text.toString()
            val age = ageView.text.toString()
            val number = editNumber.text.toString()
            val day = datePicker.dayOfMonth.toString()
            val month = datePicker.month.toString()
            val year = datePicker.year.toString()

            //start intent activity and pass data
            var intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("FirstName", firstName)
            intent.putExtra("LastName", lastName)
            intent.putExtra("Email", email)
            intent.putExtra("Age", age)
            intent.putExtra("Number", number)
            intent.putExtra("DD", day)
            intent.putExtra("MM", month)
            intent.putExtra("YY", year)

            startActivity(intent)
        }
    }
    private fun showNextActivity()
    {
        next_layout.visibility = View.VISIBLE
        main_layout.visibility = View.GONE

    }

}