package com.manish.composeapplication.ui.compose

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun ComposeTextView(text: String, fontWeight: FontWeight, fontSize: TextUnit, color: Long) {
    Text(
        text = text,
        fontWeight = fontWeight,
        fontSize = fontSize,
        color = Color(color),
        modifier = Modifier.padding(0.dp, 20.dp, 0.dp, 0.dp)
    )
}