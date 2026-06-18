package com.example.condservice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EsqueceuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_esqueceu)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        // Recebe o email enviado pela MainActivity
        val emailRecebido = intent.getStringExtra("email") ?: ""

        val voltar = findViewById<TextView>(R.id.textVoltarEsqueceu)

        voltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val enviar = findViewById<Button>(R.id.btnEnviarEsqueceu)

        enviar.setOnClickListener {

            val emailDigitado =
                findViewById<EditText>(R.id.edtEmailEsqueceu)
                    .text.toString()

            if (emailDigitado.isEmpty()) {

                Toast.makeText(this,"Digite um e-mail válido",
                    Toast.LENGTH_SHORT).show()

            } else if (emailDigitado == emailRecebido) {

                Toast.makeText(this,"E-mail Confirmado",Toast.LENGTH_SHORT
                ).show()

            } else {

                Toast.makeText(
                    this,"E-mail não encontrado!",Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}