package com.example.publicationapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.publicationapp.ui.components.PublicationTopBar
import com.example.publicationapp.ui.screens.AuthorsScreen
import com.example.publicationapp.ui.screens.BooksScreen
import com.example.publicationapp.ui.screens.HomeScreen
import com.example.publicationapp.ui.screens.QuotesScreen

enum class PublicationScreen {
    SplashScreen,
    HomeScreen,
    BooksScreen,
    AuthorsScreen,
    QuotesScreen,
    ShopScreen,
}

@Composable
fun PublicationApp() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { PublicationTopBar() }
    ) { innerPadding ->
        NavHost(
            navController = navController, startDestination = PublicationScreen.HomeScreen.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = PublicationScreen.HomeScreen.name) {
                HomeScreen(modifier = Modifier, onQuoteCardClick = {
                    navController.navigate(PublicationScreen.QuotesScreen.name)
                })
            }
            composable(route = PublicationScreen.BooksScreen.name) {
                BooksScreen()
            }
            composable(route = PublicationScreen.AuthorsScreen.name) {
                AuthorsScreen()
            }
            composable(route = PublicationScreen.QuotesScreen.name) {
                QuotesScreen()
            }
        }
    }
}