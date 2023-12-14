package day05_test;

import java.util.Scanner;

public class test5 {

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
		int user[] = new int[5];
		int count[] = new int[10]; // user에 정수가1-9가 각 몇개씩 있는지 count 0은 사용하지 않음
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수 입력 : ");
		for(int i = 0 ;i <user.length ;i++ ) {
			user[i] = scan.nextInt();
			count[user[i]]++;
			//여기서는 user가 입력한 값을 i에 저장하고
			//count배열에 user[i] = 정수갯수 카운트, 즉 12312면 1 : 2, 2 : 2, 3 : 1처럼 1이들어갔다 그럼 1을 증가시켜줘 그게 ++역할	
		}
		//그러면 이제 count에 1-9까지 증가된거 카운트해주는걸 출력해줘
		//i가 1 이면 count[i] 1번지에 들어있는 1의 증가된 값 출력
		for(int i = 1 ;i < count.length ;i++ ) {
			System.out.println(i + " : " + count[i]);
		}
		scan.close();
	}

}
