package day05_test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생 5명 국어점수 입력
		
		//입력받는다
		Scanner scan = new Scanner(System.in);
		int []korScore = new int[5];
		
		//입력 입력받는다 korscore의 i == korscore[0~4]까지 int값을
		for(int i = 0 ;i < 5 ;i++ ) {
			System.out.print("학생" + (i+1) + " 점수 입력 : ");
			korScore[i] = scan.nextInt();
		}
		//출력 출력한다 korscore[0~4]까지 입력받았던 int값을
		for(int i = 0 ;i < 5 ;i++ ) {
			System.out.println("학생" + (i+1) + " 점수 : " + korScore[i]);
		}
		scan.close();
		
		System.out.println();// 이건 왜?..
	}
	
	//자료형 []배열
	int 자료형 []배열 = new int[];
	//자료형 배열[]
	int 자료형 배열[] = new int[];
	
	int []arr3, arr4;//int []가 다 따라가서 둘다 배열 
	int arr5[], arr6;//int만 따라가서 arr6은 int
	
	//arr1은 정수형이므로 0번지-4번지 0으로 초기화됨.
	//char = \0, boolean = false, double = 0.0
	int arr1[] = new int[5];
	
	//arr2는 0 - 4까지 순서대로 12345로 초기화됨
	//arr2 5개의 크기를 가진 배열이됨.
	int arr2[] = new int[] {1,2,3,4,5};
	//arr2 = arr3
	//배열 선언과 동시에 초기화 하는 경우만 가능
	int arr3[] = {1,2,3,4,5};
}
