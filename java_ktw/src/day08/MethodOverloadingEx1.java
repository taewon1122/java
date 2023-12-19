package day08;

public class MethodOverloadingEx1 {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1.2,2.3));
		System.out.println(sum(1,2,3));

	}
	//두 정수의 합을 알려주는 메서드
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	//두 실수의 합을 알려주는 메서드
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	//아래 메서드는 1번 메서드와 매개변수의 개수도 같고 자료형도 같기 때문에 메서드 오버로딩 X
	//같은 갯수와 타입의 메서드가 있으면 둘중 어떤걸 사용할 지 모른다 그래서 오버로딩 X
	/*
	public static double sum(int num1, int num2) {
		return num1 + num2;
	}
	*/
	//세 정수의 합
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
}
