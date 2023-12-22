package day11.product;

import java.util.Scanner;

public class ProductMain {
	private static Scanner scan = new Scanner(System.in);
	private static Product [] list = new Product[10];
	private static int count = 0;
		/* 제품을 관리하는 프로그램 구현하세요.
	 * 메뉴
	 * 1. 제품 입고(추가, 수정 기능)
	 *  - 기존제품 추가, 새로운 제품 추가
	 *  - 제품을 판매하기 위해 다른 곳에서 제품을 구매
	 * 2. 제품 판매
	 *  - 입고된 제품을 판매
	 * 3. 제품 수정[가격]
	 * 4. 매출 내역 조회
	 * 5. 종료
	 * 
	 */
	//필요한 변수 : String [] productList = new productList[10]; 제품 저장 / int [] productPrice = new int[productList.length]
	//int [] sum = new int[productPrice];
	//int count = 0;
	
	
	public static void main(String[] args) {
		int menu;
		//반복문
		do {			
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴 실행
			//반복문
			switch(menu) {
			case 1:
				//제품 입고
				productIn();
				break;
			case 2:
				//제품 판매
				sale();
				break;
			case 3:
				//제품 수정
				break;
			case 4:
				//매출 내역 조회
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("잘못 선택된 메뉴");
			}
		}while(menu != 5);
	}

	
	private static void sale() {
		//제품 입력
	    scan.nextLine();
		System.out.print("제품명 : ");
		String product = scan.nextLine();
		//제품 입력
		System.out.print("판매갯수 : ");
		int number = scan.nextInt();
		//입력된 제품이 재고에 있으면
		for(int i = 0; i < count; i++) {
			//product랑 이름이 똑같은게 list에 있으면
			if(list[i].equals(product)) {
				System.out.println("중복된 제품. 입고할 양 입력 : ");
				list[i].sale(number);
			}
		}
		//판매
		
		}


	private static void productIn() {
		//제품명 입력
		scan.nextLine();
		System.out.print("제품명 : ");
		String product = scan.nextLine();
		//반복문
		for(int i = 0; i < count; i++) {
		   //product랑 이름이 똑같은게 list에 있으면
		   if(list[i].getProduct().equals(product)) {
		      //입고량만 추가
		      System.out.println("중복된 제품. 입고할 양 입력 : ");
		      int input = scan.nextInt();
		      //product input에 추가해주기
		      list[i].count += input;
		      break;
		   }
		}
		System.out.print("여기?");
		//입고량 입력
		System.out.print("입고량 : ");
		int number = scan.nextInt();
		//입력받은것을 리스트에 추가
		Product tmp = new Product(product, number);
		
		list[count] = tmp;
		
		count++;
		
		for(int i = 0; i<count; i++) {
		   list[i].printList();
		}		
   }
	
	public static void printMenu() {
		System.out.println("----------------------");
		System.out.println("메뉴");
		System.out.println("1.제품 입고");
		System.out.println("2.제품 판매");
		System.out.println("3.제품 수정");
		System.out.println("4.매출 내역 조회");
		System.out.println("5.프로그램 종료");
		System.out.println("----------------------");
		System.out.println("메뉴 선택 : ");
	}

}
