package com.example.task_app.ui.task

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.task_app.model.Task

@Composable
fun TaskList(taskList:List<Task>){
    LazyColumn() {
        items(taskList){ task->
            TaskCard(task)
        }
    }
}