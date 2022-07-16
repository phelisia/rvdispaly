package dev.phelisia.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.phelisia.mycontacts.databinding.ContactListItemBinding

class ContactsAdapter(var contactList: List<Contact>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactsViewHolder=ContactsViewHolder(binding)
        return contactsViewHolder
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.binding.tvName.text=currentContact.name
        holder.binding.tvPhone.text=currentContact.PhoneNumber
        holder.binding.tvemail.text=currentContact.email
        holder.binding.tvAddress.text=currentContact.address

        Picasso.get().load(currentContact.image).placeholder(R.drawable.ic_baseline_person_24).error(R.drawable.ic_baseline_error_outline_24).resize(350,350).centerCrop().into(holder.binding.ivContact)

    }

    override fun getItemCount(): Int {
        return  contactList.size
    }
}
class ContactsViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root){


}