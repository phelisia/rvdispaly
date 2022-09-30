package dev.phelisia.mycontacts.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.phelisia.mycontacts.model.Contact


@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
fun insertContact(contact:Contact)
@Query("SELECT * FROM contacts")
fun getAllContacts():LiveData<List<Contact>>
@Query("SELECT *FROM Contacts WHERE  contactId=:contactId")
fun getContactById(contactId:Int):LiveData<Contact>
}