package com.example.a30daysofdailyquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.a30daysofdailyquotes.data.dailyQuotes
import com.example.a30daysofdailyquotes.ui.theme.DailyQuotesTheme
import com.example.a30daysofdailyquotes.ui.components.QuoteList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DailyQuotesTheme {
                DailyQuotesApp()
            }
        }
    }
}

@Composable
fun DailyQuotesApp() {
    val quotes = dailyQuotes


    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            QuoteList(quotes)
        }
    }
}
