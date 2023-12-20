package day09.board;

import java.util.Scanner;

public class BoardMainTest {
	static private Scanner scan = new Scanner(System.in);
	/* 게시판에서 게시글 관리를 위한 콘솔 프로그램 작성하세요
	 * - 제한사항 정리
	 * 	- 게시판은 1개
	 * 	- 로그인, 회원가입 구현 X => 게시글 작성 시 아이디를 입력
	 *  - 게시글 제목과 내용은 한 줄만 가능
	 *  - 작성일을 입력
	 * 1. 필요한 기능을 정리해서 메뉴로 출력
	 * 메뉴
	 * 	1. 게시글 목록 조회
	 * 	2. 게시글 등록
	 *  3. 프로그램 종료
	 *  메뉴 선택 : 1
	 * 게시글 목록
	 *  2. 가입인사 2023-12-20 asd 1
	 * 	1. 공지 2023-12-19 admin 3
	 * 메뉴 
	 * 	1. 게시글 상세 조회
	 * 	2. 게시글 수정
	 *  3. 게시글 삭제
	 *  4. 뒤로가기
	 *  메뉴 선택 : 1
	 *  조회할 게시글 번호 : 2
	 *  번호 : 2
	 *  제목 : 가입인사
	 *  내용 : 안녕하세요
	 *  일자 : 2023-12-20
	 *  작성자 : asd
	 *  조회수 : 2
	 * 게시글 목록
	 *  2. 가입인사 2023-12-20 asd 1
	 * 	1. 공지 2023-12-19 admin 3
	 * 메뉴 
	 * 	1. 게시글 상세 조회
	 * 	2. 게시글 수정
	 *  3. 게시글 삭제
	 *  4. 뒤로가기
	 *  메뉴 선택 : 2
	 *  수정할 게시글 번호 : 2
	 *  제목 : 가입인사입니다.
	 *  내용 : 만나서 반갑습니다.
	 *  수정이 완료됐습니다.
	 * 게시글 목록
	 *  2. 가입인사입니다. 2023-12-20 asd 2
	 * 	1. 공지 2023-12-19 admin 3
	 * 메뉴 
	 * 	1. 게시글 상세 조회
	 * 	2. 게시글 수정
	 *  3. 게시글 삭제
	 *  4. 뒤로가기
	 *  메뉴 선택 : 3
	 *  삭제할 게시글 번호 : 1
	 *  게시글이 삭제됐습니다.
	 * 게시글 목록
	 *  2. 가입인사입니다. 2023-12-20 asd 2
	 * 메뉴 
	 * 	1. 게시글 상세 조회
	 * 	2. 게시글 수정
	 *  3. 게시글 삭제
	 *  4. 뒤로가기
	 *  메뉴 선택 : 4
	 * 메뉴
	 * 	1. 게시글 목록 조회
	 * 	2. 게시글 등록
	 *  3. 프로그램 종료
	 *  메뉴 선택 : 2
	 *  제목 : 테스트
	 *  내용 : 테스트
	 *  일자 : 2023-12-20
	 *  아이디 : qwe
	 *  등록이 완료됐습니다.
	 * 메뉴
	 * 	1. 게시글 목록 조회
	 * 	2. 게시글 등록
	 *  3. 프로그램 종료
	 *  메뉴 선택 : 1
	 * 게시글 목록
	 * 	3. 테스트 2023-12-20 qwe 0
	 *  2. 가입인사입니다. 2023-12-20 asd 2 
	 * 메뉴 
	 * 	1. 게시글 상세 조회
	 * 	2. 게시글 수정
	 *  3. 게시글 삭제
	 *  4. 뒤로가기
	 *  메뉴 선택 : 4
	 */
	public static void main(String[] args) {
		
		//반복문
		
		//메뉴 출력
		printMenu();
		//메뉴 선택
		int menu = scan.nextInt();
		//선택한 메뉴 실행
		
		//반복문
			/* 메뉴
			 * 	1. 게시글 목록 조회
			 * 	2. 게시글 등록
			 *  3. 프로그램 종료
			 *  메뉴 선택 : 1
			 */
	}

	private static void printMenu() {
		System.out.println("-----------------");
		System.out.println("메뉴");
		System.out.println("1. 게시글 목록 조회");
		System.out.println("2. 게시글 등록");
		System.out.println("3. 프로그램 종료");
		System.out.println("-----------------");
		System.out.println("메뉴 선택 : ");
	}

}
