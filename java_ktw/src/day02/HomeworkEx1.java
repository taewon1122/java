package day02;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/* 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90이상 ~ 100이하 : A
		 * 80이상 ~ 90미만 : B
		 * 70이상 ~ 80미만 : C
		 * 60이상 ~ 70미만 : D
		 * 60미만 : F
		 * 0보다 작거나 100보다 큰 경우 : 잘못된 점수
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("잘못된 점수.");
		}else if(score < 60) {
			System.out.println("F");
		}else if(score >= 90 || score <= 100) {
			System.out.println("A");
		}else if(score >= 80 || score < 90) {
			System.out.println("B");
		}else if(score >= 70 || score < 80) {
			System.out.println("C");
		}else if(score >= 60 || score < 70) {
			System.out.println("D");
		}
		
		
		scan.close();

	}

}
