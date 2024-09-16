package com.mlg.androidloginmodulejetpackcompose.navigation

object Graph {
    const val RootGraph = "rootGraph"
    const val AuthGraph = "authGraph" /**Done*/
    const val MainScreenGraph = "mainScreenGraph" /**Done*/
    const val NotificationGraph = "notificationGraph"  /**Done*/
    const val SettingsGraph = "settingsGraph"  /**Done*/
}

sealed class AuthRouteScreen(val route: String) {
    object Login : AuthRouteScreen(route = "login")
    object SignUp : AuthRouteScreen(route = "signUp")
    object ForgotPassword : AuthRouteScreen(route = "forgot")
}

//main screen routs hold the all routs will display in main screen  bottom nav graph
sealed class MainRouteScreen(val route: String) {

    object Home : MainRouteScreen(route = "home")
    object Profile : MainRouteScreen(route = "signUp")
    object Notification : MainRouteScreen(route = "forgot")
    object Settings : MainRouteScreen(route = "forgot")
}


sealed class SettingsRouteScreen(val route: String) {
    object SettingDetails : SettingsRouteScreen(route = "settingsDetails")
}

sealed class NotificationRouteScreen(var route: String) {
    object NotificationDetails : NotificationRouteScreen(route = "notificationDetails")
}