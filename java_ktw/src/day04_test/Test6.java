package day04_test;

public class Test6 {

	public static void main(String[] args) {
		/*     *		i=1 *=1 ' '=4
		 *    ***		i=2 *=3 ' '=3
		 *   *****		i=3 *=5 ' '=2
		 *  *******		i=4 *=7 ' '=1
		 * *********	i=5 *=9 ' '=0
		 * 				 * = 2*i-1  ' '=5-i
		 */
		
		
		int row = 5;
		//5줄~
		for(int i = 1 ;i <= 5 ;i++ ) {
			//' '가 하나씩 줄어들어 = 4 3 2 1 0
			for(int j = 1 ;j <= row -i ;j++) {
				System.out.print(' ');	
			}
			// *찍는데 1 3 5 7 9 = 2 * i - 1
			for(int j = 1 ;j <= 2*i-1 ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		int rows = 5;
		for(int i = 1 ;i <= rows ;i++ ) {
			for(int j = 1; j <= rows - i ; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= i-1 ; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
