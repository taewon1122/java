package db.mybatis.main;

import java.util.Scanner;

import db.mybatis.controller.MemberController;

public class Main {
	private static MemberController memberController = new MemberController();
	public static void main(String[] args) {
		
		int menu;
		Scanner scan = new Scanner(System.in);
		do {
			printMenu();
			menu = scan.nextInt();
			runMenu(menu);
		}while(menu != 5);
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			memberController.run();
			break;
		case 2:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못 입력된 메뉴");
			}
	}

	private static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 회원관리");
 		System.out.println("2. 프로그램 종료");
		System.out.print("메뉴선택 : ");
	}

}
