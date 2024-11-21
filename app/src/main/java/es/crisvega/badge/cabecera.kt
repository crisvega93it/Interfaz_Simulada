package es.crisvega.badge

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun cabecera(){
    Row(Modifier.fillMaxWidth()) {
        primerIcono(Modifier.weight(0.5f))
        textoInicial(Modifier.weight(1f))
        finalIcono(Modifier.weight(0.5f))
    }
}

@Composable
private fun finalIcono(peso: Modifier) {
    Box(
        modifier = peso
            .wrapContentSize(Alignment.CenterEnd)
    ) {

        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "campana",
            tint = Color.White
        )
    }
}

@Composable
private fun textoInicial(peso: Modifier) {
    Box(
        modifier = peso
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Mis ligas Fantasy",
            textAlign = TextAlign.Center, color = Color.White
        )
    }
}

@Composable
private fun primerIcono(peso: Modifier) {
    Box(
        modifier = peso
            .wrapContentSize(Alignment.CenterStart)
    ) {
        Icon(
            imageVector = Icons.Default.AddCircle, contentDescription = "",
            tint = Color.White
        )
    }
}