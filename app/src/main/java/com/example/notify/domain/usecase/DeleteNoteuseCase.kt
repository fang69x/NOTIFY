package com.example.notify.domain.usecase

import com.example.notify.domain.repository.NoteRepository

class DeleteNoteuseCase (
    private val repository: NoteRepository
){
 suspend operator fun invoke(note:Note){
     repository.deleteNote(note)
 }
}