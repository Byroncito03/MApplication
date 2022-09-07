package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnBoton: Button = findViewById(R.id.btnBoton2)

        btnBoton.setOnClickListener {


        Toast.makeText(this,"Formulario Enviado", Toast.LENGTH_LONG).show()
        }
    }
}