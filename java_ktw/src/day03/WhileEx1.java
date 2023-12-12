package day03;

public class WhileEx1 {

	// while문 예제
	public static void main(String[] args) {
		// Hello World를 5번 출력하는 예제
		// 반복 횟수 잘 세기
		// 규칙성 찾기
		// 반복되는거 실행문
		
		int i = 1;
		int count = 5;
		while(i <= count) {
			System.out.println("Hello World!");
			++i;
		}
		
		/*
		System.out.println("Hello World!"); //i = 1
		System.out.println("Hello World!"); //i = 2
		System.out.println("Hello World!"); //i = 3
		System.out.println("Hello World!"); //i = 4
		System.out.println("Hello World!"); //i = 5
		*/
		
	}

}
