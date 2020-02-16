/*package br.com.ioasys.camp.engravideiioasyscamp.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Service {
    private val BASE_URL = "http://engravidei.herokuapp.com/"
    val retrofit: InterfaceRetrofit by lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(InterfaceRetrofit::class.java)
    }
}*/