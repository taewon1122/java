package university;

public class UniversityMain {
	/* 대학생 관리 프로그램을 작성하세요.
	 * - 기본 기능
	 *   - 교수 관리
	 *     - 교수 등록/수정/삭제
	 *   - 학생 관리
	 *     - 학생 등록/수정/삭제
	 *   - 과 관리 : 학생 전공은 과, 학부는 없다고 가정
	 *     - 과 등록/수정/삭제
	 *   - 강의 관리 
	 *     - 강의 등록/수정/삭제
	 *   - 수강 관리
	 *     - 수강 신청/성적관리
	 *   - 조회
	 *     - 성적 조회/학과 조회 등
	 * - 추가 기능 구현 해도 됨
	 * - 과에 학부 추가해도 됨
	 * - 제출일 : 1월 26일. 상황봐서 변경될 수 있음.
	 * */
	public static void main(String[] args) {
		UniversityProgram p = new UniversityProgram();
		p.run();
	}

}
