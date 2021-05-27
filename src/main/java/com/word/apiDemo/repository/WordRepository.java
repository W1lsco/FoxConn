import org.springframework.data.jpa.repository.JpaRepository;
import com.word.apiDemo.entity.Word;


public interface WordRepository extends JpaRepository<Word, String> {
	Word findWord(String word);
}