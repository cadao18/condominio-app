package com.example.condservice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.murak)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        val nome = intent.getStringExtra("nome")

        val usuario = findViewById<EditText>(R.id.editTextName)
        usuario.setText("Olá $nome")

        val buttonBoleto = findViewById<Button>(R.id.BOLETO)
        val buttonReserva = findViewById<Button>(R.id.ReservaBtn)
        val autorizacao = findViewById<Button>(R.id.buttonAutorizacao)
        val mural = findViewById<Button>(R.id.buttonMural)

        buttonBoleto.setOnClickListener {
            startActivity(Intent(this, BoletoActivity::class.java))
        }

        buttonReserva.setOnClickListener {
            startActivity(Intent(this, ReservaActivity::class.java))
        }
        autorizacao.setOnClickListener {
            startActivity(Intent(this, AutorizacaoActivity::class.java))
        }
        mural.setOnClickListener {
            startActivity(Intent(this, MuralActivity::class.java))
        }
    }
}