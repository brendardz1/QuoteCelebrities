package com.example.celebrities.core.di

import com.example.celebrities.data.QuoteRepositoryImpl
import com.example.celebrities.data.local.QuoteLocalDataSource
import com.example.celebrities.data.local.QuoteLocalDataSourceImpl
import com.example.celebrities.domain.QuoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class QuoteRepositoryModule {
    @Binds
    abstract fun bindQuoteRepository(quoteRepositoryImpl: QuoteRepositoryImpl):
            QuoteRepository

    @Binds
    abstract fun bindQuoteLocalDataSource(quoteLocalDataSourceImpl: QuoteLocalDataSourceImpl):
            QuoteLocalDataSource

}