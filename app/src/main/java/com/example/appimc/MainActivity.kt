package com.example.appimc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cuadroTitulo : TextView = findViewById(R.id.textView3)
        val cuadroPeso : EditText = findViewById(R.id.editTextPeso)
        val cuadroAltura : EditText = findViewById(R.id.editTextAltura)
        val miBoton : Button = findViewById(R.id.button)
        val cuadroIMC : TextView = findViewById(R.id.textView2)

        cuadroTitulo.text = "Calculador de IMC"

        miBoton.setOnClickListener{
            var alt : Double = cuadroAltura.text.toString().toDouble()
            var peso : Double = cuadroPeso.text.toString().toDouble()

            var imc = calcularIMC(peso, alt)

            val resul = String.format("Su IMC es %.2f", imc)
            cuadroIMC.text = resul

            cuadroIMC.text = resul
        }
    }

    private fun calcularIMC(peso: Double, altura: Double): Double {
        return peso / altura.pow(2)
    }
}