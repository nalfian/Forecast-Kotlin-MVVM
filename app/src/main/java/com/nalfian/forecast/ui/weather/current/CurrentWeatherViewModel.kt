package com.nalfian.forecast.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.nalfian.forecast.data.provider.UnitProvider
import com.nalfian.forecast.data.repository.ForecastRepository
import com.nalfian.forecast.internal.UnitSystem
import com.nalfian.forecast.internal.lazyDeferred
import com.nalfian.forecast.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
