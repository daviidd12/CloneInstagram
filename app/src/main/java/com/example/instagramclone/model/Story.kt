package com.example.instagramclone.model

// Data class que representa una historia (story) del carrusel superior
data class Story(
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val hasSeen: Boolean = false
)
