import com.example.notify.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotesUseCase(
    private val repository: NoteRepository
){
    operator fun invoke():Flow<List<Note>> {
        return repository.getNotes()
    }
}