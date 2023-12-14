package day05_test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하세요.
		 * 예
		 * 입력 : 1234
		 * 출력 : 4321
		 * 예
		 * 입력 : 1200
		 * 출력 : 0021
		 * 
		 * 1234 % 10 => 4
		 * 1234 / 10 => 123
		 * 123 % 10 => 3
		 * 123 / 10 => 12
		 * 12 % 10 => 2
		 * 12 / 10 => 1
		 * 1 % 10 => 1
		 * 1 / 10 => 0
		 */
		//오름차순, 내림차순 정렬할땐 저장해둘 3의 공간이 필요함 그게 tmp
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int arr[] = new int[10]; // 최종 출력되는 배열
		int tmp = num; //tmp에 나눈 나머지값 저장 및 tmp가 0이되면 반복문 탈출
		int count = 0; //arr의 주소가되는 거. 연산 1번끝나면 count 1 올라가고 1번지에 나머지 들어감
		
		while(tmp != 0) {
			arr[count] = tmp % 10; //tmp % 10 하면 1234 % 10 = 4인데 연산 1번 끝났으니까 4를 arr1번지에 저장
			
			++count;
			tmp /= 10; //tmp에 저장된 1234를 10으로 나누면 정수이기때문에 4는 탈락하고 123남음. 반복
		}
		//count보다 i가 작을때까지 i 증가하고 arr 0번부터 i < count까지 출력됨.
		for(int i = 0; i < count ; i++) {
			System.out.print(arr[i]);
		}
		scan.close();
	}

}
