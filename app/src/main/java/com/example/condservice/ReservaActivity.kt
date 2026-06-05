package com.example.condservice

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReservaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reserva)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.murak)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbarReserva = findViewById<Toolbar>(R.id.Reservatoolbar)
        setSupportActionBar(toolbarReserva)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        // 🏋️ ACADEMIA (NOVO)
        val btnAcademia = findViewById<Button>(R.id.btnAcademia)
        val normasAcademia = findViewById<TextView>(R.id.normasAcademia)

        btnAcademia.setOnClickListener {
            android.widget.Toast.makeText(this, "CLICOU ACADEMIA", android.widget.Toast.LENGTH_SHORT).show()

            normasAcademia.visibility = View.VISIBLE
        }

        btnAcademia.setOnClickListener {
            if (normasAcademia.visibility == View.GONE) {
                normasAcademia.visibility = View.VISIBLE
            } else {
                normasAcademia.visibility = View.GONE
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}