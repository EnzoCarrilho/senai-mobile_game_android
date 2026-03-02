package com.example.exerciciojogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exerciciojogo.ui.theme.ExercicioJogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicioJogoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainMenu(modifier = Modifier.padding(innerPadding))
                    //GameOver(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainMenu(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(Color.Black)
        .padding(vertical = 50.dp),
           verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                ScoreRow(modifier = Modifier)
            }
           AndroidRow(modifier = Modifier)
        }

        StartButton(modifier = Modifier)
    }

}


@Composable
fun GameOver(modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(color = Color.Black),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
        ) {
        Box(modifier = Modifier){
            AndroidRow(modifier = Modifier)
            Row (modifier = Modifier) {
                Text("GAME OVER",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 65.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

        }
    }
}





@Composable
fun AndroidImage(modifier: Modifier = Modifier, color: Color) {
    Image(
        modifier = modifier
            .size(50.dp),
        painter = painterResource(R.drawable.ic_android_black_24dp),
        contentDescription = "Android enemy",
        colorFilter = ColorFilter.tint(color)
    )
}

@Composable
fun ScoreRow(modifier: Modifier = Modifier) {
    Row(modifier = Modifier)
    {
        Text("SCORE 0050",
            color = Color.White)

    }

    Row(modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically) {
        Text("LIVES:",
            color = Color.White,
            textAlign = TextAlign.End
        )
        AndroidImage(
            modifier = Modifier
                .size(12.dp),
            color = Color.Yellow
        )
        AndroidImage(
            modifier = Modifier
                .size(12.dp),
            color = Color.Yellow
        )
        AndroidImage(
            modifier = Modifier
                .size(12.dp),
            color = Color.Yellow
        )
    }
}

@Composable
fun StartButton(modifier: Modifier = Modifier) {
    Column (modifier = modifier
        .fillMaxWidth()
        .height(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = modifier
                .size(50.dp),
            painter = painterResource(R.drawable.outline_10k_24),
            contentDescription = "10k image",
            colorFilter = ColorFilter.tint(Color.White)
        )
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .height(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            ) {
            Text("PRESS START",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,

            )
        }

    }
}

@Composable
fun AndroidRow(modifier: Modifier = Modifier) {
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        AndroidImage(
            modifier = Modifier
                .size(60.dp),
            color = Color(158, 253, 36, 255)
        )
        AndroidImage(
            modifier = Modifier
                .size(60.dp),
            color = Color.Red
        )
        AndroidImage(
            modifier = Modifier
                .size(60.dp),
            color = Color.Blue
        )
        AndroidImage(
            modifier = Modifier
                .size(60.dp),
            color = Color.Yellow
        )
        AndroidImage(
            modifier = Modifier
                .size(60.dp),
            color = Color(158, 253, 36, 255)
        )
    }
}



