package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {
	static Scanner scan = new Scanner(System.in);
	static Map<String, String> map = new HashMap<String, String>();
	static ArrayList<String> list = new ArrayList<String>();
	static int count;
	public static void main(String[] args) {
		/* 회원을 관리하는 프로그램을 작성하세요
		 * 메뉴
		 * 1.회원가입
		 * -아이디와 비번만 입력
		 * -이미 가입된 회원인지 체크(containsKey)
		 * 2.회원검색
		 * -아이디를 입력해서 회원 정보를 조회
		 * 3.종료
		 * 
		 */
	
		int menu;
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴 실행
			runMenu(menu);
			//입력 잘못할 수 있다.
			
		}while(menu != 3);
	}
	private static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택 : ");
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			//가입
			scan.nextLine();
			System.out.print("아이디 입력 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 입력 : ");
			String pw = scan.nextLine();
			String str = map.put(id, pw);
			list.add(str);
			System.out.println("회원가입 완료");
			break;
		case 2:
			String tmp = null;
			Set<String> keySet = map.keySet();
			for(int i = 0; i<count; i++) {
				//조회
				String value = map.get(tmp);
				System.out.println("[" + tmp + ", " + value + "]");
				count++;
			}
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못 선택된 메뉴");
		}
	}


}
