package day14;

import java.text.MessageFormat;
import java.util.Scanner;

public class ArithmeticExeptionEx2 {

	public static void main(String[] args) {
		//두 정수와 산술연산자를 입력받아 종료를 출력하는 메서드를 구현하세요.
		//단, 메서드를 이용, throws와 throw를 이용
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("두 정수 입력 : ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.print("연산자 입력 : ");
			char op = scan.next().charAt(0);
			double res = calculate(a, op, b);
			String pattern = "{0} {1} {2} = {3}";
			System.out.println(MessageFormat.format(pattern, a,op,b,res));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static double calculate(int a, char op, int b) throws RuntimeException{
		switch(op) {
		case '+': return a + b;
		case '-': return a - b;
		case '*': return a * b;
		case '%': 
			if(b == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return a % b; 
		case '/':
			if(b == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return a / (double)b;
		default:
			throw new RuntimeException(op + "는 산술 연산자가 아닙니다.");
		}
	}
}
