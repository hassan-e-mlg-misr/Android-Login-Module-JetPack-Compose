package com.mlg.androidloginmodulejetpackcompose.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mlg.androidloginmodulejetpackcompose.navigation.Graph
import com.mlg.androidloginmodulejetpackcompose.navigation.NotificationRouteScreen

fun NavGraphBuilder.notificationNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graph.NotificationGraph,
        startDestination = NotificationRouteScreen.NotificationDetails.route
    ) {
        // host different screens
        composable(route = NotificationRouteScreen.NotificationDetails.route) { }
    }
}