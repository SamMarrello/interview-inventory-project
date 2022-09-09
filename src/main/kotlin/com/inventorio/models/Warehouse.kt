package com.inventorio.models

import kotlinx.serialization.Serializable

@Serializable
data class Warehouse(
    val id: Int,
    val name: String,
    val city: String,
    val address: String,
    val phoneNumber: String,
)
