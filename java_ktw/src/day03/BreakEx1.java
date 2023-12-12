package day03;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		//문자를 입력해서 입력한 문자를 출력하고, q를 입력하는 종료하는 예제
		Scanner scan = new Scanner(System.in);
		
		char ch = 'a'; //이거 for문에서와 똑같은 이유라서 그런건지 여쭤보기
		while(true) {
			System.out.print("문자입력 : ");
			ch = scan.next().charAt(0);
			System.out.println("문자 : " + ch);
			if(ch == 'q') {
				break;
			}
		}
		
		scan.close();
		
	}
	
}
