package com.nalfian.forecast.data.provider

import com.nalfian.forecast.data.db.entity.WeatherLocation

class LocationProviderImpl : LocationProvider {
    override suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean {
        return true
    }

    override suspend fun getPreferredLocation(): String {
        return "Los Angeles"
    }
}