package com.example.a30daysofdailyquotes.model

data class Quote(
    val id: Int, // 👈 accepts number
    val text: String,
    val author: String,
    val imageUrl: String = "https://picsum.photos/seed/${(1..10000).random()}/500/300"
)



