package com.example.productsadder

data class Product(
    val id: String,
    val name: String,
    val category: String,
    val price: Float,
    val reference: String? = null,
    val description: String? = null,
    val units: List<String>? = null,
    val images: List<String>
)