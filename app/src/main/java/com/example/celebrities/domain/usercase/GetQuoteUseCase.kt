package com.example.celebrities.domain.usercase

import com.example.celebrities.domain.QuoteRepository
import com.example.celebrities.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteUseCase @Inject constructor(private val quoteRepository: QuoteRepository) {
    suspend fun getQuote(quoteId: Int): Flow<QuoteModel> = quoteRepository.getQuote(quoteId)
}