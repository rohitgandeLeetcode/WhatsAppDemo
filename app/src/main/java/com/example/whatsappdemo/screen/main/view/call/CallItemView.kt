package com.example.whatsappdemo.screen.main.view.call

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappdemo.data.model.Call
import com.example.whatsappdemo.util.ImageLoader
import com.example.whatsappdemo.util.colorGreen
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun CallItem(call: Call) {

    val padding = 16.dp

    Column(
        Modifier
            .padding(padding)
            .fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {

            Box(modifier = Modifier
                .size(40.dp)
                .clip(shape = CircleShape)) {
                GlideImage(imageModel = {call.imageUrl})
//                ImageLoader(call.imageUrl)
            }
            Column(modifier = Modifier.padding(start = padding)) {
                Text(call.name)
                Text(
                    call.time,
                    style = TextStyle(
                        fontSize = 12.sp,
                        color = colorGreen(),
                        textAlign = TextAlign.Center
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
                ImageLoader(call.voiceStatus, modifier = Modifier)
            }
        }
    }
}
