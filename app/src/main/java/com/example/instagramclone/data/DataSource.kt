package com.example.instagramclone.data

import com.example.instagramclone.model.Post
import com.example.instagramclone.model.Story

// object -> singleton: una única instancia compartida en toda la app
object DataSource {

    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "android_developer",
            profileImageUrl = "https://picsum.photos/seed/ana-lopez/200/200",
            imageUrl = "https://picsum.photos/seed/sunset-beach/800/800",
            likes = 1_284,
            caption = "Explorando Jetpack Compose 🚀 #Android #Kotlin"
        ),
        Post(
            id = 2,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/carlos-dev/200/200",
            imageUrl = "https://picsum.photos/seed/mountain-lake/800/800",
            likes = 847,
            caption = "Data classes son la mejor feature de Kotlin ❤️",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "compose_ui",
            profileImageUrl = "https://picsum.photos/seed/maria-ui/200/200",
            imageUrl = "https://picsum.photos/seed/city-night/800/800",
            likes = 3_456,
            caption = "Material3 + Compose = perfecta combinación 🎨"
        ),
        Post(
            id = 4,
            username = "google_devs",
            profileImageUrl = "https://picsum.photos/seed/juan-kotlin/200/200",
            imageUrl = "https://picsum.photos/seed/forest-path/800/800",
            likes = 12_891,
            caption = "Android 15 trae increíbles mejoras de performance! 📱"
        ),
        Post(
            id = 5,
            username = "mobile_craft",
            profileImageUrl = "https://picsum.photos/seed/sofia-code/200/200",
            imageUrl = "https://picsum.photos/seed/coffee-shop/800/800",
            likes = 629,
            caption = "LazyColumn vs RecyclerView: ¿cuál prefieres? 🤔"
        ),
        Post(
            id = 6,
            username = "ux_android",
            profileImageUrl = "https://picsum.photos/seed/pedro-mobile/200/200",
            imageUrl = "https://picsum.photos/seed/desert-dunes/800/800",
            likes = 2_385,
            caption = "Animaciones fluidas con animateAsState 🎬",
            isLiked = true
        ),
        Post(
            id = 7,
            username = "dev_colombia",
            profileImageUrl = "https://picsum.photos/seed/laura-design/200/200",
            imageUrl = "https://picsum.photos/seed/snowy-peaks/800/800",
            likes = 445,
            caption = "Coil hace super fácil cargar imágenes en Compose 🖼️"
        ),
        Post(
            id = 8,
            username = "jetpack_fan",
            profileImageUrl = "https://picsum.photos/seed/diego-android/200/200",
            imageUrl = "https://picsum.photos/seed/street-food/800/800",
            likes = 980,
            caption = "ViewModels + StateFlow = arquitectura limpia 🧩"
        ),
        Post(
            id = 9,
            username = "kotlin_lover",
            profileImageUrl = "https://picsum.photos/seed/valen-compose/200/200",
            imageUrl = "https://picsum.photos/seed/ocean-waves/800/800",
            likes = 1_523,
            caption = "Sealed classes para manejar estados de UI 🔥"
        ),
        Post(
            id = 10,
            username = "android_studio_tips",
            profileImageUrl = "https://picsum.photos/seed/andres-tech/200/200",
            imageUrl = "https://picsum.photos/seed/autumn-park/800/800",
            likes = 764,
            caption = "Atajos de teclado que todo dev debería conocer ⌨️"
        )
    )

    fun getStories(): List<Story> = listOf(
        Story(1, "Tu historia", "https://picsum.photos/seed/viaje-2026/200/200", hasSeen = false),
        Story(2, "android_dev", "https://picsum.photos/seed/cafe-manana/200/200", hasSeen = false),
        Story(3, "kotlin_fan", "https://picsum.photos/seed/musica-live/200/200", hasSeen = false),
        Story(4, "google_io", "https://picsum.photos/seed/gym-day/200/200", hasSeen = true),
        Story(5, "compose_dev", "https://picsum.photos/seed/foodie/200/200", hasSeen = false),
        Story(6, "material_you", "https://picsum.photos/seed/arte-urbano/200/200", hasSeen = true),
        Story(7, "kotlin_conf", "https://picsum.photos/seed/naturaleza/200/200", hasSeen = false)
    )
}
