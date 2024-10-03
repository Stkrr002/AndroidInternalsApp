package com.alpharays.androidinternalsapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.alpharays.androidinternalsapp.databinding.ActivityMainBinding
import com.alpharays.androidinternalsapp.mylivedata.MyLiveDataActivity

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)

        _binding?.tvLivedataInternals?.setOnClickListener {
            val intent = Intent(this, MyLiveDataActivity::class.java)
            startActivity(intent)
        }

    }
}