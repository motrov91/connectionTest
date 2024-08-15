package com.tecnologia_aplicada.a01_android_master.firstapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tecnologia_aplicada.a01_android_master.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)

        val btnPresionar = findViewById<AppCompatButton>(R.id.btnPressionar)
        val etContenido = findViewById<AppCompatEditText>(R.id.etDatos)

        btnPresionar.setOnClickListener {
            val content = etContenido.text.toString()
            if (content.isNotEmpty()) {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("Extra_name", content)
                startActivity(intent)
            }
        }
    }
}