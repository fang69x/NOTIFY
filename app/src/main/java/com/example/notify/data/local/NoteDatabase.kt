package com.example.notify.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notify.data.local.NoteDao
import com.example.notify.data.local.NoteEntity

@Database(
    entities = [NoteEntity::class],
    version=1
)
abstract class NoteDatabase : RoomDatabase(){
    abstract fun noteDao() :NoteDao
}
