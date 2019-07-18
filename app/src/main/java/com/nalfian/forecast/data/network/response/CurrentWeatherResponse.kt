package com.nalfian.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import com.nalfian.forecast.data.db.entity.CurrentWeather
import com.nalfian.forecast.data.db.entity.Location

data class CurrentWeatherResponse(

    @field:SerializedName("current")
    val currentWeather: CurrentWeather? = null,

    @field:SerializedName("location")
    val location: Location? = null
)