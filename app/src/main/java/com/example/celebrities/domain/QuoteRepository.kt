package com.example.celebrities.domain

import com.example.celebrities.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow

interface QuoteRepository {
    suspend fun getQuoteRandom(): Flow<QuoteModel>
    suspend fun getQuote(quoteId:Int): Flow<QuoteModel>
}

