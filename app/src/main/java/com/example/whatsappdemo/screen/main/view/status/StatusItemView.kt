package com.example.whatsappdemo.screen.main.view.status

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
import com.example.whatsappdemo.data.model.Status
import com.example.whatsappdemo.util.colorGreen
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun StatusItemView(status: Status) {
    val padding = 16.dp
    Column(Modifier.padding(padding).fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {

            Box(modifier = Modifier.size(40.dp).clip(shape = CircleShape)) {
                GlideImage(imageModel = {status.imageUrl})

            }
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text(status.name)
                Text(
                    status.time,
                    style = TextStyle(
                        fontSize = 12.sp,
                        color = colorGreen(),
                        textAlign = TextAlign.Center
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
