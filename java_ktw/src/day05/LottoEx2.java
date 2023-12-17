package day05;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx2 {

	public static void main(String[] args) {
		/* 로또 당첨 번호를 랜덤으로 생성한 후(당첨번호 6자리 + 보너스번호),
		 * 사용자가 로또번호를 입력하면(로또번호 6자리 + 보너스번호) 당첨 등수를 출력하는 코드를 작성하세요.
		 */
		Scanner scan = new Scanner(System.in);

		int random[] = new int[7];
		int copy[] = new int[6];
		int bonus[] = new int[1];
		int user[] = new int[6];
		int count = 0;
		int num = 0;
		int min = 1, max = 45;
	
		//7개짜리 배열을 만들어 로또 당첨 번호를 랜덤으로 생성 - 1번 배열
		while( count < random.length ) {
			//랜덤수 생성
			int r = (int)(Math.random()*(max-min+1)+min);
			
			//중복 확인
			int i;
			for(i = 0; i<count; i++) {
				if(random[i] == r) {
					break;
				}
			}
			
			//중복되지 않으면 저장후 count 증가
			if(i == count) {
				random[count++] = r;
			}
		}
		
		//출력
		//1번에서 생성한 배열 중 0번지부터 6개를 새로운 배열에 복사 - 2번 배열
		System.arraycopy(random, 6, copy, 0, 6);
		//1번 배열 6번지에 있는 값을 보너스로 지정 - 보너스 번호
		//System.arraycopy(random, 6, bonus, 0, 1);
		//2번 배열 정렬 후 출력
		//정렬
		Arrays.sort(copy);
		for(int i = 0 ; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		//System.out.print("보너스 번호 : " + bonus[0]);
		//사용자 번호를 입력(6개)해서 배열에 저장 - 3번 배열
		System.out.println();
		System.out.println("번호 입력(6자리) : ");
		for(int i = 0 ;i<user.length ;i++ ) {	
			num = scan.nextInt();
			user[i] = num;
		}
		System.out.println("입력 번호 : " + num);
		//당첨 개수 확인(이중 반복문)
		
		//당첨 개수에 따른 등수를 출력sdaf
		scan.close();
	}

}
