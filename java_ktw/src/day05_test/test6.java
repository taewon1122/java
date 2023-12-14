package day05_test;

public class test6 {

	public static void main(String[] args) {
		// 1부터 5까지 저장된 배열을 향상된 for문으로 출력하는 예제
		int arr[] = new int[] {1,2,3,4,5};
		
		for(int i = 0 ;i < arr.length ;i++) {
			int tmp = arr[i];
			System.out.print(tmp + " "); //띄어쓰기 할라고 tmp에 넣고 " " 했나보다
		}
		System.out.println();
		
		//for(선언 : 배열){
		// 실행
		//}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
	}

}
