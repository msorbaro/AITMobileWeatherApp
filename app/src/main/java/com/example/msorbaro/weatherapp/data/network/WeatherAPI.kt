package com.example.msorbaro.weatherapp.data.network

import com.example.msorbaro.weatherapp.data.WeatherResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


// URL: http://api.openweathermap.org/data/2.5/weather?units=metric&appid=f3d694bc3e1d44c1ed5a97bd1120e8fe&q=Budapest
// HOST: https://http://api.openweathermap.org
//
// PATH: /data/2.5/weather?appid=f3d694bc3e1d44c1ed5a97bd1120e8fe
//
// QUERY param separator: &
// QUERY params: q

interface WeatherAPI {
    @GET("/data/2.5/weather?appid=f3d694bc3e1d44c1ed5a97bd1120e8fe")
    fun getRates(@Query("q") q: String) : Call<WeatherResult>
}

