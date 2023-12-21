package day10.word;

import java.util.Scanner;

public class WordMain {
	/* 영어 단어장 프로그램을 만드세요
	 * 기능제한
	 * 
	 * 1. 기능정리
	 * 	메뉴
	 * 	1. 단어 목록
	 *  2. 단어 등록
	 *  3. 프로그램 종료
	 *  메뉴 선택 : 1
	 * 단어 목록
	 *  1. 등록된 전체 단어 목록
	 *  2. 암기한 단어 목록
	 *  3. 미암기 단어 목록
	 *  4. 돌아가기
	 *  메뉴 선택 : 1
	 * 등록된 전체 단어 목록 
	 *  영어단어 출력
	 *  영어단어 뜻 출력
	 *  암기 체크
	 *  현재 작성된 메모 출력
	 *  메모 입력 및 수정
	 *  목록에서 삭제
	 *  돌아가기
	 * 단어목록
	 *  1. 등록된 전체 단어 목록
	 *  2. 암기한 단어 목록
	 *  3. 미암기 단어 목록
	 *  4. 돌아가기
	 *  메뉴 선택 : 2
	 * 암기한 단어 목록
	 *  전체 단어 목록에서 체크된 단어 출력
	 *  현재 작성된 메모 출력
	 *  입력된 메모 입력 및 수정
	 * 단어목록
	 *  1. 등록된 전체 단어 목록
	 *  2. 암기한 단어 목록
	 *  3. 미암기 단어 목록
	 *  4. 돌아가기
	 *  메뉴 선택 : 3
	 * 미암기한 단어 목록
	 *  전체 단어 목록에서 체크안된 단어 출력
	 *  현재 작성된 메모 출력
	 *  입력된 메모 입력 및 수정
	 * 단어목록
	 *  1. 등록된 전체 단어 목록
	 *  2. 암기한 단어 목록
	 *  3. 미암기 단어 목록
	 *  4. 돌아가기
	 *  메뉴 선택 : 4
	 * "돌아가기"
	 *  메뉴
	 * 	1. 단어 목록
	 *  2. 단어 등록
	 *  3. 프로그램 종료
	 *  메뉴 선택 : 2
	 * 단어 등록
	 *  영어단어 입력
	 *  뜻 입력
	 *  영어단어 : asdf
	 *  뜻 : asdf
	 *  등록되었습니다
	 * 메뉴
	 * 	1. 단어 목록
	 *  2. 단어 등록
	 *  3. 프로그램 종료
	 *  메뉴 선택 : 3
	 *  프로그램 종료
	 * 2. 틀 작성
	 *
	 * 3. 필요한 메서드 구현
	 * 
	 */
	private static Scanner scan = new Scanner(System.in);
	private static Word [] wordList = new Word[10];
	public static void main(String[] args) {
		
		int menu = 0;
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴 실행
			runMenu(menu);			
		}while(menu == 3);
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			//단어 등록
			wordResister();
			break;
		case 2:
			//단어 수정
			updateword();
			break;
		case 3:
			//단어 검색
			serchWord();
		case 4:
			//단어 삭제
			deleteWord();
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못 선택된 메뉴");			
		}
		
	}


	private static void deleteWord() {
		//단어 삭제
		
	}

	private static void serchWord() {
		//단어 검색
		
	}

	private static void updateword() {
		//단어 수정
	}

	private static void wordResister() {
		//영어 입력
		System.out.println("영어 입력 : ");
		String word = scan.next();
		//뜻 입력
		scan.nextLine();
		System.out.println("뜻 입력 : ");
		String meaning = scan.nextLine();
		//단어장 인스턴스 생성
		
		//단어장 인스턴스 count번째에 단어 저장
		
		//count 1증가
		//단어장에 추가
		
		
	}
	
	private static void printMenu() {
		System.out.println("---------------------");
		System.out.println("메뉴");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 검색");
		System.out.println("4. 단어 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("---------------------");
		System.out.print("메뉴 선택 : ");
	}

}
