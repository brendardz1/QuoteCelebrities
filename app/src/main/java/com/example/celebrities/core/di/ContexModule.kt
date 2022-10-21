package com.example.celebrities.core.di

import android.content.Context
import com.example.celebrities.QuotesApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ContexModule {
    @Provides
    @Singleton
    fun provideContext(application: QuotesApp): Context {
        return application.applicationContext
    }

}