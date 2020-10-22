package com.example.okapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        //Validación de email
        editTextEmail.addTextChangedListener(object:TextWatcher{

            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                if(android.util.Patterns.EMAIL_ADDRESS.matcher(editTextEmail.text.toString()).matches())
                    btnEnviar.isEnabled = true
                else {
                    btnEnviar.isEnabled = false
                    editTextEmail.setError("Email Invalido")
                }
            }

        })

        //Envío de datos
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