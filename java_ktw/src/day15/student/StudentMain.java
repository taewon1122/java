package day15.student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class StudentMain {

	public static void main(String[] args) {
		/* 학생 국어, 영어, 수학 성적 관리 프로그램을 작성하세요.
		 * Program 인터페이스를 생성하여 활용
		 * 	- void run()
		 * 	- void printMenu()
		 * 	- void runMenu(int Menu)
		 * - Program 인터페이스를 구현한 구현 클래스 StudentProgram 클래스를 생성하여 활용
		 * - 학생 정보를 Student 클래스를 생성해서 활용
		 * 	- 학년, 반, 번호, 이름, 국어, 영어, 수학
		 * - 리스트를 활용
		 * - 기능
		 * 	- 학생 관리
		 * 		-학생 추가
		 * 		-학생 수정
		 * 		-학생 삭제
		 * 	- 성적 관리
		 * 		-성적 수정
		 * 	- 조회
		 * 		-학생 조회
		 * 		 -전체
		 * 		 -학년
		 * 		 -반
		 * 		 -학생(학년,반,번호)
		 * 		-성적 조회
		 *		 -국어
		 *		 -영어
		 *		 -수학
		 */
		
		//Program p = new StudentProgram();
		//p.run();
		
		int a[] = new int[3];
		
		
		
		List<Student> list = new ArrayList<Student>();
		
		System.out.println("size:"+list.size());
		
		Student s1 = new Student(1, 1, 1, "배영걸");
		list.add(s1);
		
		System.out.println("size:"+list.size());
		
		Student s2 = new Student(1, 1, 1, "김수현");
		list.add(s2);
		System.out.println("size:"+list.size());
		
		s2.setName("김수현1");
		
		
		Student s3 = new Student(1, 1, 1, "김태원");
		list.add(s3);
		System.out.println("size:"+list.size());
		
		//list.remove(1);
		
		/*
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println("이름:"+s.getName());
			//System.out.println("이름:"+list.get(i).getName());
		}
		*/
		String srchWord = "김";
		
		for(Student s : list) {
			if(s.getName().contains(srchWord0)) {
			//if(s.getName().equals(srchWord)) {
				System.out.println("이름:"+s.getName());
			}
			
		}
		
		
		
		
		
	}

}


