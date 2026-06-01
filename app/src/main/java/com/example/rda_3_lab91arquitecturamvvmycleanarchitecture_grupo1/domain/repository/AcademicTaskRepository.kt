package com.example.rda_3_lab91arquitecturamvvmycleanarchitecture_grupo1.domain.repository

import com.example.rda_3_lab91arquitecturamvvmycleanarchitecture_grupo1.domain.model.AcademicTask
import kotlinx.coroutines.flow.Flow

interface AcademicTaskRepository {
    fun getTasksStream(): Flow<List<AcademicTask>>
    suspend fun addTask(title: String)
    suspend fun toggleTaskCompletion(taskId: String)
}
