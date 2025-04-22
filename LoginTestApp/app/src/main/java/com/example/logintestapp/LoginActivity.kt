package com.example.logintestapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewModel = LoginViewModel()

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.login_button)
        val loginStatus = findViewById<TextView>(R.id.login_status)

        loginButton.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()
            val result = viewModel.login(user, pass)
            loginStatus.text = if (result) "Login exitoso" else "Credenciales inválidas"
        }
    }
}