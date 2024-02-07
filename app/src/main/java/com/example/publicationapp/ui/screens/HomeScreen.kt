package com.example.publicationapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.publicationapp.PublicationScreen
import com.example.publicationapp.R
import com.example.publicationapp.ui.components.ExploreCard
import com.example.publicationapp.ui.components.QuoteCard

@Preview(showBackground = true)
@Composable
fun HomeScreen(modifier: Modifier = Modifier, onCardClick: (String) -> Unit = {}) {
    Column(modifier = modifier.verticalScroll(rememberScrollState())) {
        QuoteCard(
            modifier = Modifier.clickable { onCardClick(PublicationScreen.Quotes.name) }
        )
        ExploreCard(
            modifier = Modifier.clickable { onCardClick(PublicationScreen.Books.name) },
            topic = stringResource(R.string.explore_books),
            imageId = R.drawable.ic_launcher_foreground
        )
        ExploreCard(
            modifier = Modifier.clickable { onCardClick(PublicationScreen.Authors.name) },
            topic = stringResource(R.string.explore_authors),
            imageId = R.drawable.explore_author_image
        )
        ExploreCard(
            modifier = Modifier.clickable { onCardClick(PublicationScreen.Shop.name) },
            topic = stringResource(R.string.explore_shops),
            imageId = R.drawable.baseline_shopping_bag_24
        )
    }
}