package com.example.publicationapp

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.publicationapp.data.DataSource
import com.example.publicationapp.ui.components.PublicationTopBar
import com.example.publicationapp.ui.screens.AuthorsScreen
import com.example.publicationapp.ui.screens.BooksScreen
import com.example.publicationapp.ui.screens.HomeScreen
import com.example.publicationapp.ui.screens.PublicationUiState
import com.example.publicationapp.ui.screens.PublicationViewModel
import com.example.publicationapp.ui.screens.QuotesScreen
import com.example.publicationapp.ui.screens.ShopScreen

enum class PublicationScreen {
    Splash, Home, Books, Authors, Quotes, Shop,
}

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun PublicationApp() {
    val navController = rememberNavController()
    val publicationViewModel: PublicationViewModel = viewModel()
    val publicationUiState = publicationViewModel.publicationUiState

    Scaffold(topBar = {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentScreen = PublicationScreen.valueOf(
            backStackEntry?.destination?.route ?: PublicationScreen.Home.name
        )

        PublicationTopBar(
            canNavigateUp = navController.previousBackStackEntry != null,
            currentScreen = currentScreen,
            navigateUp = { navController.navigateUp() }
        )
    }) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = PublicationScreen.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = PublicationScreen.Home.name) {
                HomeScreen(
                    modifier = Modifier,
                    onCardClick = { navController.navigate(it) },
                    randomQuote = when(publicationUiState) {
                        is PublicationUiState.Success -> publicationUiState.quote
                        PublicationUiState.Error -> DataSource.quotesList.first()
                        PublicationUiState.Loading -> DataSource.quotesList.first()
                    }
                )
            }
            composable(route = PublicationScreen.Books.name) {
                BooksScreen(modifier = Modifier)
            }
            composable(route = PublicationScreen.Authors.name) {
                AuthorsScreen(modifier = Modifier)
            }
            composable(route = PublicationScreen.Quotes.name) {
                QuotesScreen(modifier = Modifier)
            }
            composable(route = PublicationScreen.Shop.name) {
                ShopScreen(modifier = Modifier)
            }
        }
    }
}

