package com.example.halamannamanim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nimTextView: TextView = findViewById(R.id.nimTextView)
        val namaTextView: TextView = findViewById(R.id.namaTextView)

        val nim = "225150600111019"
        val nama = "Nala Adani Putri"

        nimTextView.text = "NIM: $nim"
        namaTextView.text = "Nama: $nama"
    }
}