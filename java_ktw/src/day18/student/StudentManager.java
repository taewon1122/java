package day18.student;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StudentManager {
	
	//학생들을 리스트로 관리
	private List<Student> list = new ArrayList<Student>();
	
	public StudentManager(List<Student> list) {
		if(list == null) {
			return;
		}
		this.list = list;
	}
	
	//입력받은 학생정보 list 추가
	public boolean insertStudent(Student std) {
		if(list.contains(std)) {
			System.out.println("이미 등록된 학생");
			return false;
		}
			//없다면 저장
			list.add(std);
			return true;
	}
	
	//list 출력
	public void printStudent() {
		list.stream().forEach((s->System.out.println(s)));
	}

	public boolean updateStudent(Student std) {
		//등록된 학생인지 확인
		int index = list.indexOf(std);
		//등록된 학생이 아니면 false를 리턴
		if(index < 0) {
			return false;
		}
		//등록된 학생이면 이름을 수정
		list.get(index).setName(std.getName());
		return true;
	}
}
