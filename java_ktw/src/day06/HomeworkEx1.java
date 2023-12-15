package day06;

import java.util.Scanner;

public class HomeworkEx1 {

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
		Scanner scan = new Scanner(System.in);
		
		int S = 0;
		int B = 0;
		int O = 0;
		int num = 0;
		int count = 0; // 랜덤숫자 번지수 올리는거
		int min = 1, max = 9; // 랜덤숫자 최소 최댓값
		
		// 유저 숫자 3개 저장
		int []user = new int[3]; 
		//랜덤 숫자 3개 들어갈 배열
		int []ran = new int[3]; // 랜덤숫자 3개
		
		//중복되지 않는 랜덤 숫자 생성
		while(count < ran.length) {
			int r = (int)(Math.random()*(max - min + 1) + min);
			int i;
			for(i = 0; i<count; i++) {
				if(r == ran[i]) {
					break;
				}
			}
			if(i == count) {
				ran[count++] = r;
			}
		}
		//랜덤숫자 출력 TEST용
		int i;
		for(i = 0 ; i<ran.length; i++) {
			System.out.print(ran[i] + " ");
		}
		
		System.out.println();
		
		//반복문 S가 3이 될때까지
		while(S != 3) {
			//유저 번호 입력
			System.out.println("번호 입력(3자리) : ");
			for(i = 0 ;i<user.length ;i++ ) {	
				num = scan.nextInt();
				//입력번호 user i 에 저장
				user[i] = num;		
				//user i가 random i와 같다면?
			
				//비교후 초기화 시키고싶은데
				//FOR문으로 S B O 배열 생성하고 난뒤에 각 번지수에 값을 ++해서 FOR문에서 초기화되나?? 물어봐야 할듯
				if(user[i] == ran[i]) {
					S++; 
				}else if(user[0] == ran[i] || user[1] == ran[i] || user[2] == ran[i]) {
					B++;
				}else {
					O++;
				}
			}
			if(0 < S) {
				System.out.print(S + "S ");
			}else if(0 < B)
				System.out.print(B + "B ");
			else {
				System.out.print(O + "O ");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료.");

	}

}
