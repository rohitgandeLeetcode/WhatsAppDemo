package com.example.whatsappdemo.navigation

open class ScreenNavGraph(val route: String, val title: String) {

    sealed class HomeScreens(
        route: String,
        title: String
    ) : ScreenNavGraph(
        route,
        title
    ) {
        object chat : HomeScreens("chat", "Chat")
        object status : HomeScreens("status", "Nearby")
        object calls : HomeScreens("calls", "Reserved")
        object splash : HomeScreens("splash", "Splash")

    }

    open class ToMainChatScreen(
        route: String,
        title: String
    ) : ScreenNavGraph(
        route, title
    ) {
        object singleChat : ToMainChatScreen("singlechat", "Chat")
    }


}