package day17.student;

import java.util.ArrayList;

import lombok.Data;

@Data
public class StudentManager {
	
	//같은 패키지에있는 클래스는 따로 import해주지 않아도됨
	private ArrayList<Student> list = new ArrayList<Student>();
	
	/**학생 정보가 주어지면 학생 정보를 추가하는 메서드로
	 * 학년, 반, 번호가 같은 학생이 있는 경우 학생 정보를 추가하지 않음
	 * @param student 학생정보
	 * @return 학생 정보를 추가했는지에 대한 여부 성공시 true; 중복시 false;
	 */
	public boolean insertStudent(Student std) {
		if(list.contains(std)) {
			return false;
		}
		
		list.add(std);
		//학년, 반, 번호 순으로 정렬
		sort();
		
		return true;
	}
	
	/**가지고 있는 학생 정보들을 정렬하는 메서드
	 */
	public void sort() {
		list.sort((s1, s2) -> {
			//학년이 다르면
			if(s1.getGrade() != s2.getGrade()) {
				return s1.getGrade() - s2.getGrade();
			}
			//반이 다르면
			if(s1.getClassNum() != s2.getClassNum()) {
				return s1.getClassNum() - s2.getClassNum();
			}
			return s1.getNum() - s2.getNum();
		});
	}
	
	//학생 정보 출력
	public void printAll() {
		//s는 list를 stream으로 민들고 forEach로 하나씩 꺼내서 s로 관리 s는 매개변수와 같아서 아무이름이나 가능
		list.stream().forEach(s -> System.out.println(s));
	}
	
	public void setList(ArrayList<Student> list) {
		//nullpointexeption을 막기위해서 null처리를 해주기 위해 setter 오버라이딩
		if(list == null) {
			return;
		}
		this.list = list;
	}
}
