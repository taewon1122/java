package day05;

import java.util.Scanner;

public class ThirtyOneEx1 {

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
		
		//32개짜리 배열 선언 0은 사용x _> me
		// 사용자가 입력할 숫자를 저장할 변수
		Scanner scan = new Scanner(System.in);
		int user;
		
		// 현재 부른 숫자를 저장할 변수 선언 후 0으로 초기화
		int count = 0;
		int min = 1, max = 3;
		//user 정수(num) 입력받는다. com이 숫자 출력하면 랜덤한 숫자 (최소 1 최대 3개의 숫자)
		while(count != 31) {
			//com이 숫자 출력하면 랜덤한 숫자 (최소 1 최대 3개의 숫자)
			int r = (int)(Math.random()*(max - min + 1) + min);
			if(count + r >= 31) {
				System.out.println(count + "컴퓨터 패배");
				break;
			}else {
				count += r;
				System.out.println("컴퓨터 : "+ count);
			}
			
			System.out.println(" 정수 입력 : ");
			user = scan.nextInt();
			if(count + user >= 31) {
				System.out.println(count + "user 패배");
				break;
			}else {
				count += user;
				System.out.println(count);
			}		
		}
	}

}
