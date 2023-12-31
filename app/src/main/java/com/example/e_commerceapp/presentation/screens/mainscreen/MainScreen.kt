package com.example.e_commerceapp.presentation.screens.mainscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.e_commerceapp.domain.model.Product
import com.example.e_commerceapp.presentation.screens.CatalogScreen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigation(backgroundColor = MaterialTheme.colors.background) {
                val selectedItemPosition = remember {
                    mutableStateOf(0)
                }

                val items = listOf(
                    NavigationItem.Catalog,
                    NavigationItem.Favorite,
                    NavigationItem.ShoppingCart,
                    NavigationItem.Profile
                )
                items.forEachIndexed { index, item ->
                    BottomNavigationItem(
                        selected = selectedItemPosition.value == index,
                        onClick = { selectedItemPosition.value = index },
                        icon = {
                            Icon(item.icon, contentDescription = null)
                        },
                        label = {
                            Text(text = stringResource(id = item.titleResId))
                        },
                        selectedContentColor = Color.Black,
                        unselectedContentColor = Color.Gray,
                    )
                }
            }
        }
    )
    {
        CatalogScreen()
    }
}