package com.example.notify.data.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notify.data.local.NoteDao

@Database(
    entities = [NoteEntity::class],
    version=1
)
abstract class NoteDatabase : RoomDatabase(){
    abstract fun noteDao() :NoteDao
}
