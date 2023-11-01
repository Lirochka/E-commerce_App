package com.example.e_commerceapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.example.e_commerceapp.data.network.ProductsService
import com.example.e_commerceapp.presentation.screens.mainscreen.ProductCard
import com.example.e_commerceapp.presentation.screens.mainscreen.MainScreen
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var productSService: ProductsService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                ProductCard()
                MainScreen()
            }

            lifecycleScope.launchWhenCreated {
                val response = productSService.getAllProducts()
                Log.d("DATA", response.body()!!.toString())
            }
        }
    }
}

