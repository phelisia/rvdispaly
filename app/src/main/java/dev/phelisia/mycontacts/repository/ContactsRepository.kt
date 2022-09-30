package dev.phelisia.mycontacts.repository

import androidx.lifecycle.LiveData
import dev.phelisia.mycontacts.MyContacts
import dev.phelisia.mycontacts.database.ContactsDb
import dev.phelisia.mycontacts.model.Contact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database=ContactsDb.getDatabase(MyContacts.appContext)

     suspend fun saveContact(contact:Contact){
         withContext(Dispatchers.IO){
             database.contactDao().insertContact(contact)
         }
     }
    fun getContactsById(contactId:Int):LiveData<Contact>{
        return database.contactDao().getContactById(contactId)
    }

    fun getAllContacts():LiveData<List<Contact>>{
        return database.contactDao().getAllContacts()
    }
}