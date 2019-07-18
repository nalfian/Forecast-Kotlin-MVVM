package com.nalfian.forecast.data.provider

import com.nalfian.forecast.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}