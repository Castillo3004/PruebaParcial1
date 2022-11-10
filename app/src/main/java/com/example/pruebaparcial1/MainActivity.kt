package com.example.pruebaparcial1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            val saltar: Intent = Intent(this, IMCCanino::class.java)
            startActivity(saltar)
        }
        btn2.setOnClickListener{
            val saltar: Intent = Intent(this, IMCCanino::class.java)
            startActivity(saltar)
        }
        btn3.setOnClickListener{
            val saltar: Intent = Intent(this, IMCCanino::class.java)
            startActivity(saltar)
        }
    }
}