package com.mygomii.hilt.example.presentaion.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mygomii.hilt.example.R
import com.mygomii.hilt.example.presentaion.ui.theme.HiltexampleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HiltexampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(viewModel: MainViewModel = viewModel()) {
    val posts by viewModel.postList.collectAsState()

    Column {
        LazyColumn {
            items(items = posts) { post ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(4.dp))
                        .background(Color.White)
                        .padding(8.dp)
                ) {
                    RoundedImage(imageRes = R.drawable.ic_launcher_background)
                    Title(title = post.title)
                }
            }
        }
    }
}

@Composable
fun Title(title: String) {
    Column(modifier = Modifier.padding(start = 4.dp, end = 4.dp)) {
        Text(
            modifier = Modifier
                .wrapContentWidth(align = Alignment.CenterHorizontally), text = title
        )
    }
}

@Composable
fun RoundedImage(imageRes: Int) {
    Image(
        painter = painterResource(imageRes),
        contentDescription = "this is image",
        modifier = Modifier
            .size(40.dp)
            .clip(shape = CircleShape),
        alignment = Alignment.Center,
        contentScale = ContentScale.FillHeight,
    )
}

@Composable
@Preview
fun Main() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(62.dp)
            .clip(shape = RoundedCornerShape(4.dp))
            .background(Color.White)
            .padding(8.dp)
            .wrapContentHeight(align = Alignment.CenterVertically)
    ) {
        RoundedImage(imageRes = R.drawable.ic_launcher_background)
        Title("aaaaaa")
    }
}
