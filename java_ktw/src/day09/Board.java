package day09;

import java.util.Scanner;
/*
 *  1. 게시글 목록 조회
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
 */
/*
	정보 :번호, 제목, 내용, 일자, 아이디, 조회수

	기능 :
	입력내용 출력 및 저장
	
	게시글정보를 출력(목록조회)
	
	게시글 정보를 출력(상세조회
	
	getter와 setter
	
	게시글 수정기능
	
	생성자 : 게시글 번호, 제목, 내용, 작성자, 게시일이 주어진 생성자
 	
 	
*/
public class Board {
	//정보 :번호, 제목, 내용, 일자, 아이디, 조회수
	private int num, views;
	private String title, contents, date, writer;
	Scanner scan = new Scanner(System.in);
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	//기능
	/** 게시글 목록에서 게시글 정보를 출력하는 메서드
	 *  번호, 제목, 작성일, 작성자 조회수 순으로 출력
	 */
	public void printInfo() {	
		System.out.print(num + ". ");
		System.out.print(title + " ");
		System.out.print(date + " ");
		System.out.print(writer + " ");
		System.out.print(views + "\n");
	}
	/** 게시글 상세에서 게시글 정보를 자세히 출력하는 메서드
	 * 번호 : 2
	 *  제목 : 가입인사
	 *  내용 : 안녕하세요
	 *  일자 : 2023-12-20
	 *  작성자 : asd
	 *  조회수 : 2
	 *  순으로 출력
	 */
	public void printInfoDetail() {
		System.out.println("번호 : " + num + " ");
		System.out.println("제목 : " + title + " ");
		System.out.println("내용 : " + contents + " ");
		System.out.println("작성일자 : " + date + " ");
		System.out.println("작성자 : " + writer + " ");
		System.out.println("조회수 : " + views);
		System.out.println();
	}
	
	/**수정할 제목과 내용이 주어지면 게시글의 제목과 내용을 수정하는 메서드
	 * @param title1 수정할 제목
	 * @param contents1 수정할 내용
	 */
	public void update(String title1, String contents1) {
		title = title1;
		contents = contents1;
	}
	//생성자
	public Board(int num, String title, String contents, String writer, String date) {
		super();
		this.num = num;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.date = date;
	}
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	public void boardTitle(){
		System.out.print("제목 입력 : ");
		title = scan.next();
		this.title = title;
	}
	
	public void boardcontents(){
		System.out.print("내용 입력 : ");
		contents = scan.next();
		this.contents = contents;
	}
	
	public void boardDate(){
		System.out.print("날짜 입력 : ");
		date = scan.next();
		this.date = date;
	}
	
	public void boardId(){
		System.out.print("ID 입력 : ");
		id = scan.next();
		this.id = id;
	}
	*/
	
	
	
}
