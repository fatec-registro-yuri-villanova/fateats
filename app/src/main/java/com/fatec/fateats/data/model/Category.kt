package com.fatec.fateats.data.model

import androidx.annotation.DrawableRes
import com.fatec.fateats.ui.components.category.CategoryFilterChipView

data class Category(
    val id: String,
    val name: String
) {
    @get:DrawableRes
    val icon: Int?
        get() = CategoryFilterChipView.fromDescription(description = name)?.icon
}
