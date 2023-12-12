package day02;

import java.util.Scanner;

public class ifMultiple {

	
	public static void main(String[] args) {
		//정수를 입력받아 3의 배수인지 아닌지 판별하는 코드를 작성하세요.
		//정수를 3으로 나누었을 때 나머지가 0과 같다면 3의 배수
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		if(num == 0) {

			System.out.println(num + "는 0입니다.");
		} else if(num % 3 == 0) {
			System.out.println(num + "는 3의 배수입니다.");
			
		}else if(num % 3 == 0){
			System.out.println(num + "는 3의 배수 입니다.");

		}else {
			System.out.println(num + "는 3의 배수가 아닙니다.");
		}
		
		scan.close();
		
	}

}
