package com.example.acbcb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.acbcb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
private var a = ""
    private var b = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}