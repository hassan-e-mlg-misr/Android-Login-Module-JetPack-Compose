package com.mlg.androidloginmodulejetpackcompose.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.mlg.androidloginmodulejetpackcompose.navigation.Graph

@Composable
fun RootNavGraph() {
    // Nav Controller to control and mapping on to different composable screens
    val rootNavController = rememberNavController()
    //Nav Host Container
    NavHost(
        navController = rootNavController,
        // routs will assign to rootgraph = parent rout that hold all other sub routs
        route = Graph.RootGraph , // put parent route
        startDestination = Graph.AuthGraph
    ) { }

}