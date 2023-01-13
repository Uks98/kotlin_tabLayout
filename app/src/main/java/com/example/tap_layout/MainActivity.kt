package com.example.tap_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.tap_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val fragment = listOf(FragmentA(),FragmentB(),FragmentC(),FragmentD())

        val adapter = FragmentAdapter(this)
        adapter.fragmentList = fragment
        binding.viewPager.adapter = adapter
    }
}