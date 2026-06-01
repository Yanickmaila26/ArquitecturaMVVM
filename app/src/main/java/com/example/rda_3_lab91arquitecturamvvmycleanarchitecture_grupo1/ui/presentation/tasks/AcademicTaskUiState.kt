package com.example.rda_3_lab91arquitecturamvvmycleanarchitecture_grupo1.ui.presentation.tasks

import com.example.rda_3_lab91arquitecturamvvmycleanarchitecture_grupo1.domain.model.AcademicTask

sealed class AcademicTaskUiState {
    object Loading : AcademicTaskUiState()
    data class Success(val tasks: List<AcademicTask>) : AcademicTaskUiState()
    data class Error(val message: String) : AcademicTaskUiState()
}

enum class ScreenType {
    LIST, CREATE
}
