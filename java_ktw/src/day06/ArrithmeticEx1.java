package day06;

import java.util.Scanner;

public class ArrithmeticEx1 {

	public static void main(String[] args) {
		/* 랜덤으로 산수(+,-,*) 문제를 생성하여 맞추는 게임
		 * 단, 숫자범위는 1~99, 연산자는 +,-,*
		 * 1 + 2 = 3(입력된 값)
		 * 정답입니다.
		 * 
		 * 2 * 3 = 5
		 * 틀렸습니다.
		 */
		
		//스캐너
		
		
			//최소 최대 범위 정하기
			//랜덤 숫자(num) 2개 생성
			//랜덤연산 1~3중 하나가 나온다면 ? + - *
				//최소 최대 범위 정하기(1~3)
				//+ - *값중 하나가 나오게 하기
				//랜덤 산수(operator) 생성
			//랜덤숫자 1 + 연산자 + 랜덤숫자 2 switch문으로
				//switch
				//case + - *
				//랜덤숫자 1 + 연산자 + 랜덤숫자 2 하고
				//만약에 정답일시 "정답입니다." 출력 아닐시 "틀렸습니다"출력
		
		Scanner scan = new Scanner(System.in);
		int num;
		int num1Min = 1, num1Max = 99;
		int num1 = (int)(Math.random()*(num1Max - num1Min + 1) + num1Min);
		int num2Min = 1, num2Max = 99;
		int num2 = (int)(Math.random()*(num2Max - num2Min + 1) + num2Min);
		int operMin = 1, operMax = 3;
		int operator = (int)(Math.random()*(operMax - operMin + 1) + operMin);
		
		switch(operator) {
		case 1:
			System.out.println(num1 + " + " + num2 + " = ");
			num = scan.nextInt();
			System.out.println(num1 + " + " + num2 + " = " + num);
			if(num1 + num2 == num) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = ");
			num = scan.nextInt();
			System.out.println(num1 + " - " + num2 + " = " + num);
			if(num1 - num2 == num) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
			break;
		default:
			System.out.println(num1 + " * " + num2 + " = ");
			num = scan.nextInt();
			System.out.println(num1 + " * " + num2 + " = " + num);
			if(num1 * num2 == num) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
			
			
		}
		scan.close();
			
	}

}
