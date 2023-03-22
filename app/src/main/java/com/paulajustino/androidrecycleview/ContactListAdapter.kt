package com.paulajustino.androidrecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paulajustino.androidrecycleview.databinding.ContactListItemBinding

class ContactListAdapter : RecyclerView.Adapter<ContactListAdapter.ContactListItemViewHolder>() {

    // metodo responsavel por criar a view de um item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactListItemViewHolder {
        val view = ContactListItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
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

    class ContactListItemViewHolder(binding: ContactListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var contactName = binding.contactName
        var contactPhone = binding.contactPhone
    }
}