package com.example.publicationapp.ui.screens

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.publicationapp.model.Quote
import com.example.publicationapp.network.QuoteApi
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface PublicationUiState {
    data class Success(val quote: Quote) : PublicationUiState
    data object Loading : PublicationUiState
    data object Error : PublicationUiState
}

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
class PublicationViewModel : ViewModel() {
    var publicationUiState: PublicationUiState by mutableStateOf(PublicationUiState.Loading)
        private set

    init {
        getRandomQuote()
    }

    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    fun getRandomQuote() {
        viewModelScope.launch {
            publicationUiState = try {
                val fetchedQuote = QuoteApi.retrofitService.getRandomQuote()
                PublicationUiState.Success(fetchedQuote)
            } catch (e: IOException) {
                PublicationUiState.Error
            } catch (e: HttpException) {
                PublicationUiState.Error
            }
        }
    }
}