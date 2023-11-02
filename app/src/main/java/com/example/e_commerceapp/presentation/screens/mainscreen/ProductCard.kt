package com.example.e_commerceapp.presentation.screens.mainscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerceapp.domain.model.Product
import com.example.e_commerceapp.ui.theme.backgroundColor
import com.example.e_commerceapp.ui.theme.text
import com.example.e_commerceapp.ui.theme.textName

@Composable
fun ProductCard(
    modifier: Modifier = Modifier,
    product: Product,
   // onFavoriteClickListener: () -> Unit,
   // onShoppingCartClickListener: () -> Unit
) {
    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Row {
                Box {
                    Image(
                        modifier = Modifier
                            .size(150.dp)
                            .clip(RoundedCornerShape(15.dp)),
                        painter = painterResource(id = product.image),
                        contentDescription = null
                    )

                    FloatingActionButton(
                        onClick = { },
                        modifier = Modifier
                            .size(50.dp)
                            .padding(8.dp)
                            .align(Alignment.TopEnd),
                        backgroundColor = MaterialTheme.colors.backgroundColor,
                        contentColor = Color.White
                    ) {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = null,
                        )
                    }
                }
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = product.title,
                        color = MaterialTheme.colors.textName,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = product.category,
                        color = MaterialTheme.colors.text,
                        fontSize = 16.sp,
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "$${product.price}",
                            color = MaterialTheme.colors.text,
                            fontSize = 16.sp,
                        )

                        Button(
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = MaterialTheme.colors.backgroundColor,
                                contentColor = Color.White
                            ),
                            shape = RoundedCornerShape(15.dp),
                            onClick = {  }) {
                            Icon(
                                Icons.Filled.ShoppingCart,
                                contentDescription = null,
                            )
                        }
                    }
                }
            }
            Text(
                text = product.description
            )
        }
    }
}
