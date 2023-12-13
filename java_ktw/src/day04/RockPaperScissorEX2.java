package day04;

import java.util.Scanner;

public class RockPaperScissorEX2 {

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
		Scanner scan = new Scanner(System.in);
		int menu;
		char user, com;
		int random;
		int R, P, S;
		int win = 0, draw = 0, lose = 0;
		do {
			//메뉴 출력
			System.out.println("-----------------");
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 기록확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("-----------------");
			System.out.println("메뉴 선택 : ");
			//메뉴 선택
			menu = scan.nextInt();
			//선택 메뉴 동작
			switch(menu) {
			case 1:
				//컴퓨터가 내는 랜덤숫자
				random = (int)(Math.random() * 3 + 1);
				//컴퓨터가 내는 random에서 1~3까지 r p s 선정
				com = random == 1 ? 'R' : (random == 2 ? 'P':'S');
				//유저 가위바위보 입력
				System.out.println("가위(S)" + "바위(R)" + "보(P)입력 : ");
				user = scan.next().charAt(0);
				//사용자 rsp vs 컴퓨터 rsp 비교하고 승무패 출력
				//비겼을 경우
				if(com == user) {
					System.out.println("유저 : " + user + " VS 컴퓨터 : " + com);
					System.out.println("무승부!");
					++draw;
				}
				//이겼을 경우 3가지 경우가 있음
				else if((user == 'R' && com == 'S')
						||(user == 'S' && com == 'P')
						||(user == 'P' && com == 'R')) {
					System.out.println("유저 : " + user + " VS 컴퓨터 : " + com);
					System.out.println("유저 승!");
					++win;
				}
				//졌을 경우
				else {
					System.out.println("유저 : " + user + " VS 컴퓨터 : " + com);
					System.out.println("유저 패배!");
					++lose;
				}
				break;
			case 2:
				System.out.println(win + "승 "  + lose + "패 "+ draw + "무 ");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 3);

		scan.close();
	}

}
