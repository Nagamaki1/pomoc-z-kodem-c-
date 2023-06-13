package com.niepolomice.ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

const val EXTRA_MESSAGE = "com.niepolomice.ex1.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editA = findViewById<EditText>(R.id.editTextA)
        val editB = findViewById<EditText>(R.id.editTextB)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val radioButtonDod = findViewById<RadioButton>(R.id.rbPlus)
        val radioButtonMin = findViewById<RadioButton>(R.id.rbMinus)
        val radioButtonMnom = findViewById<RadioButton>(R.id.rbPomnoz)
        val radioButtonDziel = findViewById<RadioButton>(R.id.rbPodziel)
        btnAdd.setOnClickListener {
            try {
                val a = editA.text.toString().toBigDecimal();
                val b = editB.text.toString().toBigDecimal();
                if(radioButtonDod.isChecked) {
                    val result = a + b;
                    Toast.makeText(this@MainActivity,(a+b).toString(),Toast.LENGTH_LONG).show();
                    tvResult.text = "$a + $b = ${a+b}";

                }
                if(radioButtonMin.isChecked) {
                    val result = a - b;
                    Toast.makeText(this@MainActivity,(result).toString(),Toast.LENGTH_LONG).show();
                    tvResult.text = "$a - $b = ${a-b}";

                }

            }catch (e: java.lang.NumberFormatException){
                Toast.makeText(this@MainActivity,"Błędne dane",Toast.LENGTH_LONG).show()
                tvResult.text = "Błędne dane!!!";
            }

        }

    }
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

}