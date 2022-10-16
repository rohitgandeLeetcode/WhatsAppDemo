package com.example.whatsappdemo.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.whatsappdemo.R

@Composable
fun SplashFragment() {
   Image(
      painter = painterResource(
         id = R.drawable.ic_whatsapp_logo
      ), contentDescription = "logo",
      modifier = Modifier.size(120.dp)
   )
   SplashView(){}
}
