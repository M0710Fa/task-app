package com.example.task_app.ui.task

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import com.example.task_app.model.Task
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState

@Composable
fun TaskList(taskList:List<Task>){
    var isRefreshing by remember { mutableStateOf(false) }

    SwipeRefresh(
        state = rememberSwipeRefreshState(isRefreshing),
        onRefresh = { isRefreshing = true },
    ) {
        LazyColumn() {
            items(taskList){ task->
                TaskCard(task)
            }
        }
    }

}