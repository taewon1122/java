package day05_test;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		/* 사용자와 컴퓨터가 돌아가면서 최대 3개의 숫자를 부르고,
		 * 31을 입력한 사용자 또는 컴퓨터가 지는 게임을 작성
		 * 예
		 * com : 1 2 3
		 * 정수 : 2 -> 컴퓨터의 3뒤의 2개의 숫자 입력
		 * user : 4 5
		 * com : 6
		 * 정수 : 3
		 * user : 7 8 9
		 * ...
		 * com : 31
		 */
		Scanner scan = new Scanner(System.in);
		int user;
		int count = 0;
		int min = 1, max = 3;
		
		while(count < 32) {
			int com = (int)(Math.random()*(max - min + 1) + min);
			//end선언한다. count와 com을 합친값이 end에 저장
			//1~3중에 숫자 랜덤하게 만들고 count + 랜덤숫자 저장
			int end = count + com;
			//end가 31이라면 31 아니면 end(저장값)
			end = end >= 31 ? 31 : end;
			//아니라서 컴은 : 
			System.out.println("com : ");
			//count + 1은 user가 345 했으면 5가 count에 있는데 다음 숫자를 말해야하기 때문에 + 1
			for(int i = count + 1; i <= end ; i++) {
				//end값보다 작을때까지 i출력
				System.out.print(i + " ");
			}
			System.out.println();
			
			count = end;
			if(count == 31) {
				System.out.println("유저 승!");
				break;
			}
			System.out.println();
			
			
			System.out.println("숫자 입력: ");
			user = scan.nextInt();
			end = count + user;
			end = end >= 31 ? 31 : end;
			System.out.print("user : ");
			for(int i = count+1; i<=end; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			count = end;
			if(count == 31) {
				System.out.println("컴퓨터 승!");
				break;
			}
		}
		//i = 32가 될때까지 반복
		
		//com이 랜덤한 3가지 숫자 출력
		//user 1-3가지 숫자중 하나 입력
		//com이 다음 순서 랜덤하게 1-3가지중 출력
		
	}

}
