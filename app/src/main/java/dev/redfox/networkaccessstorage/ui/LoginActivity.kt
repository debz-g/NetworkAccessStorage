package dev.redfox.networkaccessstorage.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.redfox.networkaccessstorage.R
import android.content.Intent
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import dev.redfox.networkaccessstorage.MainActivity
import dev.redfox.networkaccessstorage.databinding.ActivityLoginBinding
import dev.redfox.networkaccessstorage.viewmodels.NasViewModel
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {


    lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.setStatusBarColor(ContextCompat.getColor(baseContext, R.color.material_green))
        val nasViewModel: NasViewModel by viewModels()

        binding.btnSignIn.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val pass = binding.etPassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {
                nasViewModel.login(email,pass)
                nasViewModel.loginResponse.observe(this@LoginActivity, Observer {
                    if (it.body()!![0].verified == true){
                        startActivity(Intent(this@LoginActivity,MainActivity::class.java))
                    } else {
                        Toast.makeText(this@LoginActivity, "Wrong Credentials", Toast.LENGTH_SHORT).show()
                    }
                })
            } else {
                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT)
                    .show()

            }
        }
    }
}
