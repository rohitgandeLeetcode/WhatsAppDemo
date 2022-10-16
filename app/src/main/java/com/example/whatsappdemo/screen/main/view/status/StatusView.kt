package com.example.whatsappdemo.screen.main.view.status

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.whatsappdemo.data.local.statusList
import com.example.whatsappdemo.util.colorLightGreen

@Composable
fun StatusView() {
    LazyColumn( modifier = Modifier.background(color = colorLightGreen())) {
            items(statusList){
                StatusItemView(it)
                Divider()
            }
    }
}