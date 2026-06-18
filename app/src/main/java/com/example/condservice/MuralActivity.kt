package com.example.condservice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MuralActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mural)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.murak)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        val comunicados = listOf(
          "Reunião de condominio",
            "Reunião de condominio",
            "Reunião de condominio",
            "Reunião de condominio",
            "Reunião de condominio"


        )
        val recicle= findViewById<RecyclerView>(R.id.recicleViewMural)
        recicle.layoutManager = LinearLayoutManager(this)
        recicle.adapter = MuralAdapter(comunicados)
    }
}