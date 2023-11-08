package com.example.recyclerviewgmailapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>()
        repeat(16) {
            val index = it + 1;
            items.add(
                ItemModel("Tuan Ngo - 20200559", "Help make Campaign Monitor better Let us know your thought! No images..",
                    "09:47 PM")
            )
        }

            val adapter = ItemAdapter(items)

            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter
    }
}