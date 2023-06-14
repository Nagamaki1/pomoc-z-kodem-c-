package com.example.myapplication

import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textViewMail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val textViewMessage = findViewById<TextView>(R.id.textView6)
        button.setOnClickListener {
            if(!textViewMail.text.contains("@")){
                textViewMessage.text = "Błąd e-maila"
            }
        }
    }
}