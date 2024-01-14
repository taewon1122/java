package day11.product;


import java.util.Scanner;

import day09.board.Board;
import day11.product.Homework1;

public class HomeworkEx1 {
	public static Scanner scan = new Scanner(System.in);
	public static Homework1 []studentList = new Homework1[10];
	public static Homework1 []scoreList = new Homework1[10];
	public static int count = 0;
	public static int scoreCount = 0;
	/* 고등 학생 성적을 관리하는 프로그램을 작성하세요.
	 * 메뉴
	 * 1. 학생 관리
	 * 	- 학생 추가 : 동일한 학생(학년,반,번호가 같은)이 있으면 안됨
	 * 	- 학생 수정
	 * 	- 학생 삭제
	 * 2. 성적 관리
	 * 	- 성적 추가 : 과목과 점수를 입력
	 *  - 성적 수정
	 *  - 성적 삭제
	 * 3. 프로그램 종료
	 * 
	 * - Student 클래스
	 * - Subject 클래스
	 *   - 쉬운 버전 : 과목명, 총점
	 *   - 어려운 버전 : 과목명, 성적(중간, 기말, 수행평가, 총점)
	 * */
	public static void main(String[] args) {
		int menu;
		do {
		//메뉴 출력
		menu();
		//머뉴 실행
		menu = scan.nextInt();
		//선택한 메뉴 실행
		runMenu(menu);
			//반복문
			
		}while(menu != 3);
		System.out.println("프로그램 종료");
	}

	private static void runMenu(int menu) {
		switch(menu){
		case 1:
			//학생 관리
			managment();
			break;
		case 2:
			//학생 성적 관리
			managementScore();
			break;
		case 3:
			//프로그램 종료
			break;
		default:
			System.out.println("잘못 선택된 메뉴");
		}
	}

	private static void managementScore() {
		int menu;
		do {
			//메뉴 출력
			scoreSubMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴 실행
			runscoreSubMenu(menu);
		}while(menu != 4);
	}

	private static void runscoreSubMenu(int menu) {
		switch(menu) {
		case 1:
			//성적 추가
			AddScore();
			break;
		case 2:
			updateScore();
			//성적 수정
			break;
		case 3:
			deleteScore();
			//성적 삭제
			break;
		case 4:
			System.out.println("돌아가기");
			break;
		default:
			System.out.println("잘못 선택된 메뉴");
		}
	}

	private static void deleteScore() {
		// TODO Auto-generated method stub
		
	}

	private static void updateScore() {
		// TODO Auto-generated method stub
		
	}

	private static void AddScore() {
		//학생 정보 입력
		System.out.print("학생이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.print("학번 : ");
		int studentNum = scan.nextInt();
		
		System.out.print("반 : ");
		int classNum = scan.nextInt();
	
		//같다면 성적 입력
		for(int i = 0; i<count; i++) {
			if(studentList[i].getName().equals(name)) {
				System.out.println("성적 입력");
				//과목 입력
				System.out.print("과목 이름 : ");
				int subject = scan.nextInt();
				//성적 입력
				System.out.print("점수 : ");
				int score = scan.nextInt();
				
				
				//만약 국영수 입력해서 따로 해야하는거면 국영수 배열 따로 만들어야하나?
				//과목별 점수를 학생별로 넣기 가능?ㅋㅋㅋ
				//scoreList[scoreCount] = new Homework1(subject, score);
				scoreCount++;
				return;
			}
		}
		
		
		//일치하는 학생 정보가 있으면 중복이라고 출력
		
		//배열이 다 차면 확장
		if(count == studentList.length) {
			studentList = expandList(studentList);
		}
		for(int i = 0; i<count; i++) {
			studentList[i].printInfo();
		}
	}

	private static void scoreSubMenu() {
		System.out.println("--------------");
		System.out.println("학생관리");
		System.out.println("1. 성적 추가");
		System.out.println("2. 성적 수정");
		System.out.println("3. 성적 삭제");
		System.out.println("4. 돌아가기");
		System.out.println("--------------");
		System.out.println("메뉴 선택 : ");
	}

	public static void managment() {
		int menu;
		do {
			//메뉴 출력
			managementSubMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴 실행
			runManagementSubMenu(menu);
			
		}while(menu != 4);
	}

	private static void runManagementSubMenu(int menu) {
		switch(menu) {
		case 1:
			//학생 추가
			AddStudent();
			break;
		case 2:
			updateStudent();
			//학생 수정
			break;
		case 3:
			deleteStduent();
			//학생 삭제
			break;
		case 4:
			System.out.println("돌아가기");
			break;
		default:
			System.out.println("잘못 선택된 메뉴");
		}
	}

	private static void deleteStduent() {
		//삭제할 학생이름 입력
		scan.nextLine();
		System.out.println("삭제할 학생 이름 입력 : ");
		String name = scan.nextLine();
		//반복문 : 학생 리스트 목록 전체
		int index = -1;//일치하는 게시글이 있는 번지 index 0까지 있으니까 아예 글 없을시 -1
		for(int i = 0; i < count; i++) {
			//입력한 번호와 일치하는 게시글을 찾아 번지를 저장
			if(studentList[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("일치하는 게시글이 없습니다.");
			return;
		}
		count--;
		//가장 최근에 등록된 학생을 삭제했다면
		//== 배열에서 가장 마지막에 있는 게시글을 삭제했다면
		if(index == count) {
			System.out.println("삭제 되었습니다.");
			return;
		}
	
		//찾은 번지 다음부터 한칸씩 당겨옴
		//기존 배열과 크기가 같은 새 배열을 생성
		Board []tmpList = new Board[studentList.length];
		//새 배열에 기존 배열을 복사
		//b l 0번지부터 b l 개만큼을 tmplist 0번지에 붙여넣겠다.
		System.arraycopy(studentList, 0, tmpList, 0, studentList.length);
		//기존 배열에서 찾은 번지 다음부터 나머지 개수를 복사해서 새 배열에 찾은 번지부터 덮어씀
		//count - index => 나머지 
		//tmpList index + 1번지를 찾고 boardList index번지를 찾고 tmpList index + 1번지 부터 count - index만큼의 크기를 boardList index번지부터 붙여넣는다
		System.arraycopy(tmpList, index+1, studentList, index, count - index);
		//메서드
		System.out.println("삭제 되었습니다.");
		
		for(int i = 0; i<count; i++) {
			studentList[i].printInfo();
		}
	}

	public static void updateStudent() {
		//학생 정보 입력
		System.out.print("학생이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.print("학번 : ");
		int studentNum = scan.nextInt();
		
		System.out.print("반 : ");
		int classNum = scan.nextInt();

		//일치하는 제품의 할인 금액을 수정
		//반복문 : 등록된 제품 전체
		for(int i = 0; i<count; i++) {
			System.out.println("정보수정");
			//제품의 이름과 제품명이 같으면
			if(studentList[i].getName().equals(name)) {
				
				//제품의 할인 금액을 수정후 종료{
				System.out.print("학생이름 : ");
				scan.nextLine();
				String name1 = scan.nextLine();
				
				System.out.print("학번 : ");
				int studentNum1 = scan.nextInt();
				
				System.out.print("반 : ");
				int classNum1 = scan.nextInt();
				studentList[i].updateInformation(name1, studentNum1, classNum1);
			
				for(i = 0; i<count; i++) {
					studentList[i].printInfo();
				}
				return;
			}
		}
		//등록된 학생이 없다고 출력
		System.out.println("등록된 학생이 없습니다.");
		
	}

	private static void AddStudent() {
		//학생 정보 입력
		System.out.print("학생이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		
		System.out.print("학번 : ");
		int studentNum = scan.nextInt();
		
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		
		//일치하는 학생 정보가 있으면 중복이라고 출력
		for(int i = 0; i<count; i++) {
			if(studentList[i].getName().equals(name)) {
				System.out.println("이미 등록된 학생.");
				return;
			}
		}
		//없으면 추가
		studentList[count] = new Homework1(name, studentNum, classNum);
		count++;
		
		//배열이 다 차면 확장
		if(count == studentList.length) {
			studentList = expandList(studentList);
		}
		for(int i = 0; i<count; i++) {
			studentList[i].printInfo();
		}
	}
	/**
	 * 주어진 list를 확장하는 메서드
	 * @param list 확장할 메서드
	 * @return 주어진 list에 크기 10만큼 늘어난 배열을 반환
	 */
	public static Homework1[] expandList(Homework1[] studentList) {
		//배열이 꽉차면 배열 확장
		Homework1[] tmpList = new Homework1[studentList.length + 10];
		
		System.arraycopy(studentList, 0, tmpList, 0, studentList.length);
		
		return tmpList;
	}

	public static void managementSubMenu() {
		System.out.println("--------------");
		System.out.println("학생관리");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 돌아가기");
		System.out.println("--------------");
		System.out.println("메뉴 선택 : ");
	}

	public static void menu() {
		System.out.println("--------------");
		System.out.println("메뉴");
		System.out.println("1. 학생 관리");
		System.out.println("2. 성적 관리");
		System.out.println("3. 프로그램 종료");
		System.out.println("--------------");
		System.out.println("메뉴 선택 : ");
	}
}
