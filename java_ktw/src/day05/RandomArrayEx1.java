package day05;

public class RandomArrayEx1 {

	public static void main(String[] args) {
		/* 1~9사이의 랜덤한 수를 3개 생성해서 배열에 저장하는 코드를 작성하세요.
		 * 3개짜리 배열을 생성하여 랜덤한 수를 저장
		 */
		//내가한거
		/*
		int random[] = new int[3];
		int arr [] = new int[random.length];
		
		int min = 1, max = 9;
		for(int i = 0 ; i < 4; i++) {
			random[i] = (int)(Math.random()*(max-min+1)+min);
			System.out.println(arr[i] + " ");
		}
		*/
		
		int[] arr = new int[3];
		int min = 1, max = 9;
		/*
		arr[0] = (int)(Math.random()*(max-min+1)+min);
		arr[1] = (int)(Math.random()*(max-min+1)+min);
		arr[2] = (int)(Math.random()*(max-min+1)+min);
		*/
		
		//아래 for문 합쳐도 상관없음.
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1)+min);
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
