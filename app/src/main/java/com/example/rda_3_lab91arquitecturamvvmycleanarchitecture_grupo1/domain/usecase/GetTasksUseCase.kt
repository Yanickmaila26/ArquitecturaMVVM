package com.example.rda_3_lab91arquitecturamvvmycleanarchitecture_grupo1.domain.usecase

import com.example.rda_3_lab91arquitecturamvvmycleanarchitecture_grupo1.domain.model.AcademicTask
import com.example.rda_3_lab91arquitecturamvvmycleanarchitecture_grupo1.domain.repository.AcademicTaskRepository
import kotlinx.coroutines.flow.Flow

class GetTasksUseCase(private val repository: AcademicTaskRepository) {
    operator fun invoke(): Flow<List<AcademicTask>> {
        return repository.getTasksStream()
    }
}
