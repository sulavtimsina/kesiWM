package com.kj.kesiwm.repositories

import com.kj.kesiwm.data.remote.api.CountryApi
import com.kj.kesiwm.data.remote.model.Countries
import retrofit2.Response
import javax.inject.Inject

class CountriesListRepository @Inject constructor(private val api: CountryApi) {
    suspend fun getCountriesList(): Response<Countries> {
        return api.getCountries()
    }
}