package com.example.whatsappdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whatsappdemo.navigation.ScreenNavGraph
import com.example.whatsappdemo.screen.chat.ChatFragment
import com.example.whatsappdemo.screen.main.MainFragment
import com.example.whatsappdemo.screen.main.view.MainViewModel
import com.example.whatsappdemo.screen.main.view.call.CallsView
import com.example.whatsappdemo.screen.main.view.status.StatusView
import com.example.whatsappdemo.screen.splash.SplashFragment
import com.example.whatsappdemo.ui.theme.WhatsAppTheme

class MainActivity : ComponentActivity() {
    val mainViewModel = MainViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppTheme {
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavigationHost(navController = navController)

                    MainFragment(viewModel = mainViewModel)
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NavigationHost(navController: NavController) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = ScreenNavGraph.HomeScreens.splash.route
    ) {
        composable(ScreenNavGraph.HomeScreens.chat.route) { CallsView() }
        composable(ScreenNavGraph.HomeScreens.status.route) { StatusView() }
        composable(ScreenNavGraph.HomeScreens.calls.route) { CallsView() }
        composable(ScreenNavGraph.HomeScreens.splash.route) { SplashFragment() }


        composable(ScreenNavGraph.ToMainChatScreen.singleChat.route) { ChatFragment() }

    }
}
