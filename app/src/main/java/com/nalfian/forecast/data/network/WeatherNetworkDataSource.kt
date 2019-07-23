package com.nalfian.forecast.data.network

import androidx.lifecycle.LiveData
import com.nalfian.forecast.data.network.response.CurrentWeatherResponse
import com.nalfian.forecast.data.network.response.FutureWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )

    suspend fun fetchFutureWeather(
        location: String,
        languageCode: String
    )
}