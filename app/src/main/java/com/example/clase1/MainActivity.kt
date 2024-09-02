package com.example.clase1

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var BtnPlus : Button
    lateinit var BtnMin : Button
    lateinit var BtnMulti : Button
    lateinit var BtnDiv : Button
    lateinit var textView: TextView
    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var resultado: TextView
   // val calculadora: calculadora()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        BtnPlus = findViewById(R.id.btnPlus)
        BtnMin = findViewById(R.id.btnMinus)
        BtnMulti = findViewById(R.id.btnMulti)
        BtnDiv = findViewById(R.id.btnDiv)

        textView = findViewById(R.id.TextViewMain)
        textView.text = "Calculadora2"
        et1 = findViewById(R.id.Num1)
        et2 = findViewById(R.id.Num2)
        resultado = findViewById(R.id.Respuesta)


        BtnPlus.setOnClickListener {
            if (checkValidEditTexts(et1, et2))
            {
                et1.text.toString().toDouble()
                et2.text.toString().toDouble()

            }
            else
            {
                Toast.makeText(this, "Tiene que ingresar dos valores", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun checkValidEditTexts(editText1: EditText, editText2: EditText): Boolean {
        return editText1.text.isNotEmpty() && editText2.text.isNotEmpty()
    }
}

