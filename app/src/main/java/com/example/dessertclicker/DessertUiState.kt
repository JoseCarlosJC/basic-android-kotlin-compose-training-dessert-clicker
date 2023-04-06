package com.example.dessertclicker

data class dessertUiState(
    val precioTotal: Float = 0.0f,
    val postresVendidos: Int = 0,
    val indPostreActual: Int = 0,
    val precioPostreActual: Float = 0.0f,
    val idImagenPostreActual: Int = R.drawable.bakery_back
)
