package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

    /*
    public fun ClickBoton (v:view?){
    ("Hola mundo")
    }
     */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBoton: Button = findViewById(R.id.btnBoton)
        val btnBoton2: Button = findViewById(R.id.btnBoton3)

        btnBoton2.setOnClickListener {
            val otroactivity = Intent(this, MainActivity2::class.java)
            startActivity(otroactivity)
        }

        btnBoton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
    val numero = lanzar(6)
    val txtResul: TextView = findViewById(R.id.txtResultado)
        txtResul.text= numero.toString()


        val drawableResource = when (numero){
            1-> R.drawable.dado1
            2-> R.drawable.dado2
            3-> R.drawable.dado3
            4-> R.drawable.dado4
            5-> R.drawable.dado5
            else -> R.drawable.dado6
        }
        val imgDado : ImageView = findViewById(R.id.imgDado)
        imgDado.setImageResource(drawableResource)
        //Toast.makeText(this, numero.toString(), Toast.LENGTH_LONG).show()
    }

    private fun lanzar(max: Int): Int {
        return(1..max).random()
    }
}