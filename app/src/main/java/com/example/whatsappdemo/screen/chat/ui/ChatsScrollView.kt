package com.example.whatsappdemo.screen.chat.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappdemo.data.model.Conversation
import com.example.whatsappdemo.util.colorLightGreen

@Composable
fun ChatsScrollView(chat: List<Conversation>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .background(color = colorLightGreen())
            .padding(10.dp)
            .padding(bottom = 40.dp)
    ) {

        items(chat) {
            if (it.id == 2) {
                setupReceipientChat(it)
            } else {
                setupMyChat(it)
            }
            Spacer(modifier = Modifier.padding(8.dp))
        }


    }
}

@Composable
fun setupMyChat(chat: Conversation) {
    Box(

        modifier = Modifier
            .fillMaxWidth()
            .padding(80.dp, end = 10.dp)
            .background(Color(38, 82, 72))
            .clip(shape = RoundedCornerShape(8.dp)),
    ) {
        Row(modifier = Modifier.padding(all = 10.dp)) {
            Column(modifier = Modifier.weight(3.0f, true)) {
                Text(
                    text = chat.chat,
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.White
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
fun setupReceipientChat(chat: Conversation) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, end = 80.dp)
            .background(Color(62, 61, 64))
            .clip(shape = RoundedCornerShape(8.dp)),
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Column(modifier = Modifier.weight(3.0f, true)) {
                Text(
                    text = chat.chat,
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.White
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
