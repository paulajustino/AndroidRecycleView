package com.paulajustino.androidrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.paulajustino.androidrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val contactListItem: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactListView = binding.contactList

        createMockData()

        contactListView.layoutManager = LinearLayoutManager(this)
        contactListView.adapter = ContactListAdapter(contactListItem)
    }

    private fun createMockData() {
        contactListItem.add(ContactInfo(name = "Junior Serra Pereira", phone = "(68) 3745-5227"))
        contactListItem.add(ContactInfo(name = "Augusto Loureiro Assis", phone = "(31) 2051-4148"))
        contactListItem.add(ContactInfo(name = "Helena Barros Ximenes", phone = "(69) 2963-4843"))
        contactListItem.add(ContactInfo(name = "Rita Moraes Rodrigues", phone = "(77) 3422-5460"))
        contactListItem.add(ContactInfo(name = "Nei Montilla Esteves", phone = "(91) 2812-7652"))
        contactListItem.add(ContactInfo(name = "Mariza Kuster Oliveira", phone = "(83) 2252-7852"))
        contactListItem.add(ContactInfo(name = "Juraci Queiroga Lacerda", phone = "(16) 2236-7674"))
        contactListItem.add(ContactInfo(name = "Ana Maria Cavalcante", phone = "(91) 2267-1361"))
        contactListItem.add(ContactInfo(name = "José Mateus da Silva", phone = "(91) 2734-2735"))
        contactListItem.add(ContactInfo(name = "Gilmara Darmont Pedroso", phone = "(79) 3258-1231"))
    }
}