package day13;

import java.util.Scanner;

//Program 인터페이스를 구현한 구현 클래스
public abstract class ConsoleProgram implements Program{
	
	static String str;
	
	static int count = 0;
	private Scanner scan = new Scanner(System.in);
	
	@Override
	public void printMenu() {
		System.out.println("------------------------");
		System.out.println("1. 문장 추가");
		System.out.println("2. 검색");
		System.out.println("3. 종료");
		System.out.println("------------------------");
		System.out.println("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			break;
		case 2:
			System.out.println("기능2가 실행중입니다.");
			break;
		case 3:
			break;
		default:
			System.out.println("잘못된 메뉴");
		}
		printExit();
	}

	@Override
	public void printExit() {
		System.out.println("------------------------");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("------------------------");
	}

	@Override
	public void run() {
		System.out.println("------------------------");
		System.out.println("프로그램을 실행합니다.");
		System.out.println("------------------------");
		int menu;
		do {
			//메뉴 출력
			printMenu();			
			//메뉴 입력
			menu = scan.nextInt();
			//메뉴 실행
			runMenu(menu);
			
		}while(menu != 3);
	}

}