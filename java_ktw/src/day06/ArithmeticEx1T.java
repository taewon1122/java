package day06;

import java.util.Scanner;

public class ArithmeticEx1T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Min = 1, Max = 99;
		//정수1을 랜덤으로 생성 - 1~99
		int num1 = (int)(Math.random()*(Max - Min + 1) + Min);
		//정수2를 랜덤으로 생성 - 1~99
		int num2 = (int)(Math.random()*(Max - Min + 1) + Min);
		//정수3(연산자)를 랜덤으로 생성 - 1~3		
		int op= (int)(Math.random()*3 + 1);
		Scanner scan = new Scanner(System.in);
		int user, answer;
		switch(op) {
		//연산자가 1과 같다면
		case 1:
			//정수1 + 정수2 = 을 콘솔에 출력
			System.out.print(num1 + " + " + num2 + " =");
			//정답을 입력
			user = scan.nextInt();
			//입력받은 정답과 정수1 + 정수2가 같으면 정답이라고 출력
			answer = num1 + num2;
			if(user == answer) {
				System.out.println("정답입니다.");
			}else {
				//아니면 틀렸다고 출력
				System.out.println("틀렸습니다.");
			}
			break;
			//연산자가 2이면
		case 2:
			//정수1 - 정수2 = 을 콘솔에 출력
			System.out.print(num1 + " - " + num2 + " =");
			//정답을 입력
			user = scan.nextInt();
			//입력받은 정답과 정수1 + 정수2가 같으면 정답이라고 출력
			answer = num1 - num2;
			if(user == answer) {
				System.out.println("정답입니다.");
			}else {
				//아니면 틀렸다고 출력
				System.out.println("틀렸습니다.");
			}
			break;
			//연산자가 3이면
		case 3:
			//정수1 * 정수2 = 을 콘솔에 출력
			System.out.print(num1 + " * " + num2 + " =");
			//정답을 입력
			user = scan.nextInt();
			//입력받은 정답과 정수1 + 정수2가 같으면 정답이라고 출력
			answer = num1 * num2;
			if(user == answer) {
				System.out.println("정답입니다.");
			}else {
				//아니면 틀렸다고 출력
				System.out.println("틀렸습니다.");
			}
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
		scan.close();
		
	}

}
