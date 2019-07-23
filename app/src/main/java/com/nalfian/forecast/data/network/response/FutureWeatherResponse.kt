package com.nalfian.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import com.nalfian.forecast.data.db.entity.WeatherLocation
import com.nalfian.forecast.data.network.response.ForecastDaysContainer

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    @field:SerializedName("location")
    val location: WeatherLocation
)