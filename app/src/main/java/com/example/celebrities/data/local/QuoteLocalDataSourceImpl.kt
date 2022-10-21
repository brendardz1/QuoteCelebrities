package com.example.celebrities.data.local

import com.example.celebrities.core.utils.toEntity
import com.example.celebrities.core.utils.toListQuoteModel
import com.example.celebrities.core.utils.toQuoteModel
import com.example.celebrities.data.local.daos.QuoteDao
import com.example.celebrities.domain.model.QuoteModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class QuoteLocalDataSourceImpl @Inject constructor(private val quoteDao: QuoteDao):
    QuoteLocalDataSource {
    override fun getQuotes(): Flow<List<QuoteModel>> {
        val quotes = quoteDao.getQuotes()
        return quotes.map { it.toListQuoteModel() }
    }

    override fun getQuote(quoteId: Int): Flow<QuoteModel> {
        return quoteDao.getQuote(quoteId).map { it.toQuoteModel() }
    }

    override fun getQuoteRandom(): Flow<QuoteModel> {
        return quoteDao.getQuoteRandom().map { it.toQuoteModel() }
    }

    override suspend fun insertAll(quotes: List<QuoteModel>) {
        quoteDao.insertAll(quotes!!.map { it.toEntity() })
    }

    override suspend fun insert(quoteModel: QuoteModel) {
        quoteDao.insert(quoteModel.toEntity())
    }
}