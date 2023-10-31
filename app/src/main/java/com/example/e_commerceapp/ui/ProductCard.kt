package com.example.e_commerceapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.Colors
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commerceapp.R
import com.example.e_commerceapp.ui.theme.backgroundColor
import com.example.e_commerceapp.ui.theme.text
import com.example.e_commerceapp.ui.theme.textName

@Preview
@Composable
fun ProductCard() {
    Card(modifier = Modifier.padding(8.dp)) {
        Row(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Box {
                Image(
                    modifier = Modifier
                        .size(150.dp)
                        .clip(RoundedCornerShape(15.dp)),
                    painter = painterResource(id = R.drawable.fake_image),
                    contentDescription = null
                )

                FloatingActionButton(
                    onClick = { /*TODO*/ },
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
                    text = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
                    color = MaterialTheme.colors.textName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "men's clothing",
                    color = MaterialTheme.colors.text,
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.height(55.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "$109.95",
                        color = MaterialTheme.colors.text,
                        fontSize = 16.sp,
                    )

                    Button(
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = MaterialTheme.colors.backgroundColor,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(15.dp),
                        onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.ShoppingCart,
                            contentDescription = null,
                        )

                    }
                }
            }
        }
    }
}
