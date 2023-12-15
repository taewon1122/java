package day06;

import java.util.Scanner;

public class ArithmeticEx1T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Min = 1, Max = 99;
		//정수1을 랜덤으로 생성 - 1~99
		int num1 = (int)(Math.random()*(Max - Min + 1) + Min);
		//정수2를 랜덤으로 생성 - 1~99
		int num2 = (int)(Math.random()*(Max - Min + 1) + Min);
		//정수3(연산자)를 랜덤으로 생성 - 0~2
		//str 0번지 - 2번지 선택하게 하려고 변경
		int opNum= (int)(Math.random()*3);
		Scanner scan = new Scanner(System.in);
		int user, answer = 0;
		String str = "+-*"; // 연산자 하나로 묶어버릴려고
		char op = str.charAt(opNum);
		
		System.out.println("" + num1 + op + num2 + "=");
		user = scan.nextInt();
		
		//정답만 계산
		switch(op) {
		//이런식으로 수정도 가능
		case '+': answer = num1 + num2; break;
		case '-': answer = num1 - num2; break;
		case '*':
			answer = num1 * num2;
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
		
		//맞췄는지 틀렸는지
		if(user == answer) {
			System.out.println("정답입니다.");
		}else {
			//아니면 틀렸다고 출력
			System.out.println("틀렸습니다.");
		}
		
		scan.close();
		
	}

}
