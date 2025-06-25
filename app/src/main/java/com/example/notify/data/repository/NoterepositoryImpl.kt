package com.example.notify.data.repository

import com.example.notify.data.local.NoteDao
import com.example.notify.data.mappers.toNote
import com.example.notify.data.mappers.toNoteEntity
import com.example.notify.domain.model.Note
import com.example.notify.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class NoterepositoryImpl (
    private val dao: NoteDao
): NoteRepository{
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes().map{
            entities->entities.map{
                it.toNote()
        }
        }
    }

    override suspend fun getNoteById(id:Int):Note?{
    return dao.getNoteById(id)?.toNote()
    }

    override suspend fun insertNote(note:Note){
        dao.insertNote(note.toNoteEntity())
    }

    override suspend fun deleteNote(note:Note){
        dao.deleteNote(note.toNoteEntity())
    }
}