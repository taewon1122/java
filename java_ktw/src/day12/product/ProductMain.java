package day12.product;

import java.util.Scanner;

public class ProductMain {
	/*
	 * 제품을 추가하는 프로그램을 작성하세요.
	 * 제품은 tv, 에어컨, 컴퓨터만 추가 가능
	 * 공통 : 브랜드, 제품코드, 제품명
	 * TV : 화면크기
	 * 에어컨 : 냉방면적
	 * 노트북 : CPU, 램
	 * 
	 * TV클래스, 에어컨 클래스, 컴퓨터 클래스
	 * Product 클래스
	 * 
	 * 메뉴
	 * 1. 제품 추가
	 * 2. 제품 확인
	 * 3. 종료
	 * 메뉴 선택 : 1
	 * ---------------
	 * 추가할 제품을 선택하세요.
	 * 추가할 제품
	 * 1. TV
	 * 2. 에어컨
	 * 3. 노트북
	 * 제품 선택 : 1
	 * 브랜드 : 삼성
	 * 제품코드 : KQ75QCE1-W1
	 * 제품명 : 2023 QLED 4K QCE1 (189 cm) 풀 모션 슬림핏 벽걸이형
	 * 화면크기(cm) : 189
	 * 등록이 완료됏습니다.
	 * ---------------
	 *  메뉴
	 * 1. 제품 추가
	 * 2. 제품 확인
	 * 3. 종료
	 * 메뉴 선택 : 1
	 * ---------------
	 * 추가할 제품을 선택하세요.
	 * 추가할 제품
	 * 1. TV
	 * 2. 에어컨
	 * 3. 노트북
	 * 제품 선택 : 2
	 * 브랜드 : 삼성
	 * 제품코드 : AF17B6474WSRT
	 * 제품명 : 에어컨 Q9000 (56.9 m2 + 18.7 m2)
	 * 냉방면적(m2) : 56.9
	 * ---------------
	 *  메뉴
	 * 1. 제품 추가
	 * 2. 제품 확인
	 * 3. 종료
	 * 메뉴 선택 : 1
	 * ---------------
	 * 추가할 제품을 선택하세요.
	 * 추가할 제품
	 * 1. TV
	 * 2. 에어컨
	 * 3. 노트북
	 * 제품 선택 : 3
	 * 브랜드 : 삼성
	 * 제품코드 : AF17B6474WSRT
	 * 제품명 : 에어컨 Q9000 (56.9 m2 + 18.7 m2)
	 * 냉방면적(m2) : 56.9
	 */
	static Scanner scan = new Scanner(System.in);
	
	static Product []list = new Product[30];
	
	static int count = 0;
	public static void main(String[] args) {
		
		int menu;
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴 실행
			runMenu(menu);
		}while(menu != 3);
	}
	
	public static void runMenu(int menu) {
		
		switch(menu) {
		case 1:
			//제품 등록
			insertProduct();
			break;
		case 2:
			//제품 확인
			printProduct();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default :
			System.out.println("잘못된 메뉴 선택");
		}
	}
	
	public static void insertProduct() {
		//제품 목록 출력
		productTitle();
		
		//공통 정보
		int select = scan.nextInt();
		scan.nextLine(); //위에서 입력한 엔터 처리
		System.out.print("브랜드 : ");
		String brand = scan.nextLine();
		System.out.print("제품명 : ");
		String title = scan.nextLine();
		System.out.print("상품코드 : ");
		String code = scan.next();
		
		//제품마다 추가 정보 입력
		switch(select) {
		case 1://tv
			System.out.print("화면크기 : ");
			int size = scan.nextInt();
			list[count++] = new Tv(brand, code, title, size);
			break;
		case 2://에어컨
			System.out.print("냉방면적 : ");
			double area = scan.nextDouble();
			list[count++] = new Airconditioner(brand, code, title, area);
			break;
		case 3://노트북
			System.out.print("CPU : ");
			double cpu = scan.nextDouble();
			System.out.print("RAM : ");
			int ram = scan.nextInt();
			list[count++] = new Notebook(brand, code, title, cpu, ram);
			break;
		default:
			System.out.println("잘못된 제품입니다.");
			return;
		}
		System.out.println("등록이 완료됐습니다.");
	}
	
	public static void productTitle() {
		System.out.println("-----------------");
		System.out.println("메뉴");
		System.out.println("1. TV");
		System.out.println("2. 에어컨");
		System.out.println("3. 노트북");
		System.out.println("-----------------");
		System.out.print("메뉴 선택 : ");
	}

	public static void printProduct() {
		if(count == 0)
			System.out.println("등록된 제품이 없습니다.");
		
		for(int i = 0; i<count; i++) {
			list[i].print();
		}
	}
	
	public static void printMenu() {
		System.out.println("-----------------");
		System.out.println("메뉴");
		System.out.println("1. 제품 추가");
		System.out.println("2. 제품 확인");
		System.out.println("3. 종료");
		System.out.println("-----------------");
		System.out.print("메뉴 선택 : ");
	}
}
