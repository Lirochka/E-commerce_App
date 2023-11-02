package com.example.e_commerceapp.domain.model

import com.example.e_commerceapp.R

data class Product(
    val category: String = "men's clothing",
    val description: String = "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
   // val id: Int,
    val image: Int = R.drawable.fake_image,
    val price: Double = 109.95,
    val title: String = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops"
)
