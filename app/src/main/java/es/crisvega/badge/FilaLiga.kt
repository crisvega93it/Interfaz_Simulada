package es.crisvega.badge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FilaLigas(modifier: Modifier, liga : String, fecha : String, dinero : String) {
    Row(
        modifier
            .fillMaxWidth()
            .background(Color.Gray)
    ) {
        Column(Modifier.weight(1f)) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                        horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Icon(Icons.Default.Send, contentDescription = "hola", tint = Color.White)
                Text(text = liga, color = Color.White)
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.spacedBy(170.dp)
            ) {
                Text(text = "1/9 715", color = Color.White)
                Text(text = dinero, color = Color.White)
            }
        }
    }
}