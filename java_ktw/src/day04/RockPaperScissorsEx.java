package day04;
import java.util.Scanner;

public class RockPaperScissorsEx {

	public static void main(String[] args) {
		/* 다음 기능을 가진 가위, 바위, 보 게임 프로그램을 작성하세요.
		 * 1. 새게임
		 * 2. 기록
		 * 3. 프로그램 종료
		 * 
		 * - 새게임
		 *  - 컴퓨터가 랜덤으로 내는 가위, 바위, 보와 내가 입력한 가위, 바위, 보를
		 *    비교하여 이기면 승, 지면 패, 비기면 무로 기록함
		 *  - 바위 : R, 보 : P, 가위 : S
		 * - 기록
		 *  - 승 무 패를 순서대로 출력
		 */
		
		Scanner Scan = new Scanner(System.in);
		int num; // 컴퓨터가 내는 랜덤 가위바위보
		int a, b, c; //승 무 패 기록저장
		char R = 2, P = 3, S = 1;
		int random;
		int count, bestCount = -1;
		int menu;
		int max = 3, min = 1;
		do {
			//메뉴 출력
			System.out.println("-----------------");
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 기록");
			System.out.println("3. 프로그램 종료");
			System.out.println("-----------------");
			System.out.println("메뉴 선택 : ");
			//메뉴 선택
			menu = Scan.nextInt();
			//선택한 메뉴 출력
			switch(menu){
				case 1:
					//컴퓨터가 랜덤으로 내는 가위, 바위, 보와 내가 입력한 가위, 바위, 보를 비교하여 이기면 승, 지면 패, 비기면 무로 기록함
					//
					//랜덤한 수 생성
					random = (int)(Math.random() * (max-min+1) + min);
					System.out.println("랜덤 : " + random); //test를 위한 random
					num = min - 1;
					//정수 입력
					System.out.print("정수 입력(가위, 바위, 보 순서) : ");
					num = Scan.nextInt();
					//사용자 입력 가위바위보
					if(num == 1) {
						System.out.println("S");
					}else if(num == 2) {
						System.out.println("바위");
					}else {
						System.out.println("보");
					}
					//컴퓨터가 내는 가위바위보
					if(random == 1) {
						System.out.println("S");
					}else if(random == 2) {
						System.out.println("R");
					}else {
						System.out.println("P");
					}
					//이기면 승, 지면 패, 비기면 무로 기록함
					if(num > random) {
						System.out.println("승");
					
						break;
					}else if(num < random) {
						System.out.println("패");
						
						break;
					}else {
						System.out.println("비김");
						
						break;
					}
					/*//현재 기록을 출력
					 System.out.println("기록 : " + count);
					
					//게임이 끝났으면 현재 횟수가 최고기록 횟수보다 좋으면 
					if(bestCount == -1 || count < bestCount) {
						//최고기록 회수를 현재 횟수로 수정
						bestCount = count;
					}
					break; 
					*/
				//2번 메뉴를 선택
				case 2:
					if(bestCount == -1) {
						System.out.println("저장된 기록이 없습니다.");
						break;
					}
					System.out.println("최고 기록 : " + bestCount);
			}
			
			
		}while(menu != 3);
		System.out.println("프로그램을 종료합니다.");
		
		
		}

}
