package com.kj.kesiwm.data.remote.api

import com.kj.kesiwm.data.remote.model.Countries
import retrofit2.Response
import retrofit2.http.GET

interface CountryApi {

    @GET("countries.json")
    suspend fun getCountries(): Response<Countries>
}