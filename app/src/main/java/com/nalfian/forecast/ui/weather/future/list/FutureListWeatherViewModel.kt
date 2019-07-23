package com.nalfian.forecast.ui.weather.future.list

import com.nalfian.forecast.data.provider.UnitProvider
import com.nalfian.forecast.data.repository.ForecastRepository
import com.nalfian.forecast.internal.lazyDeferred
import com.nalfian.forecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {
    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
