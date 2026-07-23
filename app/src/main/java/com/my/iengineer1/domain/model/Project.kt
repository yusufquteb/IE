package com.my.iengineer1.domain.model

data class Project(
    val id: Long = 0,
    val name: String,
    val description: String = "",
    val category: String = "",
    val client: String = "",
    val engineer: String = "",
    val location: String = "",
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)
