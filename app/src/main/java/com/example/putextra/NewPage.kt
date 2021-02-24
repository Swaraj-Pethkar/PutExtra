package com.example.putextra

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*
import java.util.Locale.*

class NewPage : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_page)
        var label = findViewById<TextView>(R.id.label)
        var show = intent.getStringExtra("name");
        label.text = """Hello ${show.toString().substring(0, 1).toUpperCase(ROOT)}""" + show.toString().substring(1).toLowerCase(
                ROOT
        );
    }
}