package homework.word;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
// 단어 클래스
public class Word implements Serializable{
	private static final long serialVersionUID = -2534152854795595317L;
	
	// 단어
	private String word;			
	// 뜻과 품사를 포함한 리스트
	List<Means> mean = new ArrayList<Means>();
	
	// 단어 출력 -> toString
	public void printWord() {
		System.out.print(word + " : ");
		//어차피 0부터 다 뽑을거면 toString 으로 하는것도 괜찮을듯
		
		for(int i = 0 ; i < mean.size(); i++ ) {
			System.out.print((i+1) + ". ");
			mean.get(i).printMean();
			/*	
		for(Means m : mean) {
			if((i + 1) != mean.size()) {
				System.out.print(" / ");
			}
			else {
				System.out.println();
			}
			 */
		}
	}
	
	
	public Word(String word) {
		this.word = word;
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
		return Objects.equals(word, other.word);
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
}

@Setter
@Getter
class Means implements Serializable {
private static final long serialVersionUID = 2274509388447823350L;
	
	private String mean;	// 뜻 의미
	private String wordClass; 	// 뜻에 따른 품사
	
	// 뜻 출력
	public void printMean() {
		System.out.print("("+ wordClass +") " + mean); 
	}

	// 생성자
	public Means(String wordClass, String mean) {
		this.wordClass = wordClass;
		this.mean = mean;
	}

	
	//  equals와 hashCode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Means other = (Means) obj;
		return Objects.equals(mean, other.mean);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mean);
	}

}
