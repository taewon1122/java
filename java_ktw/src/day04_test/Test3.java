package day04_test;

public class Test3 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 공약수 중 가장 큰 공약수
		 * 약수 : 나누어서 떨어지는 수
		 * 공약수	: 공통으로 있는 약수
		 * 12의 약수	: 1, 2, 3, 4, 6, 12
		 * 8의 약수 : 1, 2, 4, 8
		 * 8과 12의 공약수 : 1, 2, 4
		 * 8과 12의 최대 공약수 : 4
		 * 반복횟수	:i는 1부터 num1까지 1씩 증가
		 * 규칙성		:i가 num1과 num2의 약수이면 gcd에 i 저장
		 * 반복문종료후	:
		 */

		//a % i == 0 && b % i == 0
		//i중 가장 큰 값 출력
		
		int num1 = 12;
		int num2 = 8;
		int i;
		int gcd = 0;
		System.out.print(num1 + "과" + num2 + "의 최대공약수 : ");
		for(i = 1 ; i <= num1 ;i++ ){
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;

			}
			
		}
		//for문 밖에서 print해야 맨 마지막에 gcd에 저장된 num1과 num2의 최대공약수가 출력됨.
		System.out.print(gcd + (i >= num1 ? "\n" : ", "));
	}

}
