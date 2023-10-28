package com.example.e_commerceapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.e_commerceapp.ui.theme.EcommerceAppTheme
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcommerceAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://fakestoreapi.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                val productSService = retrofit.create(ProductsService::class.java)

                lifecycleScope.launchWhenCreated {
                    val response = productSService.getAllProducts()
                    Log.d("DATA", response.body()!!.toString())
                }
            }
        }
    }
    interface ProductsService{
        @GET("products")
        suspend fun getAllProducts(): Response<List<Any>>
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EcommerceAppTheme {
        Greeting("Android")
    }
}