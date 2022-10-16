package com.example.whatsappdemo.screen.chat.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.whatsappdemo.data.local.chat
import com.example.whatsappdemo.data.model.User

@ExperimentalFoundationApi
@Composable
fun ChatScreenView(user: User, onBackIconClick: () -> Unit, onMessageSend: (String) -> Unit) {
    Scaffold(
        bottomBar = { EditText(onMessageSend) },
        topBar = {
            ChatTopBar(user, onBackIconClick)
        }
    , content = {

            // might give error
        it.toString()
            ChatsScrollView(chat.toList())
        }
    )
}