package com.example.whatsappdemo.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappdemo.R
import kotlinx.coroutines.delay

private const val DELAY: Long = 1000
//@Preview(showBackground = true)
@Composable
fun SplashView(
     loadNextScreen: () -> Unit
) {

    Box(modifier = Modifier.fillMaxSize().background(Color.Black), Alignment.Center) {
        LaunchedEffect(true ){
            delay(DELAY)
            loadNextScreen()
        }

    }
}

