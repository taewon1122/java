package day13;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		//Math.random -> 인스턴스 필요 x
		//new Random(종자값) 직접입력한다면 동일한 패턴의 랜덤수가 나타남.
		Random random = new Random();
		
		int min = 1, max = 9;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(max-min+1)+min);
		}
		
		
	}

}
