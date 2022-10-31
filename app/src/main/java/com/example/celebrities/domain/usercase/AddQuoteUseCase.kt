package com.example.celebrities.domain.usercase

import com.example.celebrities.domain.QuoteRepository
import com.example.celebrities.domain.model.QuoteModel
import javax.inject.Inject

class AddQuoteUseCase @Inject constructor(private val quoteRepository: QuoteRepository) {

    suspend fun insert(quote: QuoteModel)=quoteRepository.addQuote(quote)

}