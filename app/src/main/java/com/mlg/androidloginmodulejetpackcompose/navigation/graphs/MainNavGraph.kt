package com.mlg.androidloginmodulejetpackcompose.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mlg.androidloginmodulejetpackcompose.navigation.Screens

import com.mlg.androidloginmodulejetpackcompose.screens.HomeScreen
import com.mlg.androidloginmodulejetpackcompose.screens.NotificationScreen
import com.mlg.androidloginmodulejetpackcompose.screens.ProfileScreen
import com.mlg.androidloginmodulejetpackcompose.screens.SettingsScreen


@Composable
fun SetUpNavGraph(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(
        navController = navController ,
        startDestination = Screens.Home.route
    ){
        composable(Screens.Home.route) {  HomeScreen(innerPadding = innerPadding)  }
        composable(Screens.Home.route) {  NotificationScreen(innerPadding = innerPadding)  }
        composable(Screens.Home.route) {  ProfileScreen(innerPadding = innerPadding)  }
        composable(Screens.Setting.route) {  SettingsScreen(innerPadding = innerPadding)  }
    }
}