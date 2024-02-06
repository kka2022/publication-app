package com.example.publicationapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.publicationapp.R
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.model.Quote

@Preview(showBackground = true)
@Composable
fun QuoteCard(
    modifier: Modifier = Modifier,
    quote: Quote = DataSource.quotes.first(),
    onQuoteCardClick: () -> Unit = {}
) {
    Card(
        modifier = modifier
            .padding(dimensionResource(id = R.dimen.paddingSmall))
            .clickable { onQuoteCardClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .background(color = MaterialTheme.colorScheme.secondaryContainer)
                .padding(dimensionResource(id = R.dimen.paddingMedium))
                .clip(RoundedCornerShape(8.dp))
        ) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(color = MaterialTheme.colorScheme.secondaryContainer)
                    .padding(dimensionResource(id = R.dimen.paddingLarge))
                    .border(
                        width = 1.dp,
                        brush = Brush.linearGradient(
                            colors = listOf(
                                MaterialTheme.colorScheme.primary,
                                MaterialTheme.colorScheme.secondary
                            )
                        ),
                        shape = MaterialTheme.shapes.small
                    )

            ) {
                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.paddingMedium)))
                Text(
                    text = quote.quote,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(dimensionResource(R.dimen.paddingLarge))
                )
                Text(
                    text = "— ${quote.quotedBy}",
                    textAlign = TextAlign.Right,
                    fontStyle = FontStyle.Italic,
                    style = MaterialTheme.typography.labelLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(dimensionResource(R.dimen.paddingMedium))
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.quotation_mark),
                contentDescription = null,
                modifier.size(dimensionResource(id = R.dimen.quoteImageSize))
            )
        }
    }
}