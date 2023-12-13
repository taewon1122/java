package day04_test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// q를 입력하기 전까지 문자를 입력하면 입력받은 무자를 출력하는 예제
				// 반드시 한번은 작동해야함면 do while 사용
		
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.println("문자 입력 : ");
			ch = scan.next().charAt(0);
			System.out.println("문자 : " + ch);
			
		}while(ch != 'q');

	}

}
