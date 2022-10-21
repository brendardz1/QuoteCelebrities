package com.example.celebrities.data

import com.example.celebrities.data.local.QuoteLocalDataSource
import com.example.celebrities.domain.model.QuoteModel
import com.example.celebrities.domain.QuoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteRepositoryImpl @Inject constructor
    (private val localDataSource: QuoteLocalDataSource):
    QuoteRepository {

    override suspend fun getQuoteRandom(): Flow<QuoteModel> {
        return  localDataSource.getQuoteRandom()
    }

    override suspend fun getQuote(quoteId: Int): Flow<QuoteModel> {
        return localDataSource.getQuote(quoteId)
    }
}
