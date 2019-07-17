package com.nalfian.forecast.data.repository

import androidx.lifecycle.LiveData
import com.nalfian.forecast.data.db.unitlocalized.UnitSpesificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpesificCurrentWeatherEntry>
}