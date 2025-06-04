package com.example.first_aid_guide_for_tram_drivers.models

data class Section(
    val id: Int,
    val title: Int,
    val description: String?,
    val imageResId: Int?
) {
    val iconResId: Int = 0
}