package com.danirod.firebasetutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.firestore.FirebaseFirestore

class RetrieveData: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrieve_data)

        val btnRecibir = findViewById<Button>(R.id.btnRecibir)
        val modelo = Modelo()


        btnRecibir.setOnClickListener {
            modelo.retrieveData()
        }


    }
}