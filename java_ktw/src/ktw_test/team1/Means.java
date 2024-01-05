package ktw_test.team1;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Means {
	@NonNull
	String mean, wordClass;

	//이미 있는 뜻인지 확인하는 메서드
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
	
	//출력방식
	public String printMean() {
		return "[ "+ "품사 : " + wordClass + "뜻 : " + mean + " ]";
	}

	public Means(String wordClass, String mean) {
		this.wordClass = wordClass;
		this.mean = mean;
	}
	
}
