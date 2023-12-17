package day05_test;

import java.util.Arrays;
import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		/* 1~45사이의 중복되지 않은 랜덤한 수 6개를 생성하여 출력하는 예제
		 * 
		 */
		/*
		int min = 1, max = 45;
		int arr[] = new int[6];
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1)+min);
			for(int j = 0; j<arr.length - 1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		*/
		
		int min = 1, max = 9;
		int arr[] = new int[7]; // 6자리 + 보너스번호
		int count = 0;

		while(count < arr.length) {
			int r = (int)(Math.random() * (max - min + 1) + min );
			//int i가 if에서도 발려야해서
			int i;
			for(i = 0; i < count; i++);{
				if(r == arr[i]) {
					break;
				}
			}
			//위의 for문안의 arri가 r과 같으면 다시 돌리니까 저 위의 for문을 빠져나온 r은
			//arr[count]에 저장될 수 있고 다음으로 넘어감
			if(i == count) {
				arr[count++] = r;
			}
		}
		
		int copy[] = new int[6];// 6자리를 여기다가 옮겨서 출력할거야
		System.arraycopy(arr, 0, copy, 0, 6);
		
		// arr배열 6번지 즉, 7번째 숫자 bonus에 저장.
		int bonus = arr[6];
		
		// copy배열 정렬 후 출력
		Arrays.sort(copy);
		System.out.print(" 당첨번호 : ");
		for(int i = 0 ; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		//보너스 번호 출력
		System.out.print(" [" + bonus + "]");
		
		//사용자 입력하고 저장되는 배열 user선언 후 입력 후 저장
		Scanner scan = new Scanner(System.in);
		int user[] = new int[6];
		System.out.println();
		System.out.println("6자리 번호 입력 : ");
		for(int i = 0 ;i < 6 ;i++ ) {
			user[i] = scan.nextInt();
		}
		
		//copy랑 user랑 같은거 있으면 samecount 올려서 몇등당첨인지 확인시켜줘야함
		int samecount = 0;
		for(int i = 0; i<copy.length; i++) {
			for(int j = 0; j<user.length; j++) {
				if(copy[i] == user[j]) {
					samecount++;
					break;
				}
			}
		}
		
		switch(samecount) {
		case 6:
			System.out.println("1등!");
			break;
		case 5:
			int i;
			for(i = 0;i < user.length; i++) {
				if(bonus == user[i]) {
					break;
				}
			}
			//i가 증가하면서 user.length와 같아지면 == bonus가 없다는거
			if(i == user.length) {
				System.out.println("3등!");
			} else {
				System.out.println("2등!");
			}
			break;
		case 4:
			System.out.println("4등!");
			break;
		case 3:
			System.out.println("5등!");
			break;
		default:
			System.out.println("꽝");	
		}
		scan.close();
		
		
		
	}

}
