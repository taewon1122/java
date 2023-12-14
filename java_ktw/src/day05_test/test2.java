package day05_test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/* 학생 5명의 국어 성적을 입력받고, 총점과 평균을 구하는 코드를 작성하세요.
		 * 총점 = korscore[0 - 4] 더하기
		 * 합, 평균 배열 다시 만들고
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int []korScore = new int[5];
		
		for(int i = 0 ;i < 5 ;i++ ) {
			System.out.print("학생" + (i+1) + " 성적 입력 : " );
			korScore[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i = 0 ;i < 5 ;i++ ) {
			sum += korScore[i];
		}
		System.out.print(" 총점 : "  + sum);
		
		double avg = (double)sum/5;
		System.out.print(" 평균 : "  + avg);
		scan.close();
	}

}
