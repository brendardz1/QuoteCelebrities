package com.example.celebrities.presentation.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.celebrities.domain.model.QuoteModel
import com.example.celebrities.domain.usercase.AddQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InsertViewModel @Inject constructor(private val addQuoteUseCase: AddQuoteUseCase): ViewModel(){
    private val quoteModelInsert = MutableStateFlow(QuoteModel(0,"",""))
    fun addQuote (quoteModel: QuoteModel){
        viewModelScope.launch { val quoteModelAdd= addQuoteUseCase.insert(quote = quoteModel)
        }
    }
}