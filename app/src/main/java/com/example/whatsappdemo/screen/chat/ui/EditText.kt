package com.example.whatsappdemo.screen.chat.ui


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.whatsappdemo.util.ImageLoader
import com.example.whatsappdemo.util.colorTopBar
import com.example.whatsappdemo.R
@ExperimentalFoundationApi
@Composable
fun EditText(onMessageSend: (String) -> Unit) {

    val textState = remember { mutableStateOf(TextFieldValue()) }
    val scrollState = rememberScrollState()

    Box(modifier = Modifier.background(color = colorTopBar())) {
        Row(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
            TextField(
                value = textState.value,
                modifier = Modifier.weight(1f, true),
                onValueChange = {
                    textState.value = it
                })
            Spacer(modifier = Modifier.size(12.dp))

            ImageLoader(
                imageUrl = R.drawable.ic_send,
                modifier = Modifier.weight(0.05f, true),
                onClick = {
                    onMessageSend(textState.value.text)

                })
        }
    }
}