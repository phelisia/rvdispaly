package dev.phelisia.mycontacts.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import dev.phelisia.mycontacts.model.Contact
import dev.phelisia.mycontacts.databinding.ActivityMainBinding
import dev.phelisia.mycontacts.viewmodel.ContactsViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val contactsViewModel:ContactsViewModel by viewModels ()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=    ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        contactsViewModel.getAllContacts()

//
    }

    override fun onResume() {
        super.onResume()
        binding.fabaction.setOnClickListener {
            startActivity(Intent(this,AddContactActivity::class.java))
        }

        contactsViewModel.contactLiveData.observe(this, Observer { allContact->
            displayContacts(allContact)
        })
    }

fun displayContacts(contact: List<Contact>){
    var contactsAdapter=ContactsAdapter(contact)
    binding.rvcontacts.layoutManager=LinearLayoutManager(this)
    binding.rvcontacts.adapter=contactsAdapter
}
}