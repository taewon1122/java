package day14_test;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		//두 정수와 산술 연산자를 입력받아 산술연산하는 코드를 작성하세요.
		//단, 0으로 나눌 때 예외처리를 적용
		//두 정수와 산술연산자를 입력받아 종료를 출력하는 메서드를 구현하세요.
				//단, 메서드를 이용, throws와 throw를 이용
		
			Scanner scan = new Scanner(System.in);
			System.out.println("정수, 연산자, 정수 입력 : ");
			try {
			int num1 = scan.nextInt();
			char op = scan.next().charAt(0);
			int num2 = scan.nextInt();
			//res에 받아준다.
			double res = calculate(num1, op, num2);
			String pattern = "{0} {1} {2} = {3}";
			System.out.println(MessageFormat.format(pattern, num1,op,num2));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
	}
	public static double calculate(int num1, char op, int num2) throws RuntimeException{
		//break 안써줘서 맨마지막에 나누기까지 계속 내려가서 값 이상하게 나옴
		switch(op) {
		case '+': return num1 + num2;
		case '-': return num1 - num2;
		case '*': return num1 * num2;
		case '%':
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return num1 % num2;
		case '/':
			if(num2 == 0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return num1 / (double)num2;
		default:
			throw new RuntimeException(op + "산술 연산자가 아닙니다");
		}
	}
		
}

