package com.example.publicationapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.model.Quote
import com.example.publicationapp.ui.components.QuoteCard

@Composable
fun QuotesScreen(modifier: Modifier = Modifier, quotes: List<Quote> = DataSource.quotes) {
    LazyColumn(modifier = modifier) {
        items(quotes) {quote ->
            QuoteCard(quote = quote)
        }
    }
}