package day05;

import java.util.Arrays;

public class ArraySortEx1 {

	public static void main(String[] args) {
		//배열 정렬 방법
		int arr[] = new int[] {1,3,5,7,2,4,6,8};
		
		//버블정렬
		/* 옆에 인접한 값들을 비교하여 정렬하는 방식
		 * 1 3 5 7 2 4 6 8
		 * 1 3 5 2 4 6 7 [8]
		 * 1 3 2 4 5 6 [7 8]
		 * [1 2 3 4 5 6 7 8] 
		 * 
		 */
		//i < arr.length - 1 두개씩 묶어서 비교하는데 마지막 숫자 뒤에는 없기때문에
		// a = c / b = a / c = a
		for(int i = 0 ; i<arr.length - 1 ; i++) {
			for(int j = 0; j<arr.length - 1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int arr2[] = {1,3,5,7,9,2,4,6,8};
		//오름차순 정렬
		Arrays.sort(arr2);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
	

