package day05;

import java.util.Scanner;

public class CountEx1Teacher {

	public static void main(String[] args) {
		/* 1에서 9사이의 정수를 5개 입력받아 각 숫자가 몇개씩 입력됐는지 출력하는 코드를 작성하세요.
		 * 1 2 3 1 2
		 * 1 : 2
		 * 2 : 2
		 * 3 : 1
		 * 4 : 0
		 * 5 : 0
		 * 6 : 0
		 * 7 : 0
		 * 8 : 0
		 * 9 : 0
		 */
		//5개짜리(입력한 수를 저장하는 배열 - user)과
		//10개짜리 배열(각 숫자가 몇개 입력됐는지 저장하는 배열-count) 선언
		int user[] = new int[5];
		//10개짜리를 만들고 0번지 안씀
		int count[] = new int[10];
	
		//반복문으로 5개의 정수를 입력받아 user에 저장하고, count배열에 입력받은 정수번지에 해당하는 숫자를 1증가시킴
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 5개를 입력하세요(1~9) : ");
		for(int i = 0; i < user.length; i++) {
			user[i] = scan.nextInt();
			count[user[i]]++;
		}
		
		//count배열에 있는 값을 1번지부터 9번지까지 출력
		for(int i = 1; i < count.length; i++) {
			System.out.println(i + " : " + count[i]);
		}

	}

}
