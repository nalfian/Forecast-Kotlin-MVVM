package com.nalfian.forecast.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.nalfian.forecast.data.db.entity.CurrentWeather
import com.nalfian.forecast.data.db.entity.FutureWeatherEntry
import com.nalfian.forecast.data.db.entity.WeatherLocation
import com.nalfian.forecast.data.db.query.CurrentWeatherDao
import com.nalfian.forecast.data.db.query.FutureWeatherDao
import com.nalfian.forecast.data.db.query.WeatherLocationDao
import com.nalfian.forecast.helper.LocalDateConverter


@Database(
    entities = [CurrentWeather::class, WeatherLocation::class, FutureWeatherEntry::class],
    version = 1
)
@TypeConverters(LocalDateConverter::class)
abstract class ForecastDatabase : RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun weatherLocationDao(): WeatherLocationDao
    abstract fun futureWeatherDao(): FutureWeatherDao

    companion object {
        @Volatile
        private var instace: ForecastDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instace ?: synchronized(LOCK) {
            instace ?: buildDatabase(context).also { instace = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ForecastDatabase::class.java, "forecast.db"
            )
                .build()
    }
}