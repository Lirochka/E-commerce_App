package com.example.e_commerceapp.presentation.screens.mainscreen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.e_commerceapp.R

sealed class NavigationItem(
    val titleResId: Int,
    val icon: ImageVector
) {
    object Catalog: NavigationItem(
        titleResId = R.string.navigation_item_catalog,
        icon = Icons.Default.Search
    )

    object Favorite: NavigationItem(
        titleResId = R.string.navigation_item_favorite,
        icon = Icons.Default.Favorite
    )

    object ShoppingCart: NavigationItem(
        titleResId = R.string.navigation_item_shoppingCart,
        icon = Icons.Default.ShoppingCart
    )

    object Profile: NavigationItem(
        titleResId = R.string.navigation_item_profile,
        icon = Icons.Outlined.Person
    )
}