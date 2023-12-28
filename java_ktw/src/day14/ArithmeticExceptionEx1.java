package day14;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx1 {

	public static void main(String[] args) {
		//두 정수와 산술 연산자를 입력받아 산술연산하는 코드를 작성하세요.
		//단, 0으로 나눌 때 예외처리를 적용
		
		try {
			System.out.print("두 정수 입력 : ");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.print("연산자 입력 : ");
			char op = scan.next().charAt(0);
			double res = 0;
			
			switch(op) {
			case '+': res = a + b; break;
			case '-': res =  a - b; break;
			case '*': res =  a * b; break;
			case '/': res = a / b; break;
			case '%': res = a % b; break;
			}
			//괄호 실수 있었는데 예외에 messagformat 쪽에서 오류가 나있었음.
			String pattern = "{0} {1} {2} = {3}";
			System.out.println(MessageFormat.format(pattern, a,op,b,res));
			
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("입력을 잘 못했습니다.");
		}
	}
	
}
