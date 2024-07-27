package com.dependency.injections.dagger_hit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {

    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    fun fetchData() {
        viewModelScope.launch {
           try {
               val response = apiService.getPosts()
               _data.value = response.data
           } catch (e: Exception) {
               // Handle the error, e.g., show a message to the user
               _data.value = "Error: ${e.message}"
           }
        }
    }

}