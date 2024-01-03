package day17.student;

public class StudentMain {

	//인터페이스, 스트림, 람다식 이용함
	public static void main(String[] args) {
		/* 다음 기능을 가진 프로그램을 만드세요.
		 * - 학생 관리 프로그램
		 * - 기능
		 * 	1. 학생 추가
		 * 	2. 학생 조회
		 * 	3. 종료
		 * - 학생은 학년, 반, 번호, 이름을 가진다.
		 * - 저장 기능과 불러오기 기능을 통해 학생 정보들을 유지
		 * - object stream을 이용해 저장 불러오기 기능 구현 학생 추가하고 종료시 학생정보 저장되도록
		 * 
		 */
		StudentProgram sp = new StudentProgram();
		sp.run();
		
	}

}
