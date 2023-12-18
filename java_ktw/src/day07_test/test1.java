package day07_test;

public class test1 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		//아래 num1, num2의 순서에따라 sum에 선언한 매개변수 순서로 적용됨
		//num1 = a, num2 = b
		//즉 메서드의 매개변수 이름은 main의 이름과는 상관없고
		//main에서 메서드명과 매개변수가 값에 영향을 준다.
		int result = sum(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + result);

	}
	/* 두 정수의 합을 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, num2 X int num1, int num2 O
	 * 리턴타입 : 정수의 합 => 정수 => int
	 * 메서드명 : sum, 카멜표기법을 따름
	 */
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
}
