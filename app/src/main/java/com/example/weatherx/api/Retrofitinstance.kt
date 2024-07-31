package com.example.weatherx.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofitinstance {


    private val baseUrl = "https://api.weatherapi.com";

    private fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    val weatherApi :  WeatherApi= getInstance().create(WeatherApi::class.java)
}