package com.example.logintestapp

class LoginViewModel {
    fun login (username: String, password: String): Boolean {
        return username == "admin" && password == "1234"
    }
}