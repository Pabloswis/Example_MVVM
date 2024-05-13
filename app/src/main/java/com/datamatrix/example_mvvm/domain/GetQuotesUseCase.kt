package com.datamatrix.example_mvvm.domain

import com.datamatrix.example_mvvm.data.QuoteRepository
import com.datamatrix.example_mvvm.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>?{
        return repository.getAllQuotes()
    }
}