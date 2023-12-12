package day03;

public class ForEx2 {

	public static void main(String[] args) {
		/* 1에서 10사이의 짝수들의 합을 구하는 코드를 작성하세요
		 * 반복횟수	: i는 1부터 10까지 1씩 증가한다
		 * 규칙성		: i를 2로 나누었을 때 나머지가 0과 같다면
		 * 			  sum = sum + i를 실행
		 * 반복문종료후	: sum 출력
		 */
		// for문 맨 앞에서 초기화 해야함 필요없음 
		// int i = 10;
		
		//초기화 부분에 i 선언하면 선언된 i는 for문 안에서만 사용할 수 있음. 밖에서 사용하려면 재선언을 해야함
		int sum = 0;
		for(int i = 1 ; i <= 10  ; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 10까지 짝수의 합 : " + sum);
		
	}

}
