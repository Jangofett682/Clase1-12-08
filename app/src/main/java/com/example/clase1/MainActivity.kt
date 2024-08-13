package com.example.clase1

import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.buttonMain)
        textView = findViewById(R.id.TextViewMain)
        textView.text = "Esto es un texto"

        button.setOnClickListener {
            Toast.makeText(this, "Se preciono el boton", Toast.LENGTH_SHORT)
        }

    }
}
