package com.example.recipe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.recipe.databinding.SplashScreenBinding



class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: SplashScreenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            Intent(this@SplashScreenActivity, HomeActivity::class.java).also {
                startActivity(it)
                finish()
            }
        },1000)

    }



}