package es.crisvega.badge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun cajaInicial(padding: Modifier) {
    Box(
        padding
            .fillMaxWidth()
            .background(color = Color.White)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Red)
        ) {
            Text(text = "RETO FANTASY DAZN", color = Color.White)
        }
        Column(Modifier.height(250.dp)) {
            boximagen(
                "https://cdn.icon-icons.com/icons2/1637/PNG/256/celta-de-vigo_109482.png",
                "RC CELTA   "
            )
            boximagen(
                "https://cdn.icon-icons.com/icons2/104/PNG/256/fc_barcelona_footballteam_18015.png"
                ,"FC BARCELONA"
            )
            Row(Modifier
                .padding(top = 15.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text("¡Crea tu XI para el #CeltaBarça!", color = Color.Gray)
            }
            Row(Modifier
                .padding(top = 15.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Text("¡Sábado, 23 de noviembre - 21:00h", color = Color.Black)
            }
        }
    }
}

@Composable
fun boximagen( url: String, s: String) {
    Row(Modifier
        .height(80.dp)
        .fillMaxWidth()
        .padding(top = 25.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = rememberAsyncImagePainter(url),
            contentDescription = "Image from URL",
            contentScale = ContentScale.Fit
        )
        Text(modifier = Modifier.padding(start = 50.dp),text = s
            , color = Color.Black
            , fontSize = 20.sp)

    }
}