package com.example.whatsappdemo.screen.chat.ui


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappdemo.R
import com.example.whatsappdemo.data.model.User
import com.example.whatsappdemo.util.colorTopBar
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun ChatTopBar(user: User, onBackIconClick: () -> Unit) {

    Column {
        TopAppBar(
            backgroundColor = colorTopBar(),
            navigationIcon = {
                IconButton(onClick = {
                    onBackIconClick()
                }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow_back),
                        modifier = Modifier.padding(start = 8.dp),
                        tint = Color.White, contentDescription = "arrow back"
                    )
                }
            },
            actions = {
                Box( modifier = Modifier.size(40.dp)
                    .clip(shape = CircleShape)) {
                    GlideImage(imageModel = {user.imageUrl})

//                    ImageLoader(user.imageUrl)
                }
            },
            title = {
                Text(
                    text = user.name,
                    color = Color.White,
                    style = TextStyle(fontSize = 18.sp, textAlign = TextAlign.Center)
                )
            }
        )
    }
}