package com.example.instagramclone.model

// Data class que representa una publicación del feed
data class Post(
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val imageUrl: String,
    val likes: Int,
    val caption: String,
    val isLiked: Boolean = false
)
