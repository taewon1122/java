package day04;

import java.util.Scanner;

public class RockPaperScissorEX2 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 가위, 바위, 보 게임 프로그램을 작성하세요.
		 * 1. 새게임
		 * 2. 기록
		 * 3. 프로그램 종료
		 * 
		 * - 새게임
		 *  - 컴퓨터가 랜덤으로 내는 가위, 바위, 보와 내가 입력한 가위, 바위, 보를
		 *    비교하여 이기면 승, 지면 패, 비기면 무로 기록함
		 *  - 바위 : R, 보 : P, 가위 : S
		 * - 기록
		 *  - 승 무 패를 순서대로 출력
		 */
		Scanner scan = new Scanner(System.in);
		int menu;
		
		do {
			//메뉴 출력
			System.out.println("-----------------");
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 기록확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("-----------------");
			System.out.println("메뉴 선택 : ");
			//메뉴 선택
			menu = scan.nextInt();
			//선택 메뉴 동작
			switch(menu) {
			case 1:
				
			case 2:
			
			case 3:
			
			case 4:	
			}
		}while(menu != 3);

	}

}
