package dev.phelisia.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.phelisia.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=    ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        displaycontact()
    }

    private fun displaycontact() {
        var contact1=Contact("SK","0718117097","saramutho@gmail.com","616 Korongo ,Road","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact2=Contact("LJ","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","=MnwxMjA3fDB8MHxzZWFyY2h8MTN8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact3=Contact("KJ","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","https://media.istockphoto.com/photos/young-black-ethnicity-female-businesswoman-at-business-reopening-picture-id1309721758?b=1&k=20&m=1309721758&s=170667a&w=0&h=I2_qg1pV1e8xtR3OBxbwIg16sGbfEauKCn8jUcbQlag=")
        var contact4=Contact("HK","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","https://media.istockphoto.com/photos/shot-of-a-confident-young-businessman-looking-thoughtfully-out-of-a-picture-id1347777964?b=1&k=20&m=1347777964&s=170667a&w=0&h=JFxwpbb64jAEMGp_lJEkIXgwudjPeyJCF4MxD0hd4ms=")
        var contact5=Contact("PJ","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","https://images.unsplash.com/photo-1495603889488-42d1d66e5523?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact6=Contact("Abby","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","https://media.istockphoto.com/photos/black-businessman-using-smartphone-and-credit-card-sitting-in-office-picture-id1307927923?k=20&m=1307927923&s=612x612&w=0&h=GRiIo-2ddekDBOoZ56O9dImA7sJMjvmLX8obem7ZaeI=")
        var contact7=Contact("Abby","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","https://images.unsplash.com/photo-1529245019870-59b249281fd3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact8=Contact("Abby","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","https://images.unsplash.com/photo-1539701938214-0d9736e1c16b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact9=Contact("Abby","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","https://media.istockphoto.com/photos/portrait-smiling-african-american-businessman-in-blue-suit-sit-at-picture-id1341347262?b=1&k=20&m=1341347262&s=170667a&w=0&h=nWVSejAWgPgQi128JMemYKX0YX9xUgf18Nd3o4Ez6ic=")
        var contact10=Contact("Abby","0718117097","phelisiajeruto@gmail.com","616 Korongo ,Road","https://media.istockphoto.com/photos/portrait-of-a-happy-senior-couple-sitting-together-outdoors-picture-id1324925755?b=1&k=20&m=1324925755&s=170667a&w=0&h=H840IrlGJfupJH86c_VWu9wG5XxMl2ie1URWjB6Bmfc=")
        var allcontact= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        var contactsadapter=ContactsAdapter(allcontact)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        binding.rvcontacts.adapter=contactsadapter
    }
}