package day03;

import java.util.Scanner;

public class RoofEx1 {

	public static void main(String[] args) {
		//문자를 입력받아 입력받은 문자를 출력하고, q를 입력하면 종료하는 예제
		Scanner scan = new Scanner(System.in);
		// ch = 'a'를 선언한 이유는 초기화를 하지 않으면 뒤에 다른값과 비교를 할수가 없기때문에 비교를 하기 위한 아무런 값으로 선언함
		char ch = 'a';
		for( ; ch != 'q' ; ) {
			System.out.print("입력 : ");
			ch = scan.next().charAt(0);
			System.out.println("문자 : " + ch);
		}
		
		scan.close();
	}

}
