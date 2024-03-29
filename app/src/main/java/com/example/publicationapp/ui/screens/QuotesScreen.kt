package com.example.publicationapp.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.publicationapp.R
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.model.Quote
import com.example.publicationapp.ui.components.QuoteCard

@Composable
fun QuotesScreen(modifier: Modifier = Modifier, quotes: List<Quote> = DataSource.quotesList) {
    LazyColumn(
        modifier = modifier.padding(dimensionResource(id = R.dimen.paddingSmall))
    ) {
        items(quotes) { quote ->
            QuoteCard(quote = quote)
        }
    }
}