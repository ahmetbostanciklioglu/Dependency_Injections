package com.dependency.injections.koin

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun KoinScreen(viewModel: SomeViewModel) {

    // Use the viewModel in your Composable
    val data = viewModel.fetchData()
    // Display data in your UI
    Text(data)

}