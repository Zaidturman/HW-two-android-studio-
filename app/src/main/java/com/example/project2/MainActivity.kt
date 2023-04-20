package com.example.project2

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


   val paybtn = findViewById<Button>(R.id.button)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButton1 = findViewById<RadioButton>(R.id.radiobtn1)
        val radioButton2 = findViewById<RadioButton>(R.id.radiobtn2)
        val radioButton3 = findViewById<RadioButton>(R.id.radiobtn3)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val checkBox2= findViewById<CheckBox>(R.id.checkBox2)

        var result1: String=""
        var result2: String=""
        var result3: String=""
        var result: String=""



        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radiobtn1 -> {
                    result1= radioButton1.text.toString()+ " Coffee "
                }
                R.id.radiobtn2-> {
                    result1= radioButton2.text.toString()+" Coffee "
                }
                R.id.radiobtn3 -> {
                    result1= radioButton3.text.toString()+" Coffee "
                }
            }
        }

        paybtn.setOnClickListener {

         if(checkBox1.isChecked){
               result2= " & "+checkBox1.text.toString()
         }
            else{
             result2= ""

         }
         if(checkBox2.isChecked){
                result3= " & "+checkBox1.text.toString()

          }
         else{
             result3= ""

         }

            result=  result1 + result2 + result3

                val toast = Toast.makeText(applicationContext,result , Toast.LENGTH_SHORT)
              toast.show()






        }




        }
    }

