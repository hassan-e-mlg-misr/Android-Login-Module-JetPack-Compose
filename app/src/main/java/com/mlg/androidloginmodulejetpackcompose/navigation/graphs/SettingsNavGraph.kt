package com.mlg.androidloginmodulejetpackcompose.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mlg.androidloginmodulejetpackcompose.navigation.Graph
import com.mlg.androidloginmodulejetpackcompose.navigation.NotificationRouteScreen
import com.mlg.androidloginmodulejetpackcompose.navigation.SettingsRouteScreen

fun NavGraphBuilder.settingsNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graph.SettingsGraph,
        startDestination = SettingsRouteScreen.SettingDetails.route
    ) {
        // host different screens
        composable(route = SettingsRouteScreen.SettingDetails.route) { }
    }
}