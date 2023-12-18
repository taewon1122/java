package day07_test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swap1에서 num1이랑 num2 순서바꾸기 전후 출력
		//매개변수가 기본형(int, char 등등)이면 메서드안에서 값이 바뀌어도 원본은 안바뀜
		int num1 = 10, num2 = 20;
		System.out.print("num1 = " + num1 + ", num2 = " + num2);
		System.out.println();
		swap1(num1, num2);
		System.out.print("num1 = " + num1 + ", num2 = " + num2);
		System.out.println();
		
		int []arr1 = {1,2,3,4,5};
		int []arr2 = {10,20,30,40,50};
		//swap2에서 arr1이랑 arr2 순서바꾸기 전후 출력
		//매개변수가 참조형일 경우 값이 바뀐다.
		System.out.print("arr1 = ");
		printArray(arr1);
		System.out.print(", arr2 = ");
		printArray(arr2);
		System.out.println();
		
		swap2(arr1, arr2);
		System.out.print("arr1 = ");
		printArray(arr1);
		System.out.print(", arr2 = ");
		printArray(arr2);
		
	}

	/* 기능 : 정수 배열을 콘솔에 한 줄로 출력하는 메서드
	 * 매개변수	: 출력하려는 정수배열 => int []arr
	 * 리턴타입	: 없음 => void
	 * 메서드명	: printArray
	 */
	public static void printArray(int []arr) {
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
	}
	
	/* 기능 : 두 정수를 바꾸는 메서드
	 * 매개변수	: 바꿀 두 정수 => int num1, int num2
	 * 리턴타입	: 없음 => void
	 * 메서드명	: swap1
	 */
	public static void swap1(int num1, int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
	}
	/* 기능 : 두 정수배열을 바꾸는 메서드
	 * 배개변수	: 바꿀 두 정수 배열 => int []arr1, int []arr2
	 * 리턴타입	: 없음 => void
	 * 메서드명	: swap2
	 */

	public static void swap2(int []arr1, int []arr2) {
		for(int i = 0; i<arr1.length; i++) {
			int tmp = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = tmp;
		}
	}
}
