package day11.product;

import java.util.Scanner;

public class HomeworkEx2 {
	
	/* 두 정수와 산술 연산자를 입력받아 결과를 출력하는 코드를 작성하세요.
	 * 메서드를 생성
	 */
	
	static Scanner scan = new Scanner(System.in);
	static int a;
	static int b;
	static String operator;
	public static void main(String[] args) {
		number();
		generator();
	}

	
	private static void generator() {
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		operator = scan.next();
		switch(operator) {
		case "+":
			System.out.println(a + " + " + b + " = " + (a+b));
			
			break;
		case "-":
			System.out.println(a + " - " + b + " = " + (a-b));
			break;
		case "*":
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
		case "%":
			System.out.println(a + " % " + b + " = " + ((float)a%b));
			break;
		case "/":
			System.out.println(a + " / " + b + " = " + (a/b));
			break;
		default :
			System.out.println("산술 연산자가 아님");
			
		}

	}

	private static void number() {
		System.out.print("정수 2개 입력 : ");
		a = scan.nextInt();
		b = scan.nextInt();
	}

}
