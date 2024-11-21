package es.crisvega.badge

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.crisvega.badge.ui.theme.BadgeTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BadgeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Greeting()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
            .background(color = Color.Black)
            .padding(10.dp)
    ) {
        cabecera()
        Row(Modifier.padding(top = 10.dp)) { Text("Ligas Recomendadas", color = Color.White) }
        cajaInicial(Modifier.padding(25.dp))
        Row(Modifier.padding(top = 10.dp)) {
            Text("Mis Ligas", color = Color.White)
            Spacer(modifier = Modifier.weight(1f))
            Box(modifier = Modifier
                .background(Color.Red)
                .height(40.dp)
            ){
                Text(modifier = Modifier.padding(8.dp),
                    text = "Crear liga", color = Color.White)
            }
        }
        FilaLigas(Modifier.padding(10.dp),"Liga 1","1/9 715","9252000 €")
        FilaLigas(Modifier.padding(10.dp),"Liga 2","1/9 715","7254500 €")
        FilaLigas(Modifier.padding(10.dp),"Liga 2","1/9 715","8276000 €")

    }
}




