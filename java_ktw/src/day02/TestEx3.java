package day02;

//ctrl + shift + O -> 자동 import
import java.util.Scanner;

public class TestEx3 {
	
	
	public static void main(String[] args) {
		//정수를 입력받아 0인지, 양수인지, 음수인지 판별하는 코드를
		//작성하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		
		if(num1 == 0) {
			System.out.println("0입니다.");
		}else if(num1 > 0) {
			System.out.println(num1 + "는 양수입니다.");
		}else {
			System.out.println(num1 + "는 음수입니다.");
		}
		
		scan.close();
	
		

	}

}
