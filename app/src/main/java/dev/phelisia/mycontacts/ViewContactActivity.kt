package dev.phelisia.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.phelisia.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }

    private fun getExtras() {
        val extras=intent.extras
        val image = extras?.getString("IMAGE","")
        Picasso.get().load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_outline_24)
            .resize(350,350)
            .centerCrop()
            .into(binding.iv3)
        val name=extras?.getString("NAME","")
        binding.tvNamee.text = name
        val  phone=extras?.getString("PHONEE","")
        binding.tvphonee.text=phone
        val email=extras?.getString("EMAIL","")
        binding.tvemaill.text=email
        val address=extras?.getString("ADDRESS","")



        Toast.makeText(this,"$name:$email",Toast.LENGTH_LONG).show()
    }


}