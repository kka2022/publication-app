package com.example.publicationapp.ui.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.publicationapp.R

@Composable
fun PublicationTopBar(modifier: Modifier = Modifier) {
    TopAppBar(title = { Text(text = stringResource(R.string.app_name)) })
}