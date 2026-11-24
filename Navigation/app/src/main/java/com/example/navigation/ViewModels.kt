

package com.example.navigation

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {
    private val _products = MutableStateFlow(sampleProducts)
    val products: StateFlow<List<Product>> = _products.asStateFlow()

    override fun onCleared() {
        Log.d("VM", "HomeViewModel destruido")
    }
}

class DetailViewModel(productId: Int) : ViewModel() {
    val product: Product = sampleProducts.first { it.id == productId }

    init {
        Log.d("VM", "DetailViewModel creado para producto $productId")
    }

    override fun onCleared() {
        Log.d("VM", "DetailViewModel destruido para ${product.name}")
    }
}