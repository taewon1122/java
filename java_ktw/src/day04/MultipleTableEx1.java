package day04;

public class MultipleTableEx1 {

	public static void main(String[] args) {
		/* 구구단 2단부터 9단까지 출력하는 코드를 작성하세요 
		 * 반복회수	: num은 2부터 9까지 1씩 증가
		 * 규칙성		: num단을 출력
		 * */
		
		
		//2단 출력하는 코드를 작성하세요.
		
		//2*1 = 2
		//2*2 = 4
		
		//i 증가
		//num1 * i
		
		//3단으로 바꿀려면 num값 바꿔주면됨.
		//int num = 2;
		//for(int i = 1; i <= 9 ; i++) {
			//System.out.println(num + " X " + i + " = " + (num * i));
		//}
		
		
		for(int num = 2 ; num <= 9 ; num++) {
			System.out.println(num + "단");
			for(int i = 1; i <= 9 ; i++) {
				System.out.println(num + " X " + i + " = " + (num * i));
			}
		}
		
	}

}
