package com.dependency.injections

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.dependency.injections.koin.SomeViewModel
import com.dependency.injections.theme.DependencyInjectionsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val someViewModel: SomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DependencyInjectionsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    println(innerPadding)

                    //DaggerHiltScreen(viewModel, innerPadding)

                   // KoinScreen(viewModel)
                }
            }
        }
    }
}

