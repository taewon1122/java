package day03;

public class GcdEx1 {

	public static void main(String[] args) {
		/* 정수의 약수를 출력하는 예제를 작성하세요.
		 * 약수는 나누어서 떨어지는 수
		 * 4의 약수는 1, 2, 4
		 */
	
		/*
		 * num가 1씩 증가하면서 i를 나눈다
		 * i % num == 0이면 i의 약수
		 * 출력
		 */
		/*
		int i = 4;
		int num;
		for(num = 0 ; i % num != 0 ; ++num) {
			if(i % num != 0) {
				continue;
			}else {
				System.out.println(num);
			}
			
		}
		
		///
		int num = 4;
		
		
		System.out.print(num + "의 약수 : ");
		for(int i = 1; i <= num ; i++) {
			if(num % i == 0) {
				System.out.print(i+ (i == num?"\n":", "));
			}
		}
		*/
		
		int num = 4;
		System.out.print(num + "의 약수 : ");
		for(int i = 1; i <= 4; i++) {
			if(num % i == 0) {
				System.out.print(i + (i == num?"\n":", "));
			}
		}
		
	}

}
