package com.example.whatsappdemo.screen.main.view.call

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.whatsappdemo.data.local.calls
import com.example.whatsappdemo.util.colorLightGreen

@Composable
fun CallsView() {
    LazyColumn( modifier = Modifier.background(color = colorLightGreen())) {
            items(calls){
                CallItem(it)
                Divider()
            }
    }
}