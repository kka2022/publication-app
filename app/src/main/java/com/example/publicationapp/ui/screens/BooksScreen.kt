package com.example.publicationapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.model.Book

@Composable
fun BooksScreen(modifier: Modifier = Modifier, books: List<Book> = DataSource.booksList) {
    Box(modifier = modifier) {
        Text(text = "Books")
    }
}