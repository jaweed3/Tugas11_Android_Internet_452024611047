package com.example.internetapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.internetapp.databinding.ActivityMainBinding
import com.example.internetapp.ui.MainViewModel
import com.example.internetapp.ui.ProductAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        adapter = ProductAdapter()

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = this@MainActivity.adapter
        }

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.products.observe(this) { products ->
            adapter.submitList(products)
        }
    }
}
