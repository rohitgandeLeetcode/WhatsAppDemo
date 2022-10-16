package com.example.whatsappdemo.util

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun ImageLoader(@DrawableRes imageUrl: Int, modifier: Modifier) {

    Image(
        painter = painterResource(id = imageUrl),
        modifier = Modifier.size(12.dp),
        contentScale = ContentScale.Fit,
        contentDescription = ""
    )
    }

@Composable
fun ImageLoader(@DrawableRes imageUrl: Int,modifier: Modifier,onClick:()->Unit) {

        Image(
           painter = painterResource(id = imageUrl),
            modifier = Modifier.size(24.dp).clickable {
                onClick()
            },
            contentScale = ContentScale.Fit,
            contentDescription = ""
        )
    }

