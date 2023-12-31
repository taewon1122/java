package day10.word;

import java.util.Scanner;

import day09.board.Board;

public class WordMainT {
	
	private static Scanner scan = new Scanner(System.in);
	private static WordT [] list= new WordT[10];//단어장
	private static int count = 0; //저장된 단어 개수
		
	/* 영어 단어장 프로그램을 만드세요
	
	 * 1. 기능정리
	 * - 단어는 영어 단어와 한글 뜻으로 구성
	 * - 영어 단어는 영어이고, 공백이 없는 단어
	 * - 한글 뜻은 한글이고, 한 문장으로 되어 있다.
	 * - 한 단어에 뜻이 한개만 있다고 가정
	 * - 기능
	 *  - 단어 등록
	 *  - 단어 검색
	 *  - 단어 수정
	 *  - 단어 삭제
	 * - Word 클래스
	 * 	- word : 영단어
	 *  - meaning : 뜻
	 *  - 단어 출력, 단어 수정, 단어 확인 : 주어진 문자열과 같은 단어인지
	 * 2. 를 작성
	 * 	
	 * 3. 필요한 메서드 구현
	 * 
	 */
	
	public static void main(String[] args) {
		int menu;
		//반복문
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴에 맞는 기능 실행
			runMenu(menu);
		}while(menu != 5);
	}
	public static void runMenu(int menu) {
		switch(menu) {
		case 1:
			//단어 등록기능 구현
			insetWord();
			break;
		case 2:
			//단어 검색기능 구현
			searchWord();
			break;
		case 3:
			//단어 수정기능 구현
			updateWord();
			break;
		case 4:
			//단어 삭제기능 구현
			deleteWord();
			break;
		case 5:
			System.out.println("프로그램 종료!");
			break;
		default :
			System.out.println("잘못된 메뉴를 선택했습니다.");
		}
	}
	
	public static void deleteWord() {
		//삭제할 단어 입력
		System.out.print("삭제할 단어 :");
		String word = scan.next();
		
		//단어장에서 단어를 삭제
		//삭제할 위치를 찾음
		int index = -1;
		//반복문 : 저장된 개수만큼
		for(int i = 0; i<count; i++) {
			//입력한 단어와 같으면
			if(list[i].equals(word)) {
				//현재 위치를 index에 저장
				index = i; //음수로 초기화. 배열의 번지는 0이상
				break;
			}
		}
		
		//일치하는 단어가 없으면
		if(index == -1) {
			//안내문구 출력 후 종료
			System.out.println("일치하는 단어가 없습니다.");
			return;
		}
		//저장된 단어의 개수를 1줄임
		count--;
		System.out.println("삭제 완료");
		//일치하는 단어가 마지막 단어이면
		if(index == count) {
			//종료
			return;
		}
		//한 칸씩 당겨오기
		//현재 배열과 같은 크기의 새 배열을 생성
		WordT[] tmpList = new WordT[list.length];
		//새 배열에 현재 배열을 복붙
		System.arraycopy(list, 0, tmpList, 0, list.length);
		//현재 배열에서 index + 1번지부터 단어가 있는 마지막 번지까지
		//복사해서 새 배열에 index번지부터 복붙
		System.arraycopy(tmpList, index + 1, list, index, count-index);
		
	}	
	public static void searchWord() {
		scan.nextLine();
		//검색할 단어 입력
		System.out.print("검색할 단어 :");
		String m = scan.nextLine();
		//단어장에서 검색해서 결과를 출력
		//반복문 : 저장된 개수만큼
		for(int i = 0; i < count; i++) {
			//단어장에 단어가 주어진 단어와 일치하면
			//m.equals((list)[i].getMeaning()) || m.equals((list)[i].getWord())
			if(list[i].equals(m)) {
				//출력 후 종료
				list[i].printWord();			
				return;
			}
		}
		//단어가 없다고 출력
		System.out.println("일치하는 단어가 없습니다.");
	}
	
	public static void updateWord() {
		//단어와 뜻을 입력
		System.out.print("단어 : ");
		String word = scan.next();
		scan.nextLine();
		System.out.print("의미 : ");
		String meaning = scan.next();
		//반복문 : 저장된 개수만큼
		for(int i = 0; i<count; i++) {
			//입력한 단어와 단어가 같으면
			if(list[i].equals(word)) {
				//뜻을 수정하고 종료
				list[i].update(meaning);
				System.out.println("단어가 수정되었습니다.");
				return;
			}
		}
		System.out.println("일치하는 단어가 없습니다.");
	}
		
	public static void insetWord() {
		//단어와 뜻 입력
		System.out.print("영어단어 : ");
		//띄어쓰기 없는 문자열이라서 scan.next(); 씀
		String word = scan.next();
		System.out.print("뜻 : ");
		//엔터처리
		scan.nextLine(); 
		String meaning = scan.nextLine();
		
		//단어와 뜻을 이용하여 word의 인스턴스를 생성
		WordT tmp = new WordT(word, meaning);
		//위에서 생성한 인스턴스를 단어장에 저장 저장
		list[count] = tmp;
		//저장된 단어의 갯수를 1증가
		count++;
		
		
		//테스트용으로 단어장 목록 출력
		for(int i = 0; i<count; i++) {
			list[i].printWord();
		}
		
		
		//단어장이 꽉 차면 단어장 크기를 늘림
		if(count == list.length) {
			expandWordList();
		}
	}
	
	public static void expandWordList() {
		//기존 단어장보다 큰 새 단어장 생성
		WordT[] tmpList = new WordT[list.length + 10];
		//새 단어장에 기존 단어들을 복붙
		System.arraycopy(list, 0, tmpList, 0, count);
		//새 단어장을 내 단어장이라고 선언
		list = tmpList;
	}
	public static void printMenu() {
		System.out.println("---------------------");
		System.out.println("메뉴");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 삭제");
		System.out.println("5. 종료");
		System.out.println("---------------------");
		System.out.print("메뉴 선택 : ");	
	}
	
}
