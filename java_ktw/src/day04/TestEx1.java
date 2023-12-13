package day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* Scanner를 이용하여 국어, 영어, 수학 성적을 입력받고,
		 * 총점과 평균을 구하는 코드를 작성하세요.
		 */
		
		//내가한거
		Scanner scan = new Scanner(System.in);
		System.out.print("성적 입력(국어) : ");
		int korScore = scan.nextInt();
		System.out.print("성적 입력(영어) : ");
		int engScore = scan.nextInt();
		System.out.print("성적 입력(수학) : ");
		int mathScore = scan.nextInt();
		
		int sum = korScore + engScore + mathScore;
		//형변환시 double로 선언하고 뒤에도 붙여주기
		double avg = (double)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		scan.close();
		
		//선생님
		/* 실행창에서 어떤 순서로 실행될건지 생각하면서 코딩하면 순서정하기가 편하다
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * 성적을 입력받기 위한 안내 문구 출력 1 *
		 * System.out.println("성적 입력(국어, 영어, 수학 순) : ");
		 * 
		 * 성적을 Scanner를 통해 입력 2 *
		 * int kor = scan.nextint();
		 * int eng = scan.nextint();
		 * int math = scan.nextint();
		 * 
		 * 성적의 총점과 평균을 계산 *
		 * int sum = kor + eng + math;
		 * double avg = (double)sum / 3;
		 * 
		 * 성적의 총점과 평균이 출력 3 *
		 * System.out.println("총점 : " + sum);
		 * System.out.println("평균 : " + avg);
		 */
		
	}

}
