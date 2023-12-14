package day05;

public class EnhancedForLoofEx1 {

	public static void main(String[] args) {
		// 1부터 5까지 저장된 배열을 향상된 for문으로 출력하는 예제
		int arr[] = new int[] {1,2,3,4,5};
		
		for(int i = 0; i<arr.length; i++) {
			int tmp = arr[i];
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		//i를 선언하지 않고 사용할 수 있어서 편리함. 배열 전체를 검색하기때문에 범위를 구할땐 사용하지 못함, 내용변경 불가능
		//향상된 for문 이용
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
	}

}
