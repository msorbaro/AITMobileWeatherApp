package com.example.msorbaro.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.msorbaro.weatherapp.data.WeatherResult
import com.example.msorbaro.weatherapp.data.network.WeatherAPI
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val HOST_URL = "https://api.openweathermap.org/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val retrofit = Retrofit.Builder()
                .baseUrl(HOST_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val weatherAPI = retrofit.create(WeatherAPI::class.java)



        btnWeather.setOnClickListener {
            val weatherCall = weatherAPI.getRates(etBase.text.toString())

            weatherCall.enqueue(object : Callback<WeatherResult> {

                override fun onFailure(call: Call<WeatherResult>, t: Throwable) {
                    tvResult.text = t.message
                }

                override fun onResponse(call: Call<WeatherResult>, response: Response<WeatherResult>) {
                    val weatherResult = response.body()
                    tvResult.text =
                            "Temp: ${String.format("%.2f", weatherResult?.main?.temp?.toFloat())}"
                }
            })
        }

    }


}
