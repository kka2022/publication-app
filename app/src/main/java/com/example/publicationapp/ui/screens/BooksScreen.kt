package com.example.publicationapp.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.model.Book
import com.example.publicationapp.ui.components.BookCard

@Preview(showBackground = true)
@Composable
fun BooksScreen(modifier: Modifier = Modifier, books: List<Book> = DataSource.booksList) {
    LazyColumn(modifier = modifier) {
        items(books) { book ->
            BookCard(modifier = Modifier, book = book)
        }
    }
}