package ktw_test.team1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//단어 관리하는 클래스
public class Word {
	
	String word;
	//뜻이랑 품사를 가지는 리스트
	List<Means> mean = new ArrayList<Means>();
	
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
	//중복 확인
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
	
	public String toString(){
		return "[" + "단어 : " + word + "]";
	}
	
	public void printWord(){
		for(int i = 0; i < mean.size(); i++) {
			System.out.print((i+1) + ". ");
			System.out.println(word + "/" +  mean.get(i));
		}
	}
	
	public Word(String word) {
		this.word = word;
	}
	
}
