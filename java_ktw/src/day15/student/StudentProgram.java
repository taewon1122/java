package day15.student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class StudentProgram implements Program {
	private Scanner scan = new Scanner(System.in);
	private final int EXIT = 4;
	//List<object> list = new ArrayList<Student>();
	private List<Student> list = new ArrayList<Student>();
	
	@Override
	public void run() {
		
		int menu = 0;
		do {
			try {
			//메뉴 출력
			printMenu();
			//메뉴 입력
			menu = scan.nextInt();
			//선택된 메뉴 실행
			runMenu(menu);
			}catch(InputMismatchException e){
				System.out.println("잘못 입력된 메뉴입니다.");
				scan.nextLine();
			}
		}while(menu != EXIT);
	}

	@Override
	public void printMenu() {
		System.out.println("------------------------");
		System.out.println("1. 학생관리");
		System.out.println("2. 성적관리");
		System.out.println("3. 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("------------------------");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) {
		
		switch(menu) {
		
		case 1:
			studentManager();
		case 2:
			//성적관리
				//성적수정
			break;
		case 3:
			//조회
				//학생조회
					//전체
					//학년
					//반
					//학생(학년,반,번호)
				//성적조회
					//국어
					//영어
					//수학
			break;
		case 4:
			//종료
			System.out.println("프로그램 종료");
			break;
		default:
			throw new InputMismatchException();
		}
	}

	private void studentManager() {
		int stdMenu;
		//학생관리
		do {
			//메뉴 출력
			printStudentdMenu();
			//메뉴 선택
			stdMenu = scan.nextInt();
			//학생관리메뉴 
			runStudentdMenu(stdMenu);
		}while(stdMenu != EXIT);
	}

	private void runStudentdMenu(int stdMenu) {
		switch(stdMenu) {
		case 1:
			//학생추가
			insertStudent();
		case 2:
			//학생수정
			updateStudent();
		case 3:
			//학생삭제
			deleteStudent();
		case EXIT:
			System.out.println("돌아가기");
			break;
		default:
		}
	}
	
	private void printStudentdMenu() {
		System.out.println("------------------------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 돌아가기");
		System.out.println("------------------------");
		System.out.print("메뉴 선택 : ");
	}

	private void insertStudent() {
		//반, 번호, 이름 성적(국, 영, 수) 순으로 입력
		System.out.print("학년 입력 : ");
		int grade = scan.nextInt();
		System.out.print("반 입력 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		//입력받은 정보로 인스턴스를 생성 std
		Student std = new Student(grade, classNum, num, name);
		
		//중복이 있으면 이미 등록된 학생입니다.
		//contains는 Objects.equals(a,b)를 호출
		//a.equals(b)를 이용하여 있는지 없는지 확인
		if(!list.contains(std)) {
			list.add(std);
			System.out.println("학생을 등록했습니다.");
			return;
		}
		
		//있으면 이미 등록됐다고 알림
		System.out.println("이미 등록된 학생입니다.");
		
	}

	private void updateStudent() {
		//학생 수정
		//학번 입력
		//학번 없다면
		//등록되지 않은 학생입니다 출력 return
		//학번 있다면
		//다시 입력
	}
	
	private void deleteStudent() {
		
	}

}
