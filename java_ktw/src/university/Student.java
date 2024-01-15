package university;

import java.util.ArrayList;
import java.util.List;

//교수 클래스에서는 학생과 관련된 정보만 취급
public class Student {
	
	//학생 정보를 받아서 저장하는 list
	List<Student> studentList = new ArrayList<Student>();
	//교수 리스트에서 강의정보 뽑아와야해
	List<Professor> professorList = new ArrayList<Professor>();
	//전공 다 받아오는 생성자
	Major major = new Major();
	
	//학생 이름
	String studentName;
	//학번
	int studentId;
	//학년
	int grade;
	//입학년도
	int year;
	//점수
	int score;
	
	//학생 학번 생성해주는 생성자
	public Student(String studentName, int year, int grade, Major major) {
		this.studentName = studentName;
		this.year = year;
		this.grade = grade;
		//여기에 학번 만드는거 게산
		//this.studentNum = 
	}
	
	//학번입력받아오는 생성자
	public Student(int StudentId) {
		if(this.studentId == studentId) {
			//해당학생 강의리스트 출력하고
			//set으로 성적 받는다. -> imp에서
		}
	}
	
	//학생 클래스에서는 major의 어떤 정보가 필요해
	//-> 등록할때
	//전공명, 정원, 현재원
	
	//출력
	
	//
	
	//Student1 (이름, 학번, 학년, 나이 , 전공([전공1],[전공2]), 강의([강의1],[강의2] ))
	
	
	
	

}
