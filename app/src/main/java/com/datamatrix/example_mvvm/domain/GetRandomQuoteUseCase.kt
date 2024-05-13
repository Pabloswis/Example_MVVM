package com.datamatrix.example_mvvm.domain

import com.datamatrix.example_mvvm.data.QuoteRepository
import com.datamatrix.example_mvvm.data.model.QuoteModel
import com.datamatrix.example_mvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    private val repository = QuoteRepository()
    operator fun invoke ():QuoteModel?{
        //refactorizar
        val quotes:List<QuoteModel> = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }else{
            return null
        }
    }
}