package com.example.whatsappdemo.screen.main.view.chats

import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.whatsappdemo.data.local.chatsList
import com.example.whatsappdemo.data.model.User
import com.example.whatsappdemo.util.colorLightGreen

@Composable
fun ChatsView(loadNextScreen: (User) -> Unit) {
    LazyColumn(modifier = Modifier.background(color = colorLightGreen())) {

            items(chatsList){
                ChatsItemView(it, loadNextScreen)
                Divider()
            }

    }
}