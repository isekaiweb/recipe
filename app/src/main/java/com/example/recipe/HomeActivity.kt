package com.example.recipe

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cioccarellia.ksprefs.KsPrefs
import com.example.recipe.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    companion object {
        lateinit var appContext: Context
        val prefs by lazy { KsPrefs(appContext) }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appContext = this
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}