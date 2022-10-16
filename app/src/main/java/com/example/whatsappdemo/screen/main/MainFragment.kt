package com.example.whatsappdemo.screen.main

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.whatsappdemo.screen.main.view.MainViewModel
import com.example.whatsappdemo.screen.main.view.ScreenState
import com.example.whatsappdemo.screen.main.view.TabsPanel
import com.example.whatsappdemo.screen.main.view.call.CallsView
import com.example.whatsappdemo.screen.main.view.chats.ChatsView
import com.example.whatsappdemo.screen.main.view.status.StatusView
import com.example.whatsappdemo.util.colorTopBar

@Composable
fun MainFragment(viewModel: MainViewModel){
    onScreenSelected {

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun onScreenSelected(onNavigate: (ScreenState.Screen) -> Unit) {
    val viewModel: MainViewModel = viewModel()
    val screenState: State<ScreenState?> =
        viewModel.screenState.observeAsState(viewModel.screenState.value)

    Column {
        TopAppBar(
            title = { Text("WhatsApp", color = Color.White) },
            backgroundColor = colorTopBar(),
            elevation = 0.dp
        )

        screenState.value?.let {
            Log.d("TAG", "let fun:${it.state.title} --$onNavigate")
            TabsPanel(it, onNavigate)
        }
        Surface {
            Log.d("TAG", "onScreenSelected..............: ${screenState.value?.state?.title}")
            when (screenState.value?.state) {

                ScreenState.Screen.CHATS -> ChatsView(){
                    Log.d("TAG", "onScreenSelected: ${it.name}")
                }
                ScreenState.Screen.STATUS -> StatusView()

                ScreenState.Screen.CALLS -> CallsView()

                else ->{
                    Log.d("TAG", "onScreenSelected: Nothing")
                }
            }
        }
    }

}