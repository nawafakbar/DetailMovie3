package com.nawaf.latihan_list_view

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailCustomImage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_custom_image)

        val ImagesResId = intent.getIntExtra("data", 0)
        val title = intent.getStringExtra("data1")
        val locaki = intent.getStringExtra("data3")
        val dec = intent.getStringExtra("data4")

        val imageView = findViewById<ImageView>(R.id.a2)
        val a = findViewById<TextView>(R.id.a1)
        val b = findViewById<TextView>(R.id.a3)
        val c = findViewById<TextView>(R.id.a4)

        imageView.setImageResource(ImagesResId)
        a.setText(title)
        b.setText(locaki)
        c.setText(dec)
    }
}