package com.example.e_commerceapp.data.mapper

import com.example.e_commerceapp.data.model.NetworkProduct
import com.example.e_commerceapp.domain.model.Product
import javax.inject.Inject

class ProductMapper @Inject constructor() {

    fun buildFrom(networkProduct: NetworkProduct): Product{
        return Product(
            category = networkProduct.category,
            description = networkProduct.description,
           // id = networkProduct.id,
            image = networkProduct.image.toInt(),
            price = networkProduct.price,
            title = networkProduct.title,
        )
    }
}