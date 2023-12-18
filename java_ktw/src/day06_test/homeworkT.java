package day06_test;

import java.util.Arrays;
import java.util.Scanner;

public class homeworkT {

	public static void main(String[] args) {
		/* 숫자 야구게임을 구현하세요.
		 * - 1-9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * - S : 숫자가 있고, 위치가 같은 경우
		 * - B : 숫자가 있지만 위치가 다른 경우
		 * - O : 일치하는 숫자가 하나도 없는 경우
		 * - 3S가 되면 게임이 종료
		 *  
		 * 예시 
		 * 랜덤으로 생성된 숫자 : 3 9 1
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 입력 : 4 5 6
		 * 결과 : 0
		 * 입력 : 7 9 8
		 * 결과 : 1S
		 * 입력 : 3 1 9
		 * 결과 : 1S2B
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다.
		 * 프로그램 종료
		 */
		
		//컴퓨터가 랜덤으로 중복되지 않은 숫자 3개를 생성(1~9) 반복문 시작전에 있어야함\
		int min = 1, max = 9;
		int com[] = new int[3];
		int count = 0;
		
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
		Scanner scan = new Scanner(System.in);
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
		}while(strike < 3);
		System.out.println("정답입니다.");
		//정답입니다. 출력
		scan.close();

		}
	
	}