package com.example.kelineyt.data

sealed class Category(val category: String) {

    object Medicine: Category("Medicine")
    object Devices: Category("Devices")
    object Nutrition: Category("Nutrition")
    object Care: Category("Care")
    object Other: Category("Others")
}