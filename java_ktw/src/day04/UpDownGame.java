package day04;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		/* Up Down 게임을 구현하세요.
		 * - 다음과 같은 메뉴를 가져야 합니다.
		 * 1. 새게임
		 * 2. 최고기록 확인
		 * 3. 프로그램 종료
		 * 
		 * - 새게임은 업다운 게임을 시작
		 *  - 랜덤으로 생성된 수를 맞추는 게임
		 *  - 맞췄을 때 맞춘 횟수를 출력하고 메뉴로 돌아감
		 * - 최고기록 확인 업다운 게임을 하면서 맞춘 횟수 중 가장 적은 횟수를 알려줌
		 *  - 
		 * */

		/* 메뉴선택 화면 출력
		 * 1. 선택시 UPDOWN게임 실행
		 * - 랜덤 숫자(R) 생성
		 *  - 입력된 숫자가 R보다 크면 DOWN 작으면 UP 출력
		 * - 정답입니다 출력 후 다시 메뉴로
		 * 2. 선택시 가장 적은 횟수
		 * - 맞춘 횟수 정수 COUNT에 저장
		 * - COUNT 출력 후 메뉴로
		 * 3. 프로그램 종료
		 * - 종료
		 */ 

		Scanner scan = new Scanner(System.in);
		int menu;
		int count, bestCount = -1;
		int r;
		int num;
		//반복문
		do {
			//메뉴를 출력
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 최고기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			//메뉴를 선택
			menu = scan.nextInt();
			//1번메뉴 선택
				//업다운 게임을 실행
				//랜덤한 수 생성
				//반복문
					//정수 입력
					//입력회수(정수)를 1증가
					//입력한 정수와 랜덤한 수 비교후 up/down/정답 출력
				//게임이 끝났으면 현재 횟수가 최고기록 횟수보다 좋으면 
				//최고기록 회수를 현재 횟수로 수정 
			if(menu == 1) {
				int min = 1, max = 100;
				r = (int)(Math.random() * (max-min+1) + min);
				System.out.println("랜덤 : " + r);

				num = min - 1;
				//반복문 : 조건식만 입력
				for(count = 0 ; num != r ; ++count ) {
					//정수 입력
					System.out.print("정수 : ");
					num = scan.nextInt();
					//num이 정답이 아닐때 마다 ++count
					//정수와 랜덤한 수를 비교 후 결과를 출력
					if(num > r) {
						System.out.println("Down!");
					}else if(num < r) {
						System.out.println("Up!");
					}else {
						System.out.println("정답입니다!");
						System.out.println(count);
					}
					if(bestCount == -1 || count < bestCount) {
						//최고기록 회수를 현재 횟수로 수정
						bestCount = count;	
					}
				}
			}
			//2번 메뉴를 선택
				//최고기록을 출력
			if(menu == 2) {
				System.out.println("최고기록 : " + (bestCount - 1));
			}
			//3번 메뉴를 선택
				//프로그램을 종료
		}while(menu != 3);
		System.out.println("프로그램을 종료합니다");
		
		scan.close();
		
		
	}

}
