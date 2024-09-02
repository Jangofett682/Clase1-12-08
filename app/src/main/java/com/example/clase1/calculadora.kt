package com.example.clase1

class calculadora(
    var num1: Double = 0.0,
    var num2: Double = 0.0,
    var operacion: String = ""
) {

        fun calcularOperacion() : Double {
            return when(operacion) {
                "suma" -> num1 + num2
                "resta" -> num1 - num2
                "multiplicacion" -> num1 * num2
                else -> num1 / num2
            }
        }




}