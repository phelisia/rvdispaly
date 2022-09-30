package dev.phelisia.mycontacts.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import dev.phelisia.mycontacts.databinding.ActivityAddContactBinding
import dev.phelisia.mycontacts.model.Contact
import dev.phelisia.mycontacts.viewmodel.ContactsViewModel

class AddContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    val contactsViewmodel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.button.setOnClickListener { validateAddcontact() }
    }
    fun validateAddcontact(){
        var name=binding.etName.text.toString()
        var email=binding.etEmail.text.toString()
        var address=binding.etAddress.text.toString()
        var phone=binding.etphone.text.toString()
        var error=false


        if (name.isBlank()){
            binding.etName.error="name required"
            error=true
        }
        if (email.isBlank()){
            binding.etEmail.error="emailrequired"
            error=true
        }
        if (phone.isBlank()){
            binding.etphone.error="phone required"
            error=true
        }
        if (address.isBlank()){
            binding.etAddress.error="address required"
            error=true
        }

        if(!error){
            startActivity(Intent(this,MainActivity::class.java))
        }


        val contact=Contact(contactId = 0,name=name, PhoneNumber =phone,email=email,address=address,
        image = "")
        contactsViewmodel.saveContact(contact)
    }
}