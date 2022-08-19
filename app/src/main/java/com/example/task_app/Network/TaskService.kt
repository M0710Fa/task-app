package com.example.task_app.Network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val BASE_URL = "https://192.168.11.10:8000"

val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

val taskRetrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()

object TaskService {
    val taskService by lazy{
        taskRetrofit.create(TaskApi::class.java)
    }
}