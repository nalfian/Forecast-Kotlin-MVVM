package com.nalfian.forecast.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nalfian.forecast.data.network.response.CurrentWeatherResponse
import com.nalfian.forecast.internal.NoConnectivityException

class WeatherNetworkDataSourceImpl(
    private val apiXuWeatherApiService: ApiXuWeatherApiService
) : WeatherNetworkDataSource {

    private val _downloadedCurrentWeather = MutableLiveData<CurrentWeatherResponse>()

    override val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
        get() = _downloadedCurrentWeather

    override suspend fun fetchCurrentWeather(location: String, languageCode: String) {
        try {
            val fetchedCurrentWeather = apiXuWeatherApiService
                .getCurrentWeatherAsync(location, languageCode)
                .await()
            _downloadedCurrentWeather.postValue(fetchedCurrentWeather)
        } catch (e: NoConnectivityException){
            Log.e("Connectivity", "No internet connection", e)
        }
    }
}