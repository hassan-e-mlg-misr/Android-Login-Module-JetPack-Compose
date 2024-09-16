package com.mlg.androidloginmodulejetpackcompose.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.mlg.androidloginmodulejetpackcompose.navigation.AuthRouteScreen
import com.mlg.androidloginmodulejetpackcompose.navigation.Graph

fun NavGraphBuilder.authNavGraph(rootNavController: NavHostController) {
    navigation(
        route = Graph.AuthGraph,
        startDestination = AuthRouteScreen.Login.route
    ) {
        // host different screens
        composable(route = AuthRouteScreen.Login.route) { }
        composable(route = AuthRouteScreen.SignUp.route) { }
        composable(route = AuthRouteScreen.ForgotPassword.route) { }
    }
}