package com.example.task_app.ui.task

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.task_app.Network.taskRepository
import com.example.task_app.model.Task
import kotlinx.coroutines.launch

class TaskViewModel(
    private val repository: taskRepository = taskRepository()
): ViewModel() {

    private val _taskList = MutableLiveData<List<Task>>()
    val taskList = _taskList

    init{
        getTaskList()
    }

    private fun getTaskList() = viewModelScope.launch {
        try {
            repository.tasks.collect{
                _taskList.value = it
            }
        }catch (e: Exception){
            Log.d("getTaskList", "ネットワークエラー ：" + e)
        }
    }

}