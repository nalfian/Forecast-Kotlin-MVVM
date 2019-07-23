package com.nalfian.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import com.nalfian.forecast.data.db.entity.FutureWeatherEntry

data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeatherEntry>
)