package university;

import java.util.InputMismatchException;
import java.util.Scanner;

import day20.service.PrintServiceImp;
import program.Program;

public class UniversityProgram implements Program{
	private PrintService printService = new PrintServiceImp();
	Scanner scan = new Scanner(System.in);
	int EXIT = 7;
	@Override
	public void run() {
		int menu = 0;
		do {
			printService.printMenu();
			try {
				menu = scan.nextInt();
				runMenu(menu);
			}catch(InputMismatchException e){
				System.out.println("잘못된 메뉴 선택입니다.");
				scan.nextLine();
			}
		}while(menu!=EXIT);
	}

	@Override
	public void printMenu() {
		
	}
	/* 대학생 관리 프로그램을 작성하세요.
	 * - 기본 기능
	 *   - 교수 관리
	 *   교수 정보(이름, 전공)
	 *   - 동명이인 관리
	 *   동명이인이지만 전공은 다르다. 전공별 번호로 구분가능
	 *   동명이인이면서 전공도 같다. 전공 교수님별 고유번호 등록
	 *     - 교수 등록/수정/삭제
	 *   
	 *   
	 *   - 학생 관리
	 *   학생 정보(이름, 학번, 전공)
	 *   - 동명이인 관리
	 *   동명이인이지만 전공은 다르다. 전공별 번호로 구분가능
	 *   동명이인이면서 전공도 같다. 전공별 고유번호(학번) 등록
	 *     - 학생 등록/수정/삭제
	 *   - 과 관리 : 학생 전공은 과, 학부는 없다고 가정
	 *     - 과 등록/수정/삭제
	 *	   - 전공별 정원
	 *
	 *
	 *   - 강의 관리
	 *   등록시 필요 변수
	 *   교수 이름 / 전공 / 시간 / 제목 / 학점 / 학년별
	 *   
	 *   전공별 강의
	 *   - 전공수업 등록시 교수님 번호와 이름을 입력해서 교수님 전공과 다른 전공 선택시 등록 실패
	 *   - 교양수업?..ㅋㅋ
	 *   시간별 관리
	 *   - 교수님 강의 등록시 시간 겹치면(완전히 겹치거나 걸치거나) 등록 실패
	 *   - 교수님 학년별 수업 등록
	 *   
	 *     - 강의 등록/수정/삭제
	 *     - 전공별 강의 등록.
	 *     - 전공 강의별 식별번호
	 *   
	 *   lecture
	 *   
	 *   lectureName , grade(3), score, maxCount, count 
	 *   
	 *   1. 교수 강의등록 lecture(클래스)  -> lectureList -> 학생이랑 공유할건가 아니면 따로 가지고있고 서로 값을 할때마다 수정할것인가 
	 *   
	 *  student (lectureName) 
	 *  
	 *  -> score, maxCount, grade
	 *   
	 *   
	 *   
	 *   
	 *   교수가 [강의] 등록 -> 
	 *   강의 정원, 강의 성적 입력
	 *   
	 *   (0/20) -> (1/20) -> (0/20)
	 *   
	 *   
	 *   
	 *   학생이 [강의]를 신청 ->
	 *   
	 *   학생(강의(성적)) 
	 *   
	 *   신청, 수정, 삭제
	 *   
	 *   
	 *   
	 *   
	 *   - 수강 관리 (정원관리)
	 *   등록시 필요 변수
	 *   교수 이름 / 전공 / 시간 / 제목 / 학점
	 *   
	 *   시간(요일, 시간) 겹치면 신청 실패.
	 *   인원 다 차면 신청 실패.
	 *   무관한 전공(식별번호로 관리) 신청시 신청 실패.
	 *   학점(18학점)다 차면 학점 넘어감
	 *   
	 *     - 수강 신청/성적관리
	 *     - 전공을 선택한다 ->
	 *     - 전공 강의별 등록된 식별번호, 강의명, 출력
	 *     - 출력된 정보 선택
	 *     - 
	 *     
	 *     
	 *   - 조회
	 *     /- 성적 조회/학과 조회 등
	 */
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			//교수 관리
			manageProfessor();
			break;
		case 2:
			//학생 관리
			break;
		case 3:
			//과 관리
			break;
		case 4:
			//강의 관리
			break;
		case 5:
			//수강 관리
			break;
		case 6:
			//조회
			break;
		case 7:
			//프로그램 종료
			System.out.println("프로그램 종료");
			break;
		default:
			throw new InputMismatchException();
		}
	}

	private void manageProfessor() {
		int menu;
		do {
			printService.printManageProfessor();
			menu = scan.nextInt();
			runManageProfessor(menu);
		}while(menu != 4);
		
	}

}
