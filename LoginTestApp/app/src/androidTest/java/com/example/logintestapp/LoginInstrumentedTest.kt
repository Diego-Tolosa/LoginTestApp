package com.example.logintestapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginInstrumentedTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun loginSuccess_showsSuccessMessage() {
        onView(withId(R.id.username)).perform(typeText("admin"), closeSoftKeyboard())
        onView(withId(R.id.password)).perform(typeText("1234"), closeSoftKeyboard())
        onView(withId(R.id.login_button)).perform(click())
        onView(withId(R.id.login_status)).check(matches(withText("Login exitoso")))
    }

    @Test
    fun loginFailure_showsErrorMessage() {
        onView(withId(R.id.username)).perform(typeText("juan"), closeSoftKeyboard())
        onView(withId(R.id.password)).perform(typeText("5678"), closeSoftKeyboard())
        onView(withId(R.id.login_button)).perform(click())
        onView(withId(R.id.login_status)).check(matches(withText("Credenciales inválidas")))
    }
}