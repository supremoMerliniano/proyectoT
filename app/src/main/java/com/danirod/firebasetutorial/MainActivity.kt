package com.danirod.firebasetutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prueba = PruebaElementos()
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etaPa = findViewById<EditText>(R.id.etaPa)
        val etaMa = findViewById<EditText>(R.id.etaMa)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etTel = findViewById<EditText>(R.id.etTel)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val persona = Persona(
                prueba.nombres(etNombre.text.toString()),
                prueba.nombres(etaPa.text.toString()),
                prueba.nombres(etaMa.text.toString()),
                etEmail.text.toString(),
                prueba.telefono(etTel.text.toString())
            )

            val modelo = Modelo()

            modelo.addFirestore(persona.toMap())
        }
    }
}