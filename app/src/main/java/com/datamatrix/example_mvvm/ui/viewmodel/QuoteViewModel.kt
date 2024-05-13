package com.datamatrix.example_mvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.datamatrix.example_mvvm.data.model.QuoteModel
import com.datamatrix.example_mvvm.domain.GetQuotesUseCase
import com.datamatrix.example_mvvm.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    var getQuotesUseCase = GetQuotesUseCase()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()
    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result: List<QuoteModel>? = getQuotesUseCase()
            if(!result.isNullOrEmpty()){
            quoteModel.postValue(result[1])
                isLoading.postValue(false)

            }
        }


    }
    fun randomQuote(){
        isLoading.postValue(true)
        val quote:QuoteModel? = getRandomQuoteUseCase()
            if(quote != null){
                quoteModel.postValue(quote)
            }
        isLoading.postValue(false)

    }


}