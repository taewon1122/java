package day04;

public class GcdEx2 {

	public static void main(String[] args) {
		/* 두 정수의 공약수를 출력하는 코드를 작성하세요.
		 * 약수	: 나누어서 떨어지는 수
		 * 공약수	: 공통으로 있는 약수
		 * 12의 약수	: 1, 2, 3, 4, 6, 12
		 * 8의 약수 : 1, 2, 4, 8
		 * 8과 12의 공약수 : 1, 2, 4
		 * 반복회수	:i는 1부터 num1까지
		 * 규칙성		:i가 num1의 약수이고, i가 num2의 약수이면 i를 출력
		 * 			=> num1을 i로 나누었을 때 나머지가 0과 같고,
		 * 			   num2를 i로 나누었을 때 나머지가 0과 같다면 i를 출력
		 */

		//두 정수 a, b
		//약수 = a % i == 0
		//공약수 a % i == 0 && b % i == 0
		
		int num1 = 12;
		int num2 = 8;
		
		int i;
		//알림창 한줄 + 한줄안에 값 다 나오게 하려면 for문앞에 sysout
		System.out.print(num1 + "과 " + num2 + "의 공약수 : ");
		for(i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				//i 출력, i가 num2랑 같다는 조건 : 같을때 다음줄로 다를때 쉼표 스페이스;
				System.out.print(i + (i >= num1?"\n":", "));
			}
			
		}
		/* 선생님
		 * int num1 = 8, num2 = 12;
		 * System.out.print(num1 + "과 " + num2 + "의 공약수 : ");
		 * for( int i = 1; i <= num1 ; i++ ){
		 * 		if(num1 % i == 0 && num2 % i == 0) {
		 * 			//마지막 숫자가 어떤숫자인지 모르기 때문에 1을 기준으로 조건식 만들기. i가 1과 같다면 빈칸, 다르다면 쉼표 스페이스
		 * 			System.out.print((i == 1 ? "" : ", ") + i);
		 * 		}
		 * }
		 */
		
		
	}

}
