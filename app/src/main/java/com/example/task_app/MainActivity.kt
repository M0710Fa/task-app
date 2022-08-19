package com.example.task_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.task_app.ui.task.TaskScreen
import com.example.task_app.ui.theme.TaskappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskApp()
        }
    }
}

@Composable
fun TaskApp(){
    TaskappTheme() {
        Scaffold(
            topBar = {
                     TopAppBar(
                         title = { Text("タスクリスト") }
                     )
            },
        ) {
            TaskScreen()
        }

    }
}

@Preview
@Composable
fun PreviewApp(){
    TaskApp()
}