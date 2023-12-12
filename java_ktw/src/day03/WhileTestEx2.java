package day03;

public class WhileTestEx2 {

	public static void main(String[] args) {
		/* 5부터 1까지 거꾸로 출력하는 코드를 작성하세요.
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 * 반복회수	: 5가 1이 될때까지 1씩 줄어든다
		 * 규칙성		: 콘솔창에 i 출력
		 * 반복문종료후	: 없음
		 */
		int i = 5;
		int count = 1;
		while(i >= count) {
			System.out.println(i);
			--i;
		}

	}

}
