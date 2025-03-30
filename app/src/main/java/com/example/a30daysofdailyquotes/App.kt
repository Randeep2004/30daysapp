package com.example.a30daysofdailyquotes

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.a30daysofdailyquotes.data.dailyQuotes
import com.example.a30daysofdailyquotes.ui.components.QuoteList
import com.example.a30daysofdailyquotes.ui.theme.DailyQuotesTheme

@Composable
fun App() {
    DailyQuotesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = androidx.compose.material3.MaterialTheme.colorScheme.background
        ) {
            QuoteList(quotes = dailyQuotes)
        }
    }
}
