package com.example.publicationapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.model.Author
import com.example.publicationapp.ui.components.AuthorCard

@Preview(showBackground = true)
@Composable
fun AuthorsScreen(modifier: Modifier = Modifier, authors: List<Author> = DataSource.authorsList) {
    LazyColumn(modifier = modifier) {
        items(authors) { author ->
            AuthorCard(modifier = Modifier, author = author)
        }
    }
}