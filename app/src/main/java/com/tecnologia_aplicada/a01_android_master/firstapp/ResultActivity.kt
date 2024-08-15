package com.tecnologia_aplicada.a01_android_master.firstapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tecnologia_aplicada.a01_android_master.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = findViewById<TextView>(R.id.txtResult)

        //El orEmpty indica que si es nulo el contenido del extra lo retorna vacio
        val content: String = intent.extras?.getString("Extra_name").orEmpty()

        result.text = "Hola $content"
    }
}