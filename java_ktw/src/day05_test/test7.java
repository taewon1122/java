package day05_test;

public class test7 {

	public static void main(String[] args) {
		/* 1~9사이의 랜덤한 수를 3개 생성해서 배열에 저장하는 코드를 작성하세요.
		 *  3개짜리 배열을 생성하여 랜덤한 수를 저장
		 */
		/* 1~9사이의 중복되지 않은 랜덤한 수 3개를 저장하는 예제*/
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
		
		int min = 1, max = 9;
		int arr[] = new int[3];
		
		//0번지 1번지 2번지에 = i < random.length보다 낮은 횟수만큼 반복 / 랜덤수 저장한다.
		//for(int i = 0 ;i < arr.length ;i++ ) {
			//random 배열의 i 번지에
			//arr[i] = (int)(Math.random()*(max - min + 1) + min);
			//출력
			//System.out.println(arr[i] + " ");
		//}
		
		int count = 0; //반복문을 진행하면서 중복되면 저장이기때문에 증감식이 필요없어서 for문 대신 while문 사용
		
		while(count < 3) {
			//arr[count]저장 할거라서3개가 0, 1, 2까지 수행하고 3이되면 F가 되어 탈출
			int r = (int)(Math.random())*((max - min + 1) + min );
			//랜덤한 수 1-9를 만든다 근데 중복될수도 있으니 중복확인해야지?
			
			//중복 확인 duplicated = 중복되었다 라는 뜻
			/*for문 안의 boolean = count가 3이 될때까지 거짓이다.
			 * 근데
			 * arr의 i번지에 있는 저장값이 랜덤으로 생성된 r값과 같다면
			 * duplicated = 참이 되기때문에
			 * 이 for문을 벗어난다.
			 * 거짓이 된다면?
			 */
			boolean duplicated = false;
			for(int i = 0; i < count; i++)
				if(arr[i] == r) {
					duplicated = true;
					break;
				}
			// 여기가 duplicated가 거짓인게 거짓이 된다면!
			if(!duplicated) {
				arr[count] = r;
				count++;
			}
		}
		//0에서 2번지까지 arr[i]에 저장값 출력!
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

}
