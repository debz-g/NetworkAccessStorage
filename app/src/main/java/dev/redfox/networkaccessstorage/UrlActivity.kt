package dev.redfox.networkaccessstorage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors
import dev.redfox.networkaccessstorage.databinding.ActivityUrlBinding
import dev.redfox.networkaccessstorage.di.AppModule

@AndroidEntryPoint
class UrlActivity : AppCompatActivity() {


    private lateinit var binding: ActivityUrlBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_url)
        binding = ActivityUrlBinding.inflate(layoutInflater)



        binding.buttonConnect.setOnClickListener {
            var etUrl = binding.etUrl.text.toString()
            var baseUrl = "https://"+etUrl+".loca.lt"

            // Set the base URL in the AppModule
            AppModule.setBaseUrl(baseUrl)

            val intent = Intent(this@UrlActivity, MainActivity::class.java)
            intent.putExtra("key", etUrl)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
}