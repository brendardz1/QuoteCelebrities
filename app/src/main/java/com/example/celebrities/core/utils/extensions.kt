package com.example.celebrities.core.utils

import com.example.celebrities.data.local.entities.QuoteEntity
import com.example.celebrities.domain.model.QuoteModel


fun QuoteEntity.toQuoteModel() = QuoteModel(
    id=id,
    quote = quote,
    author = author,
)
fun QuoteModel.toEntity() = QuoteEntity(
    id= id,
    quote = quote,
    author = author,
)

fun List<QuoteModel>.toListQuoteEntity () =
    map {it.toEntity() }

fun List<QuoteEntity>.toListQuoteModel () =
    map {it.toQuoteModel() }