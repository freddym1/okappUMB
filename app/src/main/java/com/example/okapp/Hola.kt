package com.example.okapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hola.*
import kotlinx.android.synthetic.main.activity_registro.*

class Hola : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hola)

        var bundle = intent.extras
        if (bundle != null) {
            textViewNombreOk.text = "Bienvenido "+bundle.getString("data1")
            textViewEmailOk.text = bundle.getString("data2")
        }

    }
}