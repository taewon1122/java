package homework;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor

public class Word {
	
	String word;
	String mean;
	String partOfSpeech;
	
	public Word (String word){
		this.word = word;
	}
	
	public Word (String word, String Mean){
		this.word = word;
		this.mean = Mean;
	}
	
	public Word (){
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(partOfSpeech, other.partOfSpeech)
				&& Objects.equals(word, other.word);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mean, partOfSpeech, word);
	}
	
}
