package com.galeopsis.kotlinlesson1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

data class TestDataClass(val title: String, val data: String)

val data = TestDataClass("Дата класс", "Some data is stored in this variable")

val dataCopy = data.copy(data = "6,7,8,9,10")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.textView)
        textview.setOnClickListener(clickListener)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(clickListener)

        val dataButton = findViewById<Button>(R.id.dataClass)
        dataButton.setOnClickListener(clickListener)

        val objButton = findViewById<Button>(R.id.button2)
        objButton.setOnClickListener(clickListener)

        val cycleOne = findViewById<Button>(R.id.button3)
        cycleOne.setOnClickListener(clickListener)

        val cycleTwo = findViewById<Button>(R.id.button4)
        cycleTwo.setOnClickListener(clickListener)

    }

    val clickListener = View.OnClickListener { view ->

        when (view.id) {
            R.id.textView -> Toast.makeText(this, "textView", Toast.LENGTH_SHORT).show()
            R.id.button -> Toast.makeText(this, "Button", Toast.LENGTH_SHORT).show()
            R.id.dataClass -> Toast.makeText(this, "Данные класса: $data", Toast.LENGTH_SHORT)
                .show()
            R.id.button2 -> Toast.makeText(this, "Копия объекта: $dataCopy", Toast.LENGTH_SHORT)
                .show()
            R.id.button3 -> testCycleOne()
            R.id.button4 -> testCycleTwo()
        }
    }

    fun testCycleOne() {

        for (i in 1..10) {
            Log.i("numbers", i.toString())
        }
    }

    fun testCycleTwo() {
        for (i in 10 downTo 1 step 2) {

            Log.i("numbers", i.toString())
        }
    }
}