package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var loginUnderline: View
    private lateinit var signUpUnderline: View
    private lateinit var loginViews: List<View>
    private lateinit var signUpViews: List<View>
    private lateinit var buttonLogin: Button
    private lateinit var signUpTextView: TextView
    private var isSignUpMode = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginUnderline = findViewById(R.id.loginUnderline)
        signUpUnderline = findViewById(R.id.signUpUnderline)
        buttonLogin = findViewById(R.id.buttonLogin)
        signUpTextView = findViewById(R.id.signUpTextView)

        // Initialize login and sign-up views
        loginViews = listOf(
            findViewById(R.id.LoginEmaillbl),
            findViewById(R.id.LoginPasswordlbl),
            findViewById(R.id.LoginEmailtxt),
            findViewById(R.id.LoginPasswordtxt)
        )

        signUpViews = listOf(
            findViewById(R.id.SignUpEmaillbl),
            findViewById(R.id.SignUpPasswordlbl),
            findViewById(R.id.SignUpEmailtxt),
            findViewById(R.id.SignUpPasswordtxt),
            findViewById(R.id.SignUpConfirmlbl),
            findViewById(R.id.SignUpconfirmtxt)
        )

        signUpTextView.setOnClickListener {
            isSignUpMode = !isSignUpMode

            // Toggle visibility of login and sign-up views
            if (isSignUpMode) {
                showViews(signUpViews)
                hideViews(loginViews)
                buttonLogin.text = "Sign-Up"
            } else {
                showViews(loginViews)
                hideViews(signUpViews)
                buttonLogin.text = "LogIn"
            }

            // Toggle underlines based on mode
            loginUnderline.visibility = if (!isSignUpMode) View.VISIBLE else View.GONE
            signUpUnderline.visibility = if (isSignUpMode) View.VISIBLE else View.GONE
        }
    }

    fun onLoginClick(view: View) {
        loginUnderline.visibility = View.VISIBLE
        signUpUnderline.visibility = View.GONE
        isSignUpMode = false
        showViews(loginViews)
        hideViews(signUpViews)
        buttonLogin.text = "LogIn"
    }

    fun onSignUpClick(view: View) {
        signUpUnderline.visibility = View.VISIBLE
        loginUnderline.visibility = View.GONE
        isSignUpMode = true
        showViews(signUpViews)
        hideViews(loginViews)
        buttonLogin.text = "Sign-Up"
    }

    private fun showViews(views: List<View>) {
        for (view in views) {
            view.visibility = View.VISIBLE
        }
    }

    private fun hideViews(views: List<View>) {
        for (view in views) {
            view.visibility = View.GONE
        }
    }
}
