package com.example.celebrities.domain.usercase

import com.example.celebrities.domain.QuoteRepository
import com.example.celebrities.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteRandomUseCase @Inject constructor(private val quoteRepository: QuoteRepository) {
    suspend fun getQuoteRandom(): Flow<QuoteModel> = quoteRepository.getQuoteRandom()
}