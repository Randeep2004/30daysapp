package com.example.a30daysofdailyquotes.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import coil.compose.AsyncImage
import com.example.a30daysofdailyquotes.model.Quote

@Composable
fun QuoteList(quotes: List<Quote>) {
    LazyColumn {
        items(quotes) { quote ->
            QuoteCard(quote)
        }
    }
}

@Composable
fun QuoteCard(quote: Quote) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { expanded = !expanded },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF1C1C1E) // Dark gray background
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Orange Day Header - Bigger
            Text(
                text = "Day ${quote.id}",
                style = MaterialTheme.typography.headlineSmall.copy(
                    color = Color(0xFFFF9500), // Orange
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            AsyncImage(
                model = quote.imageUrl,
                contentDescription = "Quote Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(12.dp))

            AnimatedVisibility(visible = expanded) {
                Column {
                    // Green Quote Text - Bigger
                    Text(
                        text = "“${quote.text}”",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                            color = Color(0xFF32D74B), // Green
                            fontStyle = FontStyle.Italic
                        )
                    )
                    Spacer(modifier = Modifier.height(6.dp))

                    // Author - Larger and Lighter
                    Text(
                        text = "- ${quote.author}",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            color = Color(0xFFB0B0B0),
                            fontWeight = FontWeight.Light
                        )
                    )
                }
            }
        }
    }
}
