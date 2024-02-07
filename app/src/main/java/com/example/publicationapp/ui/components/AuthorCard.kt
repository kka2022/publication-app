package com.example.publicationapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.publicationapp.R
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.model.Author

@Preview(showBackground = true)
@Composable
fun AuthorCard(modifier: Modifier = Modifier, author: Author = DataSource.authorsList.first()) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.paddingSmall)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = author.name,
                    modifier.padding(dimensionResource(id = R.dimen.paddingMedium)),
                    style = MaterialTheme.typography.headlineMedium
                )
                Column(
                    modifier = Modifier.clickable { expanded = !expanded },
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "See Books")
                    Icon(imageVector = Icons.Filled.KeyboardArrowDown, contentDescription = null)
                }
            }
            if (expanded) {
                Column(modifier = Modifier.padding(dimensionResource(id = R.dimen.paddingMedium))) {
                    for (bookName in author.books) {
                        Text(text = bookName)
                    }
                }
//                LazyColumn(modifier = Modifier.padding(dimensionResource(id = R.dimen.paddingMedium))) {
//                    items(author.books) { bookName ->
//                        Text(text = bookName)
//                    }
//                }
            }
        }
    }
}