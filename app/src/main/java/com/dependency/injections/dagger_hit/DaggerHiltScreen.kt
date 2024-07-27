package com.dependency.injections.dagger_hit

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun DaggerHiltScreen(viewModel: MyViewModel, innerPadding: PaddingValues) {
    val data by viewModel.data.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.fetchData()
    }

    Box (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        contentAlignment = Alignment.Center
    ){
        Text(text = data ?: "Loading...")
    }

}