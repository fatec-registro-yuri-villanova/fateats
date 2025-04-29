package com.fatec.fateats.ui.screen.home

import com.fatec.fateats.data.model.Category
import com.fatec.fateats.data.model.Market
import com.google.android.gms.maps.model.LatLng

data class HomeUiState(
    val categories: List<Category>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)
