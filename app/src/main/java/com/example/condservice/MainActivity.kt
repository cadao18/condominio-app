package com.example.condservice

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.murak)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCadastro = findViewById<ImageView>(R.id.bntCadastro)

        btnCadastro.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)

            startActivity(intent)


        }
        val bntLogin = findViewById<ImageView>(R.id.bntLogin)

        bntLogin.setOnClickListener {

            val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
            val senha = findViewById<EditText>(R.id.editTextSenha).text.toString()

            if (email == "teste@gmail.com" && senha == "12345") {

                val login = Intent(this, LoginActivity::class.java)
                login.putExtra("nome", "Ricardo")
                startActivity(login)

            } else {

                Toast.makeText(
                    this,
                    "Usuário ou senha inválidos",
                    Toast.LENGTH_LONG
                ).show()
            }




        }
    }
}