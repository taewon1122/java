package day03;

public class WhileMultipleTableEx1 {
	
	//WhileMultipleTable 예제
	public static void main(String[] args) {
		/* 구구단 2단을 출력하는 코드를 작성하세요.
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * ...
		 * 2 X 9 = 18
		 * 반복횟수	: i가 9까지 1씩 증가
		 * 규칙성		: 2 X i = 2*i 출력
		 * 반복문종료후	: 없음
		 */
		
		//내가한거
		int i = 1;
		int count = 9;
		while(i <= count) {
			System.out.println(2+ " " + "*" + " " + i + " " + "=" + " " + (2*i));
			++i;
		}
		
		//선생님이 한거	
		int num = 3;
		int ii = 1;
		int count1 = 9;
		while(ii <= count1) {
			System.out.println(num + " " + "X" + " " + ii + " " + "=" + " " + (num * ii));
			++ii;
		}

	}

}
