package com.mygomii.hilt.example.presentaion.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.mygomii.hilt.example.domain.models.Post

@Composable
fun PostList(navController: NavHostController, posts: List<Post>) {
    Column(
        modifier = Modifier
            .height(200.dp)
    ) {
        LazyColumn {
            items(items = posts) { post ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 2.dp, bottom = 2.dp)
                        .background(color = Color.Gray, shape = RoundedCornerShape(4.dp))
                        .clickable {
                            navController.navigate("detail/${post.id}")
                        }
                        .padding(4.dp)
                ) {
                    Title(title = post.title)
                }
            }
        }
    }
}


@Composable
fun Title(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(4.dp)
    )
}