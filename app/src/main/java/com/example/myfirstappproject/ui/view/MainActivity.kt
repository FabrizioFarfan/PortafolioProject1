package com.example.myfirstappproject.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myfirstappproject.databinding.ActivityMainBinding
import com.example.myfirstappproject.ui.viewmodel.ActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val activityViewModel : ActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        activityViewModel.activityModel.observe(this){

                binding.activityTV.text = it?.activity


                binding.typeTV.text = it?.type

        }
        binding.container.setOnClickListener {
            activityViewModel.randomActivity()
        }
    }
}