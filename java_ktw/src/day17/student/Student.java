package day17.student;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //@Getter, @Setter, @ToString, @HashcodeAndEquals 등을 합쳐놓은 어노테이션
@AllArgsConstructor //모든 멤버들을 매개변수로 갖는 생성자 배치순서로
//@RequiredArgsConstructor NonNull 붙은애만 생성자로 만들어줌
public class Student implements Serializable {
	
	private static final long serialVersionUID = -6588474647564459241L;
	
	private int grade, classNum, num;
	private String name;
	
	@Override // 반 학년 번호만 같으면 같은 사람으로 인식
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	@Override // jdk버전에 따라 다르다. 일정버전 이하면 수식으로 나옴
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	
	@Override
	public String toString() {
		return "[" + grade + "학년 " + classNum + "반 " + num + "번 " + name + "]";
	}
	
}
