package com.nalfian.forecast.data.db.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_WEATHER_ID = 0

@Entity(tableName = "current_weather")
data class CurrentWeather(

    @field:SerializedName("feelslike_c")
    val feelslikeC: Double? = null,

    @field:SerializedName("uv")
    val uv: Double? = null,

    @field:SerializedName("last_updated")
    val lastUpdated: String? = null,

    @field:SerializedName("feelslike_f")
    val feelslikeF: Double? = null,

    @field:SerializedName("wind_degree")
    val windDegree: Int? = null,

    @field:SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int? = null,

    @field:SerializedName("is_day")
    val isDay: Int? = null,

    @field:SerializedName("precip_in")
    val precipIn: Double? = null,

    @field:SerializedName("wind_dir")
    val windDir: String? = null,

    @field:SerializedName("gust_mph")
    val gustMph: Double? = null,

    @field:SerializedName("temp_c")
    val tempC: Double? = null,

    @field:SerializedName("pressure_in")
    val pressureIn: Double? = null,

    @field:SerializedName("gust_kph")
    val gustKph: Double? = null,

    @field:SerializedName("temp_f")
    val tempF: Double? = null,

    @field:SerializedName("precip_mm")
    val precipMm: Double? = null,

    @field:SerializedName("cloud")
    val cloud: Int? = null,

    @field:SerializedName("wind_kph")
    val windKph: Double? = null,

    @Embedded(prefix = "condition_")
    @field:SerializedName("condition")
    val condition: Condition? = null,

    @field:SerializedName("wind_mph")
    val windMph: Double? = null,

    @field:SerializedName("vis_km")
    val visKm: Double? = null,

    @field:SerializedName("humidity")
    val humidity: Int? = null,

    @field:SerializedName("pressure_mb")
    val pressureMb: Double? = null,

    @field:SerializedName("vis_miles")
    val visMiles: Double? = null
){
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}