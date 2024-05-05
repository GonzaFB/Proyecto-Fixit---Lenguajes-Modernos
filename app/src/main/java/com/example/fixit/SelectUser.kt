package com.example.fixit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SelectUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seleccion_usuario)
    }

    fun OpenRegistEspecialist(view: View) {
        val intent = Intent(this, RegisterUser::class.java)
        startActivity(intent)
    }
}