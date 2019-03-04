package com.example.parrot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import okhttp3.OkHttpClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun voiceOver(view: View) {
        val text = findViewById<TextView>(R.id.voiceText).text
        val client = OkHttpClient.Builder().build()
    }
}
