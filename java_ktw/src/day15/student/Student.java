package day15.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor  // 모든필드를 포함하는 생성자 1개 생성해줌
@RequiredArgsConstructor //NonNull (필수) 인 생성자 1개 생성해줌
//@Getter
//@Setter
public class Student {
	
	@NonNull
	private int grade, classNum, num;
	@NonNull
	private String name;
	
	
	private int kor, eng, math;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 서로 클래스 유형이 다를경우
			return false;
		
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
}

