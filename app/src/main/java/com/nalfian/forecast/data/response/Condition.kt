package com.nalfian.forecast.data.response

import com.google.gson.annotations.SerializedName

data class Condition(

    @field:SerializedName("code")
    val code: Int? = null,

    @field:SerializedName("icon")
    val icon: String? = null,

    @field:SerializedName("text")
    val text: String? = null
)