package com.datamatrix.example_mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.datamatrix.example_mvvm.model.QuoteModel
import com.datamatrix.example_mvvm.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    val quoteModel= MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote: QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}