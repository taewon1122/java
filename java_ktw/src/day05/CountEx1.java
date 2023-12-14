package day05;

import java.util.Scanner;

public class CountEx1 {

	public static void main(String[] args) {
		/* 1에서 9사이의 정수를 5개 입력받아 각 숫자가 몇개씩 입력됐는지 출력하는 코드를 작성하세요.
		 * 1 2 3 1 2
		 * 1 : 2
		 * 2 : 2
		 * 3 : 1
		 * 4 : 0
		 * 5 : 0
		 * 6 : 0
		 * 7 : 0
		 * 8 : 0
		 * 9 : 0
		 */
		
		//사용자 정수 입력
		int user[]= new int[5];
		int count[] = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		for(int i = 0 ;i < user.length ;i++ ) {
			user[i] = scan.nextInt();
			count[user[i]]++;
		}

		//배열에 저장된 값 1-9사이 비교후[중복되는 값 있으면 count++되게] 저장하는 배열
		/*
		for(int i = 1 ;i < 10 ; i++) {
			switch(i) {
			case 0:
				System.out.println("잘못 입력한 숫자");
				break;
			case 1:
				count[1]++;
				break;
			case 2:
				count[2]++;
				break;
			case 3:
				count[3]++;
				break;
			case 4:
				count[4]++;
				break;
			case 5:
				count[5]++;
				break;
			case 6:
				count[6]++;
				break;
			case 7:
				count[7]++;
				break;
			case 8:
				count[8]++;
				break;
			case 9:
				count[9]++;
				break;
			default:
				System.out.println("잘못 입력한 숫자");
			}
			
		}
		
		//몇개 입력 됐는지 출력
		System.out.println(count[1] + count[2] + count[3] + count[4] + count[5] + count[6] + count[7] + count[8] + count[9]);
		*/
		for(int i = 1; i < count.length; i++) {
			System.out.println(i + " : " + count[i]);
		}
		scan.close();
	}

}
