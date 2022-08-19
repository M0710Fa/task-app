package com.example.task_app.ui.task

import androidx.compose.runtime.Composable
import com.example.task_app.model.Task

@Composable
fun TaskScreen(){
    TaskList(taskList = sampleTaskList)
}

val sampleTaskList = listOf(
    Task(false, 0, "タスク1"),
    Task(true, 1, "タスク2"),
    Task(false, 2, "タスク3"),
    Task(false, 3, "タスク4"),
    Task(false, 4, "タスク5"),
    Task(false, 5, "タスク6"),
    Task(false, 6, "タスク7"),
    Task(false, 7, "タスク8"),
    Task(false, 8, "タスク9"),
    Task(false, 9, "タスク10"),
    Task(false, 10, "タスク11"),
    Task(false, 11, "タスク12"),
    Task(false, 12, "タスク13"),
    Task(false, 13, "タスク14"),
)