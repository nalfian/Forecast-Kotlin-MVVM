package com.nalfian.forecast.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.nalfian.forecast.data.repository.ForecastRepository
import com.nalfian.forecast.internal.UnitSystem
import com.nalfian.forecast.internal.lazyDeferred

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC
    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
