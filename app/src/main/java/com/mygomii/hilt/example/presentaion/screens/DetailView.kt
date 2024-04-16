package com.mygomii.hilt.example.presentaion.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mygomii.hilt.example.domain.models.Comment
import com.mygomii.hilt.example.presentaion.main.MainViewModel

@Composable
fun DetailView(viewModel: MainViewModel, postId: Int) {
    val post = viewModel.getPost(postId)
    val comments by viewModel.commentList.collectAsState()

    Column {
        Text(post?.title ?: "Empty")
        Divider(thickness = 1.dp, color = Color.Black)
        CommentView(comments)
    }
}

@Composable
fun CommentView(comments: List<Comment>) {
    Column(
        modifier = Modifier
            .height(200.dp)
    ) {
        LazyColumn {
            items(items = comments) { comment ->
                Text(text = comment.body)
            }
        }
    }
}