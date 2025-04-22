package com.example.logintestapp

import org.junit.Assert.*
import org.junit.Test

class LoginViewModelTest {
    private val viewModel = LoginViewModel()

    @Test
    fun loginCorrectCredentials_returnsTrue() {
        assertTrue(viewModel.login("admin", "1234"))
    }

    @Test
    fun loginIncorrectCredentials_returnsFalse() {
        assertFalse(viewModel.login("user", "wrong"))
    }
}