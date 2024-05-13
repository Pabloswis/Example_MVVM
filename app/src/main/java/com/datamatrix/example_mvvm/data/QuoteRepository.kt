package com.datamatrix.example_mvvm.data

import com.datamatrix.example_mvvm.data.model.QuoteModel
import com.datamatrix.example_mvvm.data.model.QuoteProvider
import com.datamatrix.example_mvvm.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response : List<QuoteModel> =  api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}