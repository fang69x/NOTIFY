import com.example.notify.domain.repository.NoteRepository

class AddNoteUseCase (
    private val repository: NoteRepository
){
    suspend operator fun invoke(note:Note){
        if(note.title.isBlank()){
            throw IllegalArgumentException("The title of the note can't be empty")
        }
        if(note.content.isBlank())
        {
            throw IllegalArgumentException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }
}
