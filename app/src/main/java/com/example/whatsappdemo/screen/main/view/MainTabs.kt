package com.example.whatsappdemo.screen.main.view

import android.util.Log
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.example.whatsappdemo.util.colorTopBar

data class ScreenState(var state: Screen = Screen.CHATS) {

    enum class Screen(
        val title: String = "Tab"
    ) {
        CHATS(title = "Chats"),
        STATUS(title = "Status"),
        CALLS(title = "Calls")
    }
}

@Composable
fun TabsPanel(
    screenState: ScreenState,
    onNavigate: (ScreenState.Screen) -> Unit,
) {
    val (selectedTab, setSelectedTab) = remember {
        mutableStateOf(
            ScreenState.Screen.values().indexOf(screenState.state)
        )
    }

    val tabs = ScreenState.Screen.values()
    TabRow(
        selectedTabIndex = selectedTab,
        backgroundColor = colorTopBar(),
        tabs = {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    text = { Text(text = tab.title.toUpperCase(), color = Color.White) },
                    selected = index == selectedTab,
                    onClick = {
                        Log.d("TAG", "TabsPanel: onclick $index  ${tab.title}")
                        setSelectedTab(index)
                        onNavigate(tab)
                    }
                )
            }
        }
    )
}