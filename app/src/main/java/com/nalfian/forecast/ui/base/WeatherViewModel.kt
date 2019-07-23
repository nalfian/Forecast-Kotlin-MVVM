package com.nalfian.forecast.ui.base

import androidx.lifecycle.ViewModel
import com.nalfian.forecast.data.provider.UnitProvider
import com.nalfian.forecast.data.repository.ForecastRepository
import com.nalfian.forecast.internal.UnitSystem
import com.nalfian.forecast.internal.lazyDeferred


abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}