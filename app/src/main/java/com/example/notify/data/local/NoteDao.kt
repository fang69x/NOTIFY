package com.example.notify.data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note:NoteEntity)
    @Query("SELECT *FROM notes_table")
    fun getNotes():Flow<List<NoteEntity>>

    @Query("SELECT * FROM notes_table WHERE id=:id")
    suspend fun getNoteById(id:Int):NoteEntity?

    @Delete
    suspend fun deleteNote(note: NoteEntity)
}
