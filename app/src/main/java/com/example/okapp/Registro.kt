package com.example.okapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        btnEnviar.setOnClickListener {
            val intent = Intent(this@Registro, Hola::class.java)
            var nombre :String = editTextNombre.text.toString()
            var email :String = editTextEmail.text.toString()
            val datos : Bundle = Bundle()
            datos.putString("data1", nombre)
            datos.putString("data2", email)
            intent.putExtras(datos)
            startActivity(intent)
        }

    }
}