package day04;

public class PrimeNumberEx1 {

	public static void main(String[] args) {
		/* 2부터 100사이의 모든 소수를 출력하는 코드를 작성하세요.
		 * 소수 판별 예제 이용
		 * 반복횟수	: num는 2부터 100까지 1씩 증가
		 * 규칙성		: num가 소수이면 num를 출력
		 * 
		 */
		
		
		//num가 소수이면 num를 출력하는 예제
		/*
		int num = 3;
		int count, i;
		for( i = 1, count = 0; i <= num ; i++) {
			if(num % i == 0) {
				++count;
			}
		}
		//약수가 두개이면
		if(count == 2) {
			System.out.println(num);
		}
		*/
		for(int num = 2 ; num <= 100 ; num++) {
			int count = 0, i;
			for( i = 1 ; i <= num ; i++) {
				if(num % i == 0) {
					++count;
				}
			}
			//약수가 두개이면
			if(count == 2) {
				System.out.print(num + " ");
			}
		}
		
		
	}

}
