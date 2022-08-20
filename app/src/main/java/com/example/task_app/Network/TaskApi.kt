package com.example.task_app.Network

import com.example.task_app.model.Task
import retrofit2.http.GET

interface TaskApi {
    @GET("/tasks")
    suspend fun fetchTasks(): List<Task>
}