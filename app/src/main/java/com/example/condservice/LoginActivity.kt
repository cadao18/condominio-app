package com.example.condservice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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

        
        val usuario = findViewById<TextView>(R.id.textName)
        usuario.text = "Olá $nome"

        val buttonBoleto = findViewById<Button>(R.id.BOLETO)
        val buttonReserva = findViewById<Button>(R.id.ReservaBtn)
        val autorizacao = findViewById<Button>(R.id.buttonAutorizacao)
        val mural = findViewById<Button>(R.id.buttonMural)
        val prestacaContas = findViewById<Button>(R.id.buttonContas)
        val mudanca = findViewById<Button>(R.id.buttonMudanca)
        val portaria =findViewById<Button>(R.id.buttonContato)

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
        prestacaContas.setOnClickListener {
            startActivity(Intent(this, PrestacaoActivity::class.java))
        }
        mudanca.setOnClickListener {
            startActivity(Intent(this, MudancaActivity::class.java))
        }
        portaria.setOnClickListener {
            startActivity(Intent(this, PortariaActivity::class.java))
        }
    }
}