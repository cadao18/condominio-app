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

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro)

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

        val nome = findViewById<EditText>(R.id.editTextName)
        val cpf = findViewById<EditText>(R.id.editTextCpf)
        val email = findViewById<EditText>(R.id.editEmailCadastro)
        val senha = findViewById<EditText>(R.id.editTextSenhaCadastro)
        val confirmarSenha = findViewById<EditText>(R.id.editConfirmarSenha)

        val btnCadastrar = findViewById<Button>(R.id.bntCadastrar)

        btnCadastrar.setOnClickListener {

            val nomeTexto = nome.text.toString()
            val cpfTexto = cpf.text.toString()
            val emailTexto = email.text.toString()
            val senhaTexto = senha.text.toString()
            val confirmarSenhaTexto = confirmarSenha.text.toString()

            if (
                nomeTexto.isEmpty() ||
                cpfTexto.isEmpty() ||
                emailTexto.isEmpty() ||
                senhaTexto.isEmpty() ||
                confirmarSenhaTexto.isEmpty()
            ) {

                Toast.makeText(
                    this,
                    "Preencha todos os campos",
                    Toast.LENGTH_LONG
                ).show()

            } else if (senhaTexto != confirmarSenhaTexto) {

                Toast.makeText(
                    this,
                    "As senhas não coincidem",
                    Toast.LENGTH_LONG
                ).show()

            } else {

                Toast.makeText(
                    this,
                    "Cadastro realizado com sucesso",
                    Toast.LENGTH_LONG
                ).show()

                val intent = Intent(this, LoginActivity::class.java)
                intent.putExtra("nome", nomeTexto)
                startActivity(intent)

                finish()
            }
        }
    }
}