package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private lateinit var buttonHotspots: Button
private lateinit var buttonAddSightings: Button
private lateinit var buttonAccount: Button
private lateinit var buttonQuiz: Button
private lateinit var buttonLogout: Button

class HomePageActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        //getting button views
        buttonHotspots = findViewById(R.id.btnHotspots)
        buttonAddSightings = findViewById(R.id.btnSighting)
        buttonAccount = findViewById(R.id.btnAccount)
        buttonQuiz = findViewById(R.id.btnPlayGame)
        buttonLogout = findViewById(R.id.btnLogout)
        //Navigation


        }
}