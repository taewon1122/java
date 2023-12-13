package day04_test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/* 다음 기능을 가진 가위, 바위, 보 게임 프로그램을 작성하세요.
		 * 1. 새게임
		 * 2. 기록
		 * 3. 프로그램 종료
		 * 
		 * - 새게임
		 *  - 컴퓨터(com)가 랜덤으로 내는 가위, 바위, 보와 내(user)가 입력한 가위, 바위, 보를
		 *    비교하여 이기면 승, 지면 패, 비기면 무로 기록함
		 *  - 바위 : R, 보 : P, 가위 : S / 랜덤숫자 1-3을 각 r p s로 표현가능 그래서 int min = 1, max = 3;
		 * - 기록
		 * win, draw, lose
		 *  - 승 무 패를 순서대로 출력
		 */ 
		
		Scanner scan = new Scanner(System.in);
		int menu;
		char com, user;
		int win = 0, draw = 0, lose = 0;
		//int min = 1, max = 3; 해도되는데 그냥 편하게 하려고 밑에다가씀
		int R, P, S;
		int random;
		do {
			System.out.println("------------------");
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 기록");
			System.out.println("3. 프로그램 종료");
			System.out.println("------------------");
			System.out.println("메뉴 선택 : ");
			menu = scan.nextInt();
			//선택한 메뉴 실행
			switch(menu) {
			case 1:
				//랜덤한 숫자 출력
				random = (int)(Math.random() * 3 + 1 );
				com = random == 1 ? 'R' : (random == 2 ? 'P' : 'S'); //컴퓨터가 랜덤한숫자 1을 뽑으면 R 랜덤으로 2를뽑았을때 T=P F=S == 3
				System.out.println("가위(S),바위(R),보(P) 입력 : ");
				user = scan.next().charAt(0);
				// 컴퓨터는 자동생성이라 입력받지 않음. 수에 따라 어떤 r p s값을 줄건지만 정해
				// 유저는 입력을해야하기때문에 user = scan.next().charAt(0);
				// 컴퓨터랑 유저랑 붙는데 이제 싸워서 누가 이기는지 정해줘야함
				//비김 com 값과 user값이 같다면 비겨
				if(com == user) {
					System.out.println("컴퓨터 : " + com + " VS" + " 유저 : " + user);
					System.out.println("무승부!");
					//점수 더해줘야해
					++draw;
				}
				//이김 &&와 ||로 user가 이기는 경우의수 3가지 지정 
				else if((user == 'R' && com == 'S')
						||(user == 'P' && com == 'R')
						||(user == 'S' && com == 'P')) {
					System.out.println("컴퓨터 : " + com + " VS" + " 유저 : " + user);
					System.out.println("승리!");
					//점수 더해줘야해
					++win;
				}
				//짐 비기는상황과 지는상황 이외의 상황에는 짐.
				else {
					System.out.println("컴퓨터 : " + com + " VS" + " 유저 : " + user);
					System.out.println("패배!");
					//점수 더해줘야해
					++lose;
				}
				break;
			case 2:
				System.out.println(win + "승리 " + draw + "무승부 " + lose + "패배");
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 선택된 메뉴입니다.");
			}
		
		}while(menu != 3);
		scan.close();
	}	

}
