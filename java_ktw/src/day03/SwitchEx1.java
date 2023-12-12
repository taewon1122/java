package day03;

public class SwitchEx1 {

	//Switch 예제
	public static void main(String[] args) {
		/* 정수가 0인지 아닌지 판별하는 예제 */
		int num = 10;
		
		//num == 0같은 조건식이 아님
		//특정값과 비교할 때 사용
		switch(num) {
		case 0:
			System.out.println("0입니다.");
			break;
		default:
			System.out.println(num + "는 0이 아닙니다.");
		}
		
	}

}
