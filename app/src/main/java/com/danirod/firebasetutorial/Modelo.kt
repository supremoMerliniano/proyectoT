package com.danirod.firebasetutorial

import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

class Modelo: AppCompatActivity() {
    val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun addFirestore(usuario: MutableMap<String, Any>) {
        var error = false

        for ((k, v) in usuario) {
            if(v == "Valor erróneo") {
                Log.i("MSG", "Valor erróneo en el campo $k")
                error = true
            }
        }

        if(!error)
            Log.i("MSG", "Agregar a BD")
            //firestore.collection("clientes").document("CBI02").set(usuario)
    }

    fun retrieveData() {
        val docs = firestore.collection("clientes").get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    Log.d("MSG", "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener { exception ->
                Log.d("MSG", "Error getting documents: ", exception)
            }
    }


}