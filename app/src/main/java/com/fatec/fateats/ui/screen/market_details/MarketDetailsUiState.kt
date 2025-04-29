package com.fatec.fateats.ui.screen.market_details

import com.fatec.fateats.data.model.Rule

data class MarketDetailsUiState(
    val rules: List<Rule>? = null,
    val coupon: String? = null,
)
