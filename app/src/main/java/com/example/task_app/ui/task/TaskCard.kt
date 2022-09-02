package com.example.task_app.ui.task

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task_app.model.Task

@Composable
fun TaskCard(taskItem: Task, modifier: Modifier = Modifier){

    val isDone by remember{ mutableStateOf(taskItem.done) }

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = 4.dp,
    ) {
        Column(
            modifier= Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = taskItem.title,
                    style= MaterialTheme.typography.h5,
                    modifier = Modifier
                        .weight(3f)
                )
                Checkbox(checked = isDone, onCheckedChange = {},
                    modifier = Modifier.weight(1f))
            }
            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "期限：2022/08/19",
                    style = MaterialTheme.typography.body2
                )
                Text(
                    text = "所要時間：60分",
                    style = MaterialTheme.typography.body2
                )
            }
        }

    }
}

@Preview
@Composable
fun PreviewTaskCard(){
    val taskItem = Task(false, 0, "タスク")
    TaskCard(taskItem = taskItem)
}