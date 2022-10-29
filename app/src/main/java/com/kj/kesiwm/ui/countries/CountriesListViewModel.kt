package com.kj.kesiwm.ui.countries

import androidx.lifecycle.ViewModel
import com.kj.kesiwm.repositories.CountriesListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CountriesListViewModel @Inject constructor(
    val repository: CountriesListRepository
): ViewModel() {

}