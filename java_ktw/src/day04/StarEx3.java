package day04;

public class StarEx3 {

	public static void main(String[] args) {
		/*    * i=1 / *=1 / ' ' = 4번
		 *   ** i=2 / *=2 / ' ' = 3번
		 *  *** i=3 / *=3 / ' ' = 2번
		 * **** i=4 / *=4 / ' ' = 1번
		  ***** i=5 / *=5 / ' ' = 0번
		 *					' ' = 5-i    
		 *
		 */

		/*
		스페이스바 띄워줘야함
		4
		3
		2
		1
		*/
		
		//왜 안되지
		
		
		int rows = 5;
		for(int i = 1 ; i <= rows ; i++) {
			// ' '을 5-i개 출력
			for(int j = 1 ; j <= rows - i ; j++) {
				System.out.print(' ');
			}
			
			// *을 i개 출력 j 재선언
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			
			// 엔터
			System.out.println();
		}
		
	}

}
