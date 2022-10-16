package com.example.whatsappdemo.screen.chat

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import com.example.whatsappdemo.data.local.addChat
import com.example.whatsappdemo.data.model.User
import com.example.whatsappdemo.screen.chat.ui.ChatScreenView

@Composable
@ExperimentalFoundationApi
fun ChatFragment(userName: String = "", userImage: String = "") {

    ChatScreenView(User(2, userName, userImage), {
    }) { message ->
        if (message.isNotEmpty()) {
            addChat(message)
        }
    }
}
