package com.agrokasa.agrotrypackv2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient { //Configura Retrofit para conectarse al API
    private const val BASE_URL = "https://agkwebagro.agrokasa.pe/WSRESTSincronizacion/"

    private var retrofit: Retrofit? = null

    fun getClient(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!

    }
}