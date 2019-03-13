package com.example.msorbaro.weatherapp.data



data class WeatherResult(val coords: Coord?, val weather: Weather?, val base: String?, val main: MainWeather)

//data class Rates(val BGN: Number?, val CAD: Number?, val BRL: Number?, val HUF: Number?, val DKK: Number?, val JPY: Number?, val ILS: Number?, val TRY: Number?, val RON: Number?, val GBP: Number?, val PHP: Number?, val HRK: Number?, val NOK: Number?, val ZAR: Number?, val MXN: Number?, val AUD: Number?, val USD: Number?, val KRW: Number?, val HKD: Number?, val EUR: Number?, val ISK: Number?, val CZK: Number?, val THB: Number?, val MYR: Number?, val NZD: Number?, val PLN: Number?, val CHF: Number?, val SEK: Number?, val CNY: Number?, val SGD: Number?, val INR: Number?, val IDR: Number?, val RUB: Number?)

data class Coord(val lon: Number?, val lat: Number?)

data class Weather(val id: Number?, val main: String?, val description: String?, val icon: String?)

data class MainWeather(val temp: Number?, val pressure: Number?, val humidity: Number?, val temp_min: Number?, val temp_max: Number?, val visibility: Number?, val wind: Wind?, val clouds: Clouds?, val dt: Number?, val sys: Sys?, val id: Number?, val name: String?, val cod: Number?)

data class Wind(val speed: Number?, val deg: Number?)

data class Clouds(val all: Number?)

data class Sys(val type: Number?, val id: Number?, val message: Number?, val country: String?, val sunrise: Number?, val sunset: Number? )