package com.inventorio.models

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val id: Int,
    val name: String,
    val amount: Int,
)
