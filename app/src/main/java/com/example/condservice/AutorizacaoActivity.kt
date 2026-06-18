package com.example.condservice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AutorizacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_autorizacao)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.murak)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cpfAut = findViewById<EditText>(R.id.editCpfAut)
        val nomeAut = findViewById<EditText>(R.id.editNomeAut)
        val apto = findViewById<EditText>(R.id.editAptoAut)
        val bloco = findViewById<EditText>(R.id.editBlocoAut)

        val bntAut = findViewById<Button>(R.id.bntAutorizacao)

        bntAut.setOnClickListener {

                val cpf = cpfAut.text.toString().trim()
                val nome = nomeAut.text.toString().trim()
                val apt = apto.text.toString().trim()
                val bloco = bloco.text.toString().trim()

                if (cpf.isNotEmpty() && nome.isNotEmpty() && apt.isNotEmpty() && bloco.isNotEmpty()) {

                    Toast.makeText(this, "Autorização cadastrada com sucesso!", Toast.LENGTH_SHORT
                    ).show()

                } else {

                    Toast.makeText(this,"Preencha todos os campos!",Toast.LENGTH_SHORT
                    ).show()

            }
        }

    }

}