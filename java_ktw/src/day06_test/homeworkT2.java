package day06_test;

import java.util.Arrays;
import java.util.Scanner;

public class homeworkT2 {

	public static void main(String[] args) {
		/* 숫자 야구게임을 구현하세요.
		 * - 기록은 최대 5개. 이전 기록은 삭제
		 * - 1~9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * - S : 숫자가 있고, 위치가 같은 경우
		 * - B : 숫자가 있지만 위치가 다른 경우
		 * - O : 일치하는 수자가 하나도 없는 경우
		 * - 3S가 되면 게임이 종료
		 * 
		 * 메뉴
		 * 1. 새게임
		 * 2. 기록확인
		 * 3. 프로그램 종료
		 * 메뉴 선택 : 1
		 * 
		 * (랜덤으로 생성된 숫자 : 3 9 1)
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 입력 : 4 5 6
		 * 결과 : O
		 * 입력 : 7 9 8
		 * 결과 : 1S
		 * 입력 : 3 1 9
		 * 결과 : 1S2B
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다.
		 * 도전 횟수 : 5
		 * 현재 1등입니다. 이름을 기록하세요.
		 * 이름 : JIK
		 * 
		 * 메뉴
		 * 1. 새게임
		 * 2. 기록확인
		 * 3. 프로그램 종료
		 * 메뉴 선택 : 2
		 * --기록--
		 * 1. JIK : 5회
		 * */
		//반복문 : 프로그램 종료를 선택하기 전까지 반복
		int menu;
		Scanner scan = new Scanner(System.in);
		//5명 기록
		int records[] = new int[5];
		String names[] = new String[5];
		//몇등인지
		int rankCount = 0;
		
		//records를 가장 큰값으로 초기화
		for(int i = 0; i < records.length ; i++) {
			//정수값 중에 가장 큰 값
			records[i] = Integer.MAX_VALUE;
		}
		do {
			//메뉴를 출력
			System.out.println("메뉴");
			System.out.println("1. 새게임");
			System.out.println("2. 기록확인");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴 선택 : ");			
			//메뉴를 선택
			menu = scan.nextInt();
			//메뉴 선택에 따른 기능 실행
			switch(menu) {
			//새게임
			case 1:
				//컴퓨터가 랜덤으로 중복되지 않은 숫자 3개를 생성(1~9) 반복문 시작전에 있어야함\
				int min = 1, max = 9;
				int com[] = new int[3];
				int count = 0;
				//몇번에 맞췄는지 기록 저장하는 정수
				int recordCount = 0;
				//랜덤으로 중복되지 않은 3개의 수를 생성
				//못맞추면 계속 바뀌기때매
				while( count < com.length ) {
					//랜덤수 생성
					int r = (int)(Math.random()*(max-min+1)+min);
					//중복 확인
					int i;
					for(i = 0; i<count; i++) {
						if(com[i] == r) {
							break;
						}
					}
					//중복되지 않으면 저장후 count 증가
					if(i == count) {
						com[count++] = r;
					}
				}
				
				//출력 TEST용
				for(int i = 0 ; i<com.length; i++) {
					System.out.print(com[i] + " ");
				}
				System.out.println();
				
				int strike, ball;
				int user[] = new int[com.length];
				System.out.println("입력(3자리) : ");
				//반복문 : 맞출때까지 => 스트라이크의 개수가 3개 미만인 경우 반복
				do {
					//중복되지 않은 숫자 3개를 입력
					count = 0;
					while(count < user.length) {
						int input = scan.nextInt();
						int i;
							//중복 확인
							for(i = 0; i<count; i++) {
								if(user[i] == input) {
									break;
								}
							}
							//중복되지 않으면 저장후 count 증가
							if(i == count) {
								user[count++] = input;
							}
					}
					//스트라이크와 볼의 개수를 계산
					//0으로 초기화하고 계산을 해줘야 전 계산값에 누적이 안됨.
					strike = 0;
					ball = 0;
					for(int i = 0; i<com.length; i++) {
						for(int j = 0; j<user.length; j++) {
							//두 수가 같으면
							if(com[i] == user [j]) {
								//위치가 같으면 스트라이크
								if(i == j) {
									strike++;
								//다르면 볼
								}else {
									ball++;
								}
							}
						}
					}
						//스트라이크와 볼의 개수에 따른 결과를 출력
						if(strike != 0) {
							System.out.print(strike + "S");
						}
						if(ball != 0) {
							System.out.print(ball + "B");
						}
						if(strike == 0 && ball == 0) {
							System.out.print("O");
						}
						System.out.println();
						recordCount++;
				}while(strike < 3);
				//정답입니다. 출력
				System.out.println("정답입니다.");
				//기록을 비교하여 등수에 들면 추가
				//기록이 5개 등록이 안 된 경우나 마지막 기록이 내 기록보다 큰 경우
				if(recordCount < 5 || records[rankCount-1] > recordCount) {

					//오름 차순으로 정렬
					System.out.println(" 이름 : ");
					String name = scan.next();
					rankCount = rankCount < 5 ? rankCount + 1 : rankCount;
					int index = 0;
					//현재 기록이 들어갈 위치를 찾음
					for(int i = 0; i<rankCount ; i++) {
						if(recordCount < records[i]) {
							index = 1;
							break;
						}
					}
					//이전 기록들을 뒤로 한칸씩 밈
					for(int i = rankCount - 1 ; i > index; i--) {
						records[i] = records[i-1];
						names[i] = names[i-1];
					}
					records[index] = recordCount;
					names[index] = name;
				}
				break;
			case 2: 
				//기록확인
				if(rankCount == 0) {
					System.out.println("기록이 없습니다.");
				}else {
					for(int i = 0; i < rankCount; i++) {
						System.out.println(i + 1 + "등 : " + records[i] + "회 - " + names[i]);
					}
				}
				//맞춘 횟수 증가
				
				break;
			case 3: 
				//프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				//잘못된 메뉴
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 3);
		scan.close();
	}

}
