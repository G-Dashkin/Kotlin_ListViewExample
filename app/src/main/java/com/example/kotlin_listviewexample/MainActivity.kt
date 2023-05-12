package com.example.kotlin_listviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val dayOfWeeks = listOf(
        "Понедельник",
        "Вторник",
        "Среда",
        "Четверг",
        "Пятница",
        "Суббота",
        "Воскресенье",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listViewMain = findViewById<ListView>(R.id.listView)
        val txt = findViewById<TextView>(R.id.txt)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            dayOfWeeks)
        listViewMain.adapter = adapter

        listViewMain.setOnItemClickListener { parent, view, position, id ->
            txt.text = dayOfWeeks[position]
        }
    }
}