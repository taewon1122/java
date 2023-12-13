package day04_test;

import java.util.Scanner;

public class Test7 {

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
		 * - 종료while();
		 */ 
		Scanner scan = new Scanner(System.in);
		int menu;
		int count, bestCount = -1;
		int random;
		int num;
		do {
			System.out.println("---------------");
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 최고기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("---------------");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				//랜덤숫자 생성
				int min = 1, max = 100;
				random = (int)(Math.random()*(max - min +1) + min );
				System.out.println("랜덤 : " + random);
				num = min - 1;
				
				count = 0;
				//숫자 입력해
				do {
					System.out.println(" 정수 입력(1-100) : ");
					num = scan.nextInt();
					count++;
					//입력숫자 랜덤보다 크면 down
					if(num < random) {
						System.out.println(" UP ! ");
					}else if(num > random) {
						System.out.println(" Down ! ");
					}else {
						System.out.println(" 정답입니다 ! ");
					}
				}while(num != random);
				System.out.println("기록 : " + count);
				//.
				if(bestCount == -1 || count < bestCount) {
					bestCount = count;
				}
				break;
			case 2:
				if(bestCount == -1) {
					System.out.println("플레이한 기록이 없습니다.");
					break;
				}
				System.out.println("최고 기록 : " + bestCount);
				break;
			}
			
		}while(menu != 3);
		System.out.println("---------------------");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("---------------------");
		scan.close();
				

	}

}
