package com.mygomii.hilt.example.presentaion.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.mygomii.hilt.example.presentaion.main.MainViewModel

enum class Screen(val value: String) {
    Main("main"), Detail("detail/{postId}")
}

@Composable
fun Main(
    viewModel: MainViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val posts by viewModel.postList.collectAsState()

    NavHost(
        navController = navController,
        startDestination = Screen.Main.value,
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        composable(
            route = Screen.Main.value
        ) {
            PostList(navController = navController, posts = posts)
        }
        composable(
            route = Screen.Detail.value,
            arguments = listOf(navArgument("postId") { type = NavType.IntType })
        ) { backStackEntry ->
            val postId = backStackEntry.arguments?.getInt("postId") ?: -1
            DetailView(viewModel = viewModel, postId = postId)
        }
    }

}