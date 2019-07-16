package com.nalfian.forecast.data.response

import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(

    @field:SerializedName("current")
    val current: Current? = null,

    @field:SerializedName("location")
    val location: Location? = null
)