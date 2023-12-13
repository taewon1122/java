package day04;

public class StarEx4 {

	public static void main(String[] args) {
		/*     *		i=1 *=1 ' '=4
		 *    ***		i=2 *=3 ' '=3
		 *   *****		i=3 *=5 ' '=2
		 *  *******		i=4 *=7 ' '=1
		 * *********	i=5 *=9 ' '=0
		 * 				 * = 2*i-1  ' '=5-i
		 */

		
		int rows = 5;
		for(int i = 1 ; i <= 5 ; i++) {
			//' '출력 5-i 개
			for(int j = 1 ; j <= rows - i; j++) {
				System.out.print(' ');
			}
			//*출력 2*i-1개
			for(int j = 1 ; j <= 2 * i - 1 ; j++) {
				System.out.print("*"); 
			}
			System.out.println();
		} 
		
		//선생님 코드
		int row = 5;
		for(int i = 1; i<=5; i++) {
			//' '출력 5-i개
			for(int j = 1; j<= row - i; j++) {
				System.out.print(' ');
			}
			//*출력 2*i-1개
			for(int j = 1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			//엔터
			System.out.println();
		}
		
		
		/*     *		i=1 *=1 ' '=4
		 *    ** *		i=2 *=3 ' '=3
		 *   *** **		i=3 *=5 ' '=2
		 *  **** ***	i=4 *=7 ' '=1
		 * ***** ****	i=5 *=9 ' '=0\
		 * 			   * = 2*i-1  ' '=5-i
		 */
	
		for(int i = 1 ; i <= 5 ; i++) {
			//*을 i개 출력 후 엔터
			for(int j = 1 ; j <= rows - i ; j++) {
				System.out.print(' ');
			}
			// *을 i개 출력 j 재선언
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			for(int j = 1 ; j <= i-1 ; j++) {
				System.out.print("*");
				
			}	System.out.println();
		}
		
	}

}
