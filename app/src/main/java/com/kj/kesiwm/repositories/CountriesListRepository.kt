package com.kj.kesiwm.repositories

import com.kj.kesiwm.data.remote.api.CountryApi
import com.kj.kesiwm.data.remote.model.Countries
import retrofit2.Response
import javax.inject.Inject

interface CountriesListRepository {
    suspend fun getCountriesList(): Response<Countries>
}

class CountriesListRepositoryImpl @Inject constructor(private val api: CountryApi) :
    CountriesListRepository {
    override suspend fun getCountriesList(): Response<Countries> {
        return api.getCountries()
    }

}