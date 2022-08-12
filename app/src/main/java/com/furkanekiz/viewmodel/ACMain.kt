package com.furkanekiz.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.furkanekiz.viewmodel.databinding.AcMainBinding

class ACMain : AppCompatActivity() {

    private lateinit var binding: AcMainBinding
    private lateinit var viewModel: ACMainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.ac_main)
        viewModel = ViewModelProvider(this)[ACMainViewModel::class.java]

        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
            binding.countText.text = viewModel.getUpdatedCount().toString()
        }
    }
}