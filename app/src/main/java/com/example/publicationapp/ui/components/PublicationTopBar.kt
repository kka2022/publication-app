package com.example.publicationapp.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.publicationapp.PublicationScreen

@Preview(showBackground = true)
@Composable
fun PublicationTopBar(
    modifier: Modifier = Modifier,
    canNavigateUp: Boolean = false,
    currentScreen: PublicationScreen = PublicationScreen.Home,
    navigateUp: () -> Unit = {}
) {
    TopAppBar(
        title = { Text(text = currentScreen.name) },
        navigationIcon = {
            IconButton(onClick = navigateUp) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
            }
        }
    )
}