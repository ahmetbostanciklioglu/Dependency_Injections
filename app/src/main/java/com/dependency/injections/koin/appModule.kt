package com.dependency.injections.koin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single<SomeRepository> { SomeRepositoryImpl() }
    viewModel { SomeViewModel(get()) }
}