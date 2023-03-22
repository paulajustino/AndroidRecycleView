package com.paulajustino.androidrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactListView = findViewById<RecyclerView>(R.id.contact_list)
        contactListView.layoutManager = LinearLayoutManager(this)
        contactListView.adapter = ContactListAdapter()
    }
}