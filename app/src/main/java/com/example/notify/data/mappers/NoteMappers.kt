fun NoteEntity.toNote():Note{
    return Note(
        id=id,
        title=title,
        content=content,
        timestamp=timestamp
    )
}
fun Note.toNoteEntity():NoteEntity
{
    return NoteEntity(
        id=id,
        title=title,
        content=content,
        timestamp=timestamp
    )
}
