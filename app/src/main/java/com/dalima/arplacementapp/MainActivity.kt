package com.dalima.arplacementapp

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    private val drills = listOf("Drill 1", "Drill 2", "Drill 3")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val description = findViewById<TextView>(R.id.description)
        val tips = findViewById<TextView>(R.id.tips)
        val btnStart = findViewById<Button>(R.id.btnStartAR)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, drills)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: android.view.View, pos: Int, id: Long) {
                description.text = "Description for ${drills[pos]}"
                tips.text = "Tips for ${drills[pos]}"
                imageView.setImageResource(R.drawable.ic_launcher_background) // Dummy image
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }

        btnStart.setOnClickListener {
            val intent = Intent(this, ARActivity::class.java)
            startActivity(intent)
        }
    }
}