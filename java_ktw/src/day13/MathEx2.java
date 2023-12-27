package day13;

public class MathEx2 {

	public static void main(String[] args) {
		// 주어진 실수의 소수점 3자리에서 올림한 값을 출력하는 코드를 작성하세요.
		// 주어진 실수에 10을 몇번 곱해서?
		
		double num = 1.234567;
		num *= 100;
		num = Math.ceil(num);
		num /= 100;
		System.out.println(num);
		
		//주어진 실수의 소수점 n자리에서 올림한 값을 출력하는 코드를 작성하세요.
		/* 아래와 같음.
		int n = 4;
		double num2 = 1.234567;
		int num3 = (int) Math.pow(10, n-1);
		num2 *= num3;
		num2 = Math.ceil(num2);
		num2 /= num3;
		System.out.println(num2);
		*/
		
		int n = 3;
		double num2 = 1.234567;
		num2 *= Math.pow(10, n-1);
		num2 = Math.ceil(num2);
		num2 /= Math.pow(10, n-1);
		System.out.println(num2);
	}

}
