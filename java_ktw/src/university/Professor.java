package university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//교수 클래스에서는 교수와 관련된 정보만 취금
public class Professor {
	
	//교수들 정보 저장
	List<Professor> professorList = new ArrayList<Professor>();
	//과목 정보 받아올 생성자
	Lecture lecture = new Lecture();
	
	//성함
	String professorName;
	//동명이인 일 때 처리할 번호
	int professorId;
	
	//전공 이름을 받아오는 인스턴스
	Major major = new Major();

	@Override
	public int hashCode() {
		return Objects.hash(professorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return professorId == other.professorId;
	}
	
	//교수 고유번호랑 교수님 이름 강의정보 입력받아오는 생성자
	public Professor(int professorId, String professorName, Lecture lecture) {
		this.professorId = professorId;
		this.professorName = professorName;
		this.lecture = lecture;
	}
	
	
	/*
	- 기본 기능
	 *   - 교수 관리
	 *   교수 정보(이름, 전공)
	 *   - 동명이인 관리
	 *   동명이인이지만 전공은 다르다. 전공별 번호로 구분가능
	 *   동명이인이면서 전공도 같다. 전공 교수님별 고유번호 등록
	 *     - 교수 등록/수정/삭제
	*/
	
	
}
