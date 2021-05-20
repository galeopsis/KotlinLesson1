package com.galeopsis.kotlinlesson1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.textView)
        textview.setOnClickListener(clickListener)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(clickListener)
    }

    val clickListener = View.OnClickListener { view ->

        when (view.id) {
            R.id.textView -> Toast.makeText(this, "textView", Toast.LENGTH_SHORT).show()
            R.id.button -> Toast.makeText(this, "Button", Toast.LENGTH_SHORT).show()
        }
    }

}