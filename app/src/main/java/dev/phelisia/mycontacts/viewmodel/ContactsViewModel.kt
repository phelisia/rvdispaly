package dev.phelisia.mycontacts.viewmodel

import androidx.lifecycle.ComputableLiveData
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.phelisia.mycontacts.model.Contact
import dev.phelisia.mycontacts.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel:ViewModel (){
    val contactsRepository=ContactsRepository()
    lateinit var contactsLiveData:LiveData<Contact>
    lateinit var contactLiveData: LiveData<List<Contact>>

    fun saveContact(contact:Contact){
        viewModelScope.launch{
            contactsRepository.saveContact(contact)
        }
    }
    fun fetchcontactbyid(contactId:Int){
        contactsLiveData=contactsRepository.getContactsById(contactId)
    }
    fun getAllContacts(){
        contactLiveData=contactsRepository.getAllContacts()
    }

}