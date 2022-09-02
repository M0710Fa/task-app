package com.example.task_app.Network

import com.example.task_app.model.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class taskRepository(private val task: TaskService = TaskService) {
    val tasks: Flow<List<Task>> = flow{
        emit(task.taskService.fetchTasks())
    }
}