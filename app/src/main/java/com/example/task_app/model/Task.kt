package com.example.task_app.model

data class Task(
    val done: Boolean,
    val id: Int,
    val title: String
)

data class Tasks(
    val tasks: List<Task>
)