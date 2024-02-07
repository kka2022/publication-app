package com.example.publicationapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.publicationapp.R
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.model.Book

@Preview(showBackground = true)
@Composable
fun BookCard(modifier: Modifier = Modifier, book: Book = DataSource.booksList.first()) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.paddingSmall)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = book.name,
                    modifier.padding(dimensionResource(id = R.dimen.paddingMedium)),
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = book.author,
                    modifier.padding(dimensionResource(id = R.dimen.paddingMedium)),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}