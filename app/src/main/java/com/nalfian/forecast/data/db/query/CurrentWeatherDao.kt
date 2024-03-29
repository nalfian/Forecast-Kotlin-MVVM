package com.nalfian.forecast.data.db.query

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nalfian.forecast.data.db.entity.CURRENT_WEATHER_ID
import com.nalfian.forecast.data.db.entity.CurrentWeather
import com.nalfian.forecast.data.db.unitlocalized.current.ImperialCurrentWeatherEntry
import com.nalfian.forecast.data.db.unitlocalized.current.MetricCurrentWeatherEntry

@Dao
interface CurrentWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weather: CurrentWeather)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>

}