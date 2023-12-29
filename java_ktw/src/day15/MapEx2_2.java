package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx2_2 {
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
		//예외발생가능 0으로 처리.
		int menu = 0;
		
		do {
			//메뉴 출력
			printMenu();
			try {
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴 실행
			runMenu(menu);
			//입력 잘못할 수 있다.
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				//잘못 입력된 값을 문자열로 가져와서 버림
				scan.nextLine();
			}
		}while(menu != 3);
	}
	private static void printMenu() {
		System.out.println("--------------");
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원 검색");
		System.out.println("3. 종료");
		System.out.println("--------------");
		System.out.print("메뉴 선택 : ");
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			//가입
			insertMember();
			break;
		case 2:
			//조회
			searchMember();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			//throws runtimeexception 자식 클래스일때 생략가능
			throw new InputMismatchException();
		}
	}
	
	private static void insertMember() {
		//아이디를 입력
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		//map에 아이디가 있는지 확인 => containsKey
		if(map.containsKey(id)) { //if(map.get(id) != null) 이 아이디와 일치하는 id에 비번이 저장되있다? -> 중복아이디.
			//있으면 이미 있는 아이디라고 출력하고 메서드 종료
			System.out.println("이미 가입된 아이디입니다.");
			return;
		}
		//없으면 비번 입력
		System.out.print("비밀번호 입력 : ");
		String pw = scan.next();
		
		//map에 추가
		map.put(id, pw);
		System.out.println("회원가입 완료");
	}
	
	private static void searchMember() {
		//id 입력
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		
		//id pw 출력
		//비번을 가져옴.
		String pw = map.get(id);
		//가져온 비번이 null이면 없는 회원이라고 출력
		if(pw == null) {
			System.out.println("등록되지 않은 아이디입니다.");
			return;
		}
		
		//아니면 아이디, 비번을 출력
		System.out.println("아이디 : " + id + "비번 : " + pw);
	}


}
