package com.dependency.injections.koin

import androidx.lifecycle.ViewModel

class SomeViewModel(
    private val repository: SomeRepository
) : ViewModel() {
    fun fetchData() = repository.getData()
}