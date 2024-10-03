package com.alpharays.androidinternalsapp.mylivedata

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.alpharays.androidinternalsapp.R
import com.alpharays.androidinternalsapp.databinding.ActivityMainBinding
import com.alpharays.androidinternalsapp.databinding.ActivityMyLiveDataBinding

class MyLiveDataActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MyLiveDataViewmodel
    private var _binding: ActivityMyLiveDataBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMyLiveDataBinding.inflate(layoutInflater)
        setContentView(_binding?.root)


        mainViewModel = ViewModelProvider(this)[MyLiveDataViewmodel::class.java]

        mainViewModel.myDataProvider.addObserver(this) {
            it?.run {
                _binding?.myOwnLiveDataTextView?.text = this.toString()
            }
        }

        mainViewModel.runCounter()
    }

}