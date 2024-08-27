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
    lateinit var Num1: TextView
    lateinit var Num2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.buttonMain)
        textView = findViewById(R.id.TextViewMain)
        textView.text = "Calculadora2"
        Num1 = findViewById(R.id.Num1)
        Num2 = findViewById(R.id.Num2)

        button.setOnClickListener {

            var n1 = Num1.text.toString().toInt()
            var n2 = Num1.text.toString().toInt()
            var n = n1 + n2
            textView.text = n.toString()
        }

    }
}
