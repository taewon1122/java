package day18.student;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Student implements Serializable{
	
	private static final long serialVersionUID = 6787455733541030095L;
	private int grade, classNum, num;
	private String name;
	
	//equals로 중복 있는지.
	@Override
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
	
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	
	public String toString() {
		//이런 형식으로 출력할거다.
		return "[" + grade + "학년 " + classNum + "반 " + num + "번 " + name + "]";
		
	}
}
