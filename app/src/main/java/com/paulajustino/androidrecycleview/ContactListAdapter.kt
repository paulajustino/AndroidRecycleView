package com.paulajustino.androidrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactListAdapter : RecyclerView.Adapter<ContactListAdapter.ContactListItemViewHolder>() {

    // metodo responsavel por criar a view de um item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.contact_list_item, parent, false
        )
        return ContactListItemViewHolder(view)
    }

    // metodo responsavel por preencher a view de um item com dados
    override fun onBindViewHolder(holder: ContactListItemViewHolder, position: Int) {
        holder.contactName.text = "Nome Default"
        holder.contactPhone.text = "Telefone Default"
    }

    override fun getItemCount(): Int {
        return 1
    }

    class ContactListItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var contactName = view.findViewById<TextView>(R.id.contact_name)
        var contactPhone = view.findViewById<TextView>(R.id.contact_phone)
    }
}