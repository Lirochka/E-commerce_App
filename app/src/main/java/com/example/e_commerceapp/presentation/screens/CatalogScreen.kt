package com.example.e_commerceapp.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.e_commerceapp.domain.model.Product
import com.example.e_commerceapp.presentation.screens.mainscreen.ProductCard

@Composable
fun CatalogScreen() {

    LazyColumn(
        contentPadding = PaddingValues(
            top = 16.dp,
            start = 8.dp,
            end = 8.dp,
            bottom = 72.dp
        ),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(count = 10) {
            ProductCard(
                product = Product()
            )
        }
    }
}